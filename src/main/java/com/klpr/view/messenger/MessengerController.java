package com.klpr.view.messenger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.messenger.MessengerService;
import com.klpr.biz.messenger.MessengerVO;

@Controller
public class MessengerController {

	@Autowired
	private MessengerService messengerService;

	@RequestMapping(value = "/chat.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String refreshList(@ModelAttribute("messenger") MessengerVO vo, @ModelAttribute("msgno") MessengerVO mvo,
			Model model, HttpServletRequest request) {
		System.out.println("controller로 채팅 리프레쉬 실행");

//		messengerService.getMsg(vo);
		model.addAttribute("msgno", messengerService.getMsg(mvo));

		messengerService.helpersMsgRead(vo); // 헬퍼 스테이트 업뎃
		messengerService.helpeesMsgRead(vo); // 헬피 스테이트 업뎃
		model.addAttribute("messengerList", messengerService.getMessageList(vo)); // 리스트 셀렉트

//		String referer = request.getHeader("Referer");
//		System.out.println(referer);
//		String sub_referer = referer.substring(0, 21) + "/MyPageDetailProcess.jsp";

		return "MyPageDetailProcess.jsp";
	}

//	@RequestMapping(value = "/chat.do", method = { RequestMethod.POST })
//	public String sendMsg(@ModelAttribute("messenger") MessengerVO vo, Model model) {
//		System.out.println("controller로 메시지 입력");
//
////		if(userVO.getUno() == messengerVO.getRno()) {	// 유저가 헬퍼인 경우
//		messengerService.helperSendMsg(vo);
////		}
////		else if(userVO.getUno() == messengerVO.getEno()) {	// 유저가 헬피인 경우
//		messengerService.helpeeSendMsg(vo);
////		}
//
//		return "chatRoom.jsp";
//	}

	@RequestMapping(value = "/sendHelperMsg.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String sendHelperMsg(@ModelAttribute("messenger") MessengerVO vo, Model model, HttpServletRequest request) {
		System.out.println("controller로 메시지 입력");

		messengerService.helperSendMsg(vo);

		String referer = request.getHeader("Referer");
		System.out.println(referer);

		return "redirect:" + referer;
	}

	@RequestMapping(value = "/sendHelpeeMsg.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String sendHelpeeMsg(@ModelAttribute("messenger") MessengerVO vo, Model model, HttpServletRequest request) {
		System.out.println("controller로 메시지 입력");

		messengerService.helpeeSendMsg(vo);

		String referer = request.getHeader("Referer");
		System.out.println(referer);

		return "redirect:" + referer;
	}

//	@RequestMapping(value = "/chat.do", method = {RequestMethod.POST})
//	public String helpersMsgRead(@ModelAttribute("messenger") MessengerVO vo, Model model) {
//		System.out.println("controller로 rstate 업뎃");
//
//		messengerService.helpersMsgRead(vo);
//		
//		return "chat.jsp";
//	}

//	@RequestMapping(value = "/chat.do", method = {RequestMethod.POST})
//	public String helpeeSendMsg(@ModelAttribute("messenger") MessengerVO vo, Model model) {
//		System.out.println("controller로 헬피가 메시지 입력");
//		
//		messengerService.helpeeSendMsg(vo);
//		
//		return "chatRoom.jsp";
//	}

//	@RequestMapping(value = "/chat.do", method = {RequestMethod.POST})
//	public String helpeesMsgRead(@ModelAttribute("messenger") MessengerVO vo, Model model) {
//		System.out.println("controller로 estate 업뎃");
//
//		messengerService.helpeesMsgRead(vo);
//		
//		return "chat.jsp";
//	}
}
