package com.klpr.biz.messenger;

import java.util.List;

public interface MessengerDAO {
	public MessengerVO getMsg(MessengerVO vo);	// 메시지 가져오기
	public void helperSendMsg(MessengerVO vo);	// 헬퍼가 메시지 보내기(insert)
	public void helpersMsgRead(MessengerVO vo);	// 헬퍼가 메시지를 읽음(update rstate=0)
	public void helpeeSendMsg(MessengerVO vo);	// 헬피가 메시지 보내기(insert)
	public void helpeesMsgRead(MessengerVO vo);	// 헬피가 메시지를 읽음(update estate=0)
	
	public List<MessengerVO> getMessageList(MessengerVO vo);	// 대화 리스트
}
