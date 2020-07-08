package com.klpr.biz.e_review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.e_review.E_ReviewDAO;
import com.klpr.biz.e_review.E_ReviewVO;

@Repository("e_reviewDAO")
public class E_ReviewDAOImpl implements E_ReviewDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insertE_Review(E_ReviewVO vo) {
		System.out.println("===> MyBatis로 E_ReviewDAOImpl에서 insertE_Review() 기능 처리");
		mybatis.insert("E_ReviewDAO.insertE_Review", vo);
	}

	@Override
	public E_ReviewVO getE_Review(E_ReviewVO vo) {
		System.out.println("===> MyBatis로 E_ReviewDAOImpl에서 getE_Review() 기능 처리");
		return (E_ReviewVO) mybatis.selectOne("E_ReviewDAO.getE_Review", vo);
	}

	@Override
	public List<E_ReviewVO> getE_ReviewList(E_ReviewVO vo) {
		System.out.println("===> MyBatis로 E_ReviewDAOImpl에서 getE_ReviewList() 기능 처리");
		return mybatis.selectList("E_ReviewDAO.getE_ReviewList", vo);
	}
	
	
}
