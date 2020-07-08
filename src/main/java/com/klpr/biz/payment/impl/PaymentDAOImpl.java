package com.klpr.biz.payment.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.payment.PaymentDAO;
import com.klpr.biz.payment.PaymentVO;

@Repository("PaymentDAO")
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insert_KakaoPayOrder(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 insert_KakaoPayOrder() 기능처리");
		mybatis.insert("PaymentDAO.insert_KakaoPayOrder", vo);
	}

	@Override
	public PaymentVO select_kakaoPayOrder(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 select_kakaoPayOrder() 기능처리");
		System.out.println(vo.toString());
		return mybatis.selectOne("PaymentDAO.select_kakaoPayOrder", vo);
	}

	@Override
	public void update_KaKaoPayReady(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 update_KaKaoPayReady() 기능처리");
		mybatis.update("PaymentDAO.update_KaKaoPayReady", vo);
	}

	@Override
	public void update_KakaoPayApproval(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 update_KakaoPayApproval() 기능처리");
		mybatis.update("PaymentDAO.update_KakaoPayApproval", vo);
	}

	@Override
	public void update_point(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 update_point() 기능처리");
		mybatis.update("PaymentDAO.update_point", vo);
	}

	@Override
	public List<PaymentVO> getChargeList(PaymentVO vo) {
		System.out.println("===> MyBatis로 PaymentDAOImpl에서 getChargeList() 기능처리");
		return mybatis.selectList("PaymentDAO.getChargeList", vo);
	}

}
