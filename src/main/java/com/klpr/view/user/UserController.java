package com.klpr.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.matching.MatchingVO;
import com.klpr.biz.user.UserService;
import com.klpr.biz.user.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MatchingService matchingService;

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		return "main.do";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, HttpSession session, MatchingVO mvo, HttpServletRequest request) {
		System.out.println("로그인 인증 처리");

		if (vo.getEmail() == null || vo.getEmail() == "") {
			throw new IllegalArgumentException("이메일 반드시 입력해야 됩니다.");
		}

		UserVO user = userService.getUser(vo);
		if (user != null) {
			session.setAttribute("userName", user.getName());
			session.setAttribute("userNumber", user.getUno());
			session.setAttribute("userMoney", user.getMoney());
			session.setAttribute("userGender", user.getGender());
			session.setAttribute("userPhone", user.getPhone());
			session.setAttribute("loginUser", user);
			mvo.setRcno(user.getUno());
			mvo = matchingService.matchingAlert(mvo);
			if(mvo != null) {
				session.setAttribute("matchingAlert", mvo.getCount());				
			}
			System.out.println(user.toString());
//			return "getMain.do";
			String referer = request.getHeader("Referer");
			System.out.println(referer);
			if(referer.equals("https://www.klper.com/logout.do")) {
				return "main.do";
			}
			if(referer.equals("https://www.klper.com/join.do")) {
				return "main.do";
			}
			if(referer.equals("https://www.klper.com/join")) {
				return "main.do";
			}
			if(referer.equals("https://klper.com/join")) {
				return "main.do";
			}
			if(referer.equals("https://klper.com/join.do")) {
				return "main.do";
			}
			if(referer.equals("https://klper.com/logout.do")) {
				return "main.do";
			}
			return "redirect:" + referer;
		} else {
			return "main.do";
		}
	}

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");

		session.invalidate();
		return "main.do";
	}

	@RequestMapping(value = "/join.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(UserVO vo) {
		System.out.println(vo.toString());
		if (vo.getEmail() == null) {
			System.out.println("회원가입 화면으로 이동");
			return "signUp.jsp";
		} else {
			System.out.println("회원가입 됨. DB에 저장.");
			// DB에 저장
			userService.insertUser(vo);
			return "main.do";
		}
	}

}
