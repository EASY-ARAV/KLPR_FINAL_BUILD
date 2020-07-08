package com.klpr.view.mainpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.e_review.E_ReviewService;
import com.klpr.biz.e_review.E_Review_RankingVO;
import com.klpr.biz.r_review.R_ReviewService;
import com.klpr.biz.r_review.R_Review_RankingVO;

@Controller
public class MainController {
	
	@Autowired
	private E_ReviewService e_reviewService;
	
	@Autowired
	private R_ReviewService r_reviewService;

	@RequestMapping(value = "/main.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String mainView(@ModelAttribute("e_review_ranking") E_Review_RankingVO evo, 
			@ModelAttribute("r_review_ranking") R_Review_RankingVO rvo, Model model) {
		System.out.println("메인 화면으로 이동");
		
		model.addAttribute("best_rtop5", r_reviewService.best_Rtop5(rvo));
		model.addAttribute("greatest_rtop5", r_reviewService.greatest_Rtop5(rvo));
		model.addAttribute("greatest_etop5", e_reviewService.greatest_Etop5(evo));
		
		return "main.jsp";
	}
}
