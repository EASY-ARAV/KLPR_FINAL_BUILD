package com.klpr.view.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klpr.biz.file.FileVO;
import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.user.UserService;
import com.klpr.biz.user.UserVO;

@Controller
public class FileController {

	@Autowired
	MatchingService matchingService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/myInfoEdit.do", method = RequestMethod.GET)
	public ModelAndView fileForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("myInfoEdit.jsp");
		return mv;
	}

	@RequestMapping(value = "/myInfoEdit.do", method = RequestMethod.POST)
	public String fileSubmit(FileVO fvo, @ModelAttribute("user") UserVO vo, HttpSession session,
			HttpServletRequest request) {
		System.out.println("유저정보수정기능");
		UserVO uvo = (UserVO) session.getAttribute("loginUser");
		vo.setUno(uvo.getUno());
		vo.setEmail(uvo.getEmail());
		System.out.println(uvo.toString());
		System.out.println(vo.toString());
		matchingService.updateUser(vo);
		UserVO user = userService.getUser(vo);
		if (user != null) {
			session.setAttribute("userName", user.getName());
			session.setAttribute("userNumber", user.getUno());
			session.setAttribute("userMoney", user.getMoney());
			session.setAttribute("userGender", user.getGender());
			session.setAttribute("userPhone", user.getPhone());
			session.setAttribute("loginUser", user);
			System.out.println(user.toString());
		}
		System.out.println(fvo.toString());
		MultipartFile uploadfile = fvo.getUploadfile();
		vo = (UserVO) session.getAttribute("loginUser");
		if (uploadfile != null) {
			String fileName = uploadfile.getOriginalFilename();
			fvo.setFileName(fileName);
			try {
				Path relativePath = Paths.get("");
				String path2 = session.getServletContext().getRealPath("/");
				System.out.println(path2);
				String path = relativePath.toAbsolutePath().toString();
				System.out.println(path);
				File file = new File(
						session.getServletContext().getRealPath("/images/" + fileName + ".png"));
				File newName = new File(
						session.getServletContext().getRealPath("/images/" + vo.getUno() + ".png"));
//				File file = new File(
//						"/var/lib/tomcat9/webapps/ROOT/images/"
//								+ fileName + ".png");
//				File newName = new File(
//						"/var/lib/tomcat9/webapps/ROOT/images/"
//								+ vo.getUno() + ".png");
				file.renameTo(newName);
				uploadfile.transferTo(newName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return "myPage.do";
	}
}
