package com.klpr.biz.r_review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.r_review.R_ReviewDAO;
import com.klpr.biz.r_review.R_ReviewVO;

@Repository("r_reviewDAO")
public class R_ReviewDAOImpl implements R_ReviewDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public void insertR_Review(R_ReviewVO vo) {
		System.out.println("===> MyBatis로 R_ReviewDAOImpl에서 insertR_Review() 기능 처리");
		mybatis.insert("R_ReviewDAO.insertR_Review", vo);
	}

	@Override
	public R_ReviewVO getR_Review(R_ReviewVO vo) {
		System.out.println("===> MyBatis로 R_ReviewDAOImpl에서 getR_Review() 기능 처리");
		return (R_ReviewVO) mybatis.selectOne("R_ReviewDAO.getR_Review", vo);
	}

	@Override
	public List<R_ReviewVO> getR_ReviewList(R_ReviewVO vo) {
		System.out.println("===> MyBatis로 R_ReviewDAOImpl에서 getR_ReviewList() 기능 처리");
		return mybatis.selectList("R_ReviewDAO.getR_ReviewList", vo);
	}

}
