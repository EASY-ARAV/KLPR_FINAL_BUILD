package com.klpr.view.mypage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.file.FileService;
import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.user.UserService;
import com.klpr.biz.user.UserVO;
import com.klpr.biz.withdraw.WithdrawService;
import com.klpr.biz.withdraw.WithdrawVO;

@Controller
public class MyPageController {
//	@Autowired
//	private HelpeeService helpeeService;
//
//	@Autowired
//	private HelperService helperService;

	@Autowired
	MatchingService matchingService;

	@Autowired
	UserService userService;

	@Autowired
	WithdrawService withdrawService;

	@Autowired
	FileService fileService;

	@RequestMapping(value = "/myPage.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String myPageView(HttpSession session, Model model/* , E_ReviewVO evo, R_ReviewVO rvo */,
			@ModelAttribute("user") UserVO vo, HttpServletRequest request) {
		System.out.println("마이페이지로 이동");
		if (session.getAttribute("userMoney") != null)
			session.removeAttribute("userMoney");
		UserVO user = (UserVO) session.getAttribute("loginUser");

		// file 업로드 (프로필 사진)
		model.addAttribute("file", fileService.returnFile(user.getUno(), request));

		System.out.println(user.toString());
		model.addAttribute("userMoney", user.getMoney());
//		MatchingService.setMatchingState(user, model);
//		MatchingDAOImpl matchingDAO = new MatchingDAOImpl();
		matchingService.setMatchingState(user, session);
		session.setAttribute("userMoney", user.getMoney());
//		model.addAttribute("helpeeCountList", helpeeService.getE_ReviewCountList(evo));
//		model.addAttribute("helperCountList", helperService.getR_ReviewCountList(rvo));
		return "myPage.jsp";
	}

	@RequestMapping(value = "/payment.do", method = RequestMethod.GET)
	public String paymentView() {
		System.out.println("결제페이지로 이동");
		return "payment.jsp";
	}

	@RequestMapping(value = "/payment.do", method = { RequestMethod.POST })
	public String payment(HttpSession session) {
		UserVO vo = (UserVO) session.getAttribute("loginUser");
		session.setAttribute("loginUser", vo);
		return "payment.jsp";
	}

//	@RequestMapping(value = "/myInfoEdit.do", method = { RequestMethod.GET })
//	public String goToEdit() {
//		System.out.println("정보수정 페이지로 이동");
//		return "myInfoEdit.jsp";
//	}
//
//	@RequestMapping(value = "/myInfoEdit.do", method = { RequestMethod.POST })
//	public String myInfoEdit(UserVO vo, HttpSession session) {
//		System.out.println("유저정보수정기능");
//		UserVO uvo = (UserVO) session.getAttribute("loginUser");
//		vo.setUno(uvo.getUno());
//		vo.setEmail(uvo.getEmail());
//		System.out.println(uvo.toString());
//		System.out.println(vo.toString());
//		matchingService.updateUser(vo);
//		UserVO user = userService.getUser(vo);
//		if (user != null) {
//			session.setAttribute("userName", user.getName());
//			session.setAttribute("userNumber", user.getUno());
//			session.setAttribute("userMoney", user.getMoney());
//			session.setAttribute("userGender", user.getGender());
//			session.setAttribute("userPhone", user.getPhone());
//			session.setAttribute("loginUser", user);
//			System.out.println(user.toString());
//		}
//		return "myPage.do";
//	}

	@RequestMapping(value = "/withdrawRequest.do", method = { RequestMethod.GET })
	public String withdrawRequestView(@ModelAttribute("withdraw") WithdrawVO vo) {
		return "withdrawRequest.jsp";
	}

