package com.klpr.view.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.e_review.E_ReviewService;
import com.klpr.biz.e_review.E_ReviewVO;
import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.matching.MatchingVO;
import com.klpr.biz.r_review.R_ReviewService;
import com.klpr.biz.r_review.R_ReviewVO;

@Controller
public class ReviewController {

	@Autowired
	private E_ReviewService e_reviewService;

	@Autowired
	private R_ReviewService r_reviewService;

	@Autowired
	private MatchingService matchingService;

	@RequestMapping(value = "/insertE_Review.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertE_Review(@ModelAttribute("e_review") E_ReviewVO vo,
			@ModelAttribute("matching") MatchingVO mvo) {
		System.out.println("E_ReviewController의 insertE_Review 실행");
		System.out.println(vo.toString());
		System.out.println(mvo.toString());
		mvo = matchingService.getENOMatchingReview(mvo);
		vo.setEno(mvo.getEno());
		matchingService.updateState(mvo);

		// DB에 헬피가 받는 리뷰 저장
		e_reviewService.insertE_Review(vo);
		return "matchHistory.do";
	}

	@RequestMapping(value = "/r_review.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertR_Review(@ModelAttribute("r_review") R_ReviewVO vo,
			@ModelAttribute("matching") MatchingVO mvo) {
		System.out.println("R_ReviewController의 insertR_Review 실행");
		System.out.println(vo.toString());
		System.out.println(mvo.toString());
		mvo = matchingService.getRNOMatchingReview(mvo);
		vo.setRno(mvo.getRno());
		
		matchingService.updateState(mvo);

		// DB에 헬피가 받는 리뷰 저장
		r_reviewService.insertR_review(vo);
		return "matchHistory.do";
	}
}
