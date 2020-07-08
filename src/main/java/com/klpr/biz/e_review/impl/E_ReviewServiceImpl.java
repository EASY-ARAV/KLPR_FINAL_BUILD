package com.klpr.biz.e_review.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.e_review.E_ReviewDAO;
import com.klpr.biz.e_review.E_ReviewService;
import com.klpr.biz.e_review.E_ReviewVO;
import com.klpr.biz.e_review.E_Review_RankingDAO;
import com.klpr.biz.e_review.E_Review_RankingVO;

@Service("e_reviewService")
public class E_ReviewServiceImpl implements E_ReviewService {

	@Autowired
	private E_ReviewDAO e_reviewDAO;
	
	@Autowired
	private E_Review_RankingDAO e_review_rankingDAO;

	@Override
	public void insertE_Review(E_ReviewVO vo) {
		e_reviewDAO.insertE_Review(vo);
	}

	@Override
	public E_ReviewVO getE_Review(E_ReviewVO vo) {
		return e_reviewDAO.getE_Review(vo);
	}

	@Override
	public List<E_ReviewVO> getE_ReviewList(E_ReviewVO vo) {
		return e_reviewDAO.getE_ReviewList(vo);
	}

	@Override
	public List<E_Review_RankingVO> greatest_Etop5(E_Review_RankingVO vo) {
		return e_review_rankingDAO.greatest_Etop5(vo);
	}

	
}
