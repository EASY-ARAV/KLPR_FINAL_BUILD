package com.klpr.biz.messenger.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.messenger.MessengerDAO;
import com.klpr.biz.messenger.MessengerService;
import com.klpr.biz.messenger.MessengerVO;

@Service("messengerService")
public class MessengerServiceImpl implements MessengerService {

	@Autowired
	private MessengerDAO messengerDAO;
	
	@Override
	public MessengerVO getMsg(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 getMsg() 실행...");
		return messengerDAO.getMsg(vo);
	}

	@Override
	public void helperSendMsg(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 helperSendMsg() 실행...");
		messengerDAO.helperSendMsg(vo);
	}

	@Override
	public void helpersMsgRead(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 helpersMsgRead() 실행...");
		messengerDAO.helpersMsgRead(vo);
	}

	@Override
	public void helpeeSendMsg(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 helpeeSendMsg() 실행...");
		messengerDAO.helpeeSendMsg(vo);
	}

	@Override
	public void helpeesMsgRead(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 helpeesMsgRead() 실행...");
		messengerDAO.helpeesMsgRead(vo);
	}

	@Override
	public List<MessengerVO> getMessageList(MessengerVO vo) {
		System.out.println("MessengerServiceImpl의 getMessageList() 실행...");
		return messengerDAO.getMessageList(vo);
	}

}
