package com.klpr.biz.language.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.language.LanguageDAO;
import com.klpr.biz.language.LanguageVO;

@Repository("LanguageDAO")
public class LanguageDAOImpl implements LanguageDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public List<LanguageVO> getLanguageList(LanguageVO vo) {
		System.out.println("===> MyBatis로 LanguageDAOImpl에서 getLanguageList() 기능처리");
		return mybatis.selectList("LanguageDAO.getLanguageList", vo);
	}

}
