package com.klpr.biz.seoul.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.seoul.SeoulDAO;
import com.klpr.biz.seoul.SeoulVO;

@Repository("SeoulDAO")
public class SeoulDAOImpl implements SeoulDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public List<SeoulVO> getSeoulList(SeoulVO vo) {
		System.out.println("===> MyBatis로 SeoulDAOImpl에서 getSeoulList() 기능처리");
		return mybatis.selectList("SeoulDAO.getSeoulList", vo);
	}

}
