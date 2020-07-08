package com.klpr.biz.messenger.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.messenger.MessengerDAO;
import com.klpr.biz.messenger.MessengerVO;

@Repository("messengerDAO")
public class MessengerDAOImpl implements MessengerDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public MessengerVO getMsg(MessengerVO vo) {	// 메시지 불러오기
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 getMsg() 기능처리");
		return (MessengerVO) mybatis.selectOne("MessengerDAO.getMsg", vo);
	}

	@Override
	public void helperSendMsg(MessengerVO vo) {	// 헬퍼가 메시지 보내기
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 helperSendMsg() 기능처리");
		mybatis.insert("MessengerDAO.helperSendMsg", vo);
	}

	@Override
	public void helpersMsgRead(MessengerVO vo) { // 헬피가 메시지 확인하면, 헬퍼 rstate=0 세팅
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 helpersMsgRead() 기능처리");
		mybatis.update("MessengerDAO.helpersMsgRead", vo);
	}

	@Override
	public void helpeeSendMsg(MessengerVO vo) { // 헬피가 메시지 보내기
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 helpeeSendMsg() 기능처리");
		mybatis.insert("MessengerDAO.helpeeSendMsg", vo);
	}

	@Override
	public void helpeesMsgRead(MessengerVO vo) { // 헬퍼가 메시지 확인하면, 헬피 estate=0 세팅
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 helpeesMsgRead() 기능처리");
		mybatis.update("MessengerDAO.helpeesMsgRead", vo);
	}

	@Override
	public List<MessengerVO> getMessageList(MessengerVO vo) { // 메시지 리스트
		System.out.println("===> MyBatis로 MessengerDAOImpl에서 getMessageList() 기능처리");
		return mybatis.selectList("MessengerDAO.getMessageList", vo);
	}

}
