package com.klpr.biz.r_review.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.r_review.R_ReviewDAO;
import com.klpr.biz.r_review.R_ReviewService;
import com.klpr.biz.r_review.R_ReviewVO;
import com.klpr.biz.r_review.R_Review_RankingDAO;
import com.klpr.biz.r_review.R_Review_RankingVO;

@Service("r_reviewService")
public class R_ReviewServiceImpl implements R_ReviewService {

	@Autowired
	private R_ReviewDAO r_reviewDAO;
	
	@Autowired
	private R_Review_RankingDAO r_review_rankingDAO;
	
	@Override
	public void insertR_review(R_ReviewVO vo) {
		r_reviewDAO.insertR_Review(vo);
	}

	@Override
	public R_ReviewVO getR_Review(R_ReviewVO vo) {
		return r_reviewDAO.getR_Review(vo);
	}

	@Override
	public List<R_ReviewVO> getR_ReviewList(R_ReviewVO vo) {
		return r_reviewDAO.getR_ReviewList(vo);
	}

	@Override
	public List<R_Review_RankingVO> best_Rtop5(R_Review_RankingVO vo) {
		return r_review_rankingDAO.best_Rtop5(vo);
	}

	@Override
	public List<R_Review_RankingVO> greatest_Rtop5(R_Review_RankingVO vo) {
		return r_review_rankingDAO.greatest_Rtop5(vo);
	}

}
