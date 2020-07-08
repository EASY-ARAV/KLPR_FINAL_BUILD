package com.klpr.biz.withdraw.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.withdraw.WithdrawDAO;
import com.klpr.biz.withdraw.WithdrawVO;

@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insertWithdrawBank(WithdrawVO vo) {
		System.out.println("===> MyBatis로 WithdrawDAOImpl에서 insertWithdrawBank() 기능처리");
		mybatis.insert("WithdrawDAO.insertWithdrawBank", vo);
	}

	@Override
	public void insertWithdrawKakao(WithdrawVO vo) {
		System.out.println("===> MyBatis로 WithdrawDAOImpl에서 insertWithdrawKakao() 기능처리");
		mybatis.insert("WithdrawDAO.insertWithdrawKakao", vo);
	}
}
