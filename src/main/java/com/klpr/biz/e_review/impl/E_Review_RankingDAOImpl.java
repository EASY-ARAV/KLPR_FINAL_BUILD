package com.klpr.biz.e_review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.e_review.E_Review_RankingDAO;
import com.klpr.biz.e_review.E_Review_RankingVO;

@Repository("e_review_rankingDAO")
public class E_Review_RankingDAOImpl implements E_Review_RankingDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public List<E_Review_RankingVO> greatest_Etop5(E_Review_RankingVO vo) {
		System.out.println("===> MyBatis로 E_Review_RankingDAOImpl에서 greatest_Etop5() 기능 처리");
		return mybatis.selectList("E_Review_RankingDAO.greatest_Etop5", vo);
	}
	
}