	@RequestMapping(value = "/withdrawRequestUsingBANK.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String withdrawRequestUsingBANK(@ModelAttribute("withdraw") WithdrawVO vo, HttpSession session, UserVO uvo) {

		// 인출 신청 내역에 insert해줌.
		System.out.println(vo.toString());
		withdrawService.insertWithdrawBank(vo);

		// 세션에 있는 userMoney를 받아와서 인출신청한 금액을 빼고 유저정보에 넣어줌.
		UserVO user = (UserVO) session.getAttribute("loginUser");
		uvo.setEmail(user.getEmail());

		int userMoney = (int) session.getAttribute("userMoney");
		int withdrawMoney = vo.getWmoney();
		uvo.setMoney(userMoney - withdrawMoney);
		uvo.setUno(vo.getUno());
		userService.spendMoney(uvo);
		System.out.println(uvo.toString());
		// session에 다시 userMoney 쏴줌

		session.setAttribute("userMoney", uvo.getMoney());
		user.setMoney(uvo.getMoney());
		session.setAttribute("loginUser", user);

		return "myPage.do";
	}

	@RequestMapping(value = "/withdrawRequestUsingBANKAll.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String withdrawRequestUsingBANKAll(@ModelAttribute("withdraw") WithdrawVO vo, HttpSession session,
			UserVO uvo) {

		// 인출 신청 내역에 insert해줌.
		System.out.println(vo.toString());
		withdrawService.insertWithdrawBank(vo);

		// 세션에 있는 userMoney를 받아와서 인출신청한 금액을 빼고 유저정보에 넣어줌.
		UserVO user = (UserVO) session.getAttribute("loginUser");
		uvo.setEmail(user.getEmail());
		// 전액 출금이기 때문에 머니 0로 만들어줌.
		uvo.setMoney(0);
		uvo.setUno(vo.getUno());
		userService.spendMoney(uvo);
		System.out.println(uvo.toString());

		// session에 다시 userMoney 쏴줌
		session.setAttribute("userMoney", uvo.getMoney());
		user.setMoney(uvo.getMoney());
		session.setAttribute("loginUser", user);

		return "myPage.do";
	}

	@RequestMapping(value = "/withdrawRequestUsingKakao.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String withdrawRequestUsingKakao(@ModelAttribute("withdraw") WithdrawVO vo, HttpSession session,
			UserVO uvo) {

		// 인출 신청 내역에 insert해줌.
		System.out.println(vo.toString());
		withdrawService.insertWithdrawKakao(vo);

		// 세션에 있는 userMoney를 받아와서 인출신청한 금액을 빼고 유저정보에 넣어줌.
		UserVO user = (UserVO) session.getAttribute("loginUser");
		uvo.setEmail(user.getEmail());

		int userMoney = (int) session.getAttribute("userMoney");
		int withdrawMoney = vo.getWmoney();
		uvo.setMoney(userMoney - withdrawMoney);
		uvo.setUno(vo.getUno());
		userService.spendMoney(uvo);
		System.out.println(uvo.toString());
		// session에 다시 userMoney 쏴줌

		session.setAttribute("userMoney", uvo.getMoney());
		user.setMoney(uvo.getMoney());
		session.setAttribute("loginUser", user);

		return "myPage.do";
	}

	@RequestMapping(value = "/withdrawRequestUsingKakaoAll.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String withdrawRequestUsingKakaoAll(@ModelAttribute("withdraw") WithdrawVO vo, HttpSession session,
			UserVO uvo) {

		// 인출 신청 내역에 insert해줌.
		System.out.println(vo.toString());
		withdrawService.insertWithdrawKakao(vo);

		// 세션에 있는 userMoney를 받아와서 인출신청한 금액을 빼고 유저정보에 넣어줌.
		UserVO user = (UserVO) session.getAttribute("loginUser");
		uvo.setEmail(user.getEmail());
		// 전액 출금이기 때문에 머니 0로 만들어줌.
		uvo.setMoney(0);
		uvo.setUno(vo.getUno());
		userService.spendMoney(uvo);
		System.out.println(uvo.toString());

		// session에 다시 userMoney 쏴줌
		session.setAttribute("userMoney", uvo.getMoney());
		user.setMoney(uvo.getMoney());
		session.setAttribute("loginUser", user);

		return "myPage.do";
	}

}
