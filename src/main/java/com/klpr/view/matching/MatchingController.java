package com.klpr.view.matching;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.matching.MatchingVO;
import com.klpr.biz.matching.impl.MatchingDAOImpl;
import com.klpr.biz.messenger.MessengerService;
import com.klpr.biz.messenger.MessengerVO;
import com.klpr.biz.user.UserService;
import com.klpr.biz.user.UserVO;

@Controller
@SessionAttributes("matching")
public class MatchingController {
	@Autowired
	private MatchingService matchingService;

	@Autowired
	private UserService userService;

	@Autowired
	private MessengerService messengerService;

	@RequestMapping(value = "/incomingRequest.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String getIncomingList(HttpSession session, Model model, Model model2) {
		UserVO vo = (UserVO) session.getAttribute("loginUser");
		System.out.println(vo.toString());
		model.addAttribute("ReceivedRequestList", matchingService.getMatchingList0(vo));
		model2.addAttribute("SendedRequestList", matchingService.getMatchingList1(vo));

		return "incomingRequest.jsp";
	}

	@RequestMapping(value = "/myPageDetailProcess.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String getPendingList(HttpSession session, Model model, @ModelAttribute("messenger") MessengerVO msvo,
			@ModelAttribute("msgno") MessengerVO mvo, String messengerGO) {
		UserVO vo = (UserVO) session.getAttribute("loginUser");
		System.out.println(vo.toString());
		model.addAttribute("WaitingList", matchingService.getMatchingList2(vo));
		model.addAttribute("PaidList", matchingService.getMatchingList3(vo));
		model.addAttribute("EndedList", matchingService.getMatchingList4(vo));

		System.out.println("messengerGO : " + messengerGO);
		if (messengerGO != null) {
			model.addAttribute("msgno", messengerService.getMsg(mvo));
			messengerService.helpersMsgRead(msvo); // 헬퍼 스테이트 업뎃
			messengerService.helpeesMsgRead(msvo); // 헬피 스테이트 업뎃
			model.addAttribute("messengerList", messengerService.getMessageList(msvo)); // 리스트 셀렉트
			model.addAttribute("msgCHECK", "CHECK");
		}
		return "MyPageDetailProcess.jsp";
	}

	@RequestMapping(value = "/matchHistory.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String getHistoryList(HttpSession session, Model model) {
		UserVO vo = (UserVO) session.getAttribute("loginUser");
		System.out.println(vo.toString());
		model.addAttribute("CompletedList", matchingService.getMatchingList5(vo));
		model.addAttribute("RejectedList", matchingService.getRejectedList(vo));
		return "matchHistory.jsp";
	}

	@RequestMapping(value = "/updateState.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String updatingState(MatchingVO mvo, int mstate, int mno, MatchingDAOImpl matchingDAO, UserVO uvo,
			HttpSession session, String serviceCharge) {
		System.out.println(mno + " " + mstate);
		mvo.setMno(mno);
		mvo.setMstate(mstate);
		if (mstate == 2) {
			uvo.setMoney(uvo.getMoney() - Integer.parseInt(serviceCharge));
			uvo.setUno(uvo.getUno());
			userService.spendMoney(uvo);
			
			UserVO user = (UserVO) session.getAttribute("loginUser");
			user.setMoney(uvo.getMoney());
			session.setAttribute("userMoney", user.getMoney());
			session.setAttribute("loginUser", user);
			System.out.println(uvo.toString());
		}
		System.out.println(mvo.toString());
		if (mstate == 1) {
			matchingService.updateState(mvo);
			System.out.println(mvo.toString());
			mvo = matchingService.matchingAlert(mvo);
			if (mvo == null) {
				session.setAttribute("matchingAlert", 0);
			} else {
				session.setAttribute("matchingAlert", mvo.getCount());
			}
		} else {
			matchingService.updateState(mvo);
		}
		return "myPage.do";
	}

	@RequestMapping(value = "/sendRequest.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String helperSendRequest(MatchingVO vo) {
		System.out.println("매칭테이블 insert됨. mstate=1");

		// DB에 저장
		matchingService.insertMatching(vo);
		return "myPage.do";
	}

	@RequestMapping(value = "/rejectRequest.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String rejectRequest(MatchingVO vo, int mno) {
		vo.setMno(mno);
		matchingService.rejectMatching(vo);
		return "incomingRequest.do";
	}

	@RequestMapping(value = "/cancelRequest.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String cancelRequest(MatchingVO vo, int mno) {
		vo.setMno(mno);
		matchingService.cancelMatching(vo);
		return "incomingRequest.do";
	}

}
