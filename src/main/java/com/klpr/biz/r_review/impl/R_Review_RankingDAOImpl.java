package com.klpr.biz.r_review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.r_review.R_Review_RankingDAO;
import com.klpr.biz.r_review.R_Review_RankingVO;

@Repository("r_review_rankingDAO")
public class R_Review_RankingDAOImpl implements R_Review_RankingDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public List<R_Review_RankingVO> best_Rtop5(R_Review_RankingVO vo) {
		System.out.println("===> MyBatis로 R_ReviewRankingDAOImpl에서 best_Rtop5() 기능 처리");
		return mybatis.selectList("R_Review_RankingDAO.best_Rtop5", vo);
	}

	@Override
	public List<R_Review_RankingVO> greatest_Rtop5(R_Review_RankingVO vo) {
		System.out.println("===> MyBatis로 R_ReviewRankingDAOImpl에서 greatest_Rtop5() 기능 처리");
		return mybatis.selectList("R_Review_RankingDAO.greatest_Rtop5", vo);
	}
	
}
