package com.klpr.biz.messenger;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "messengerList")
@XmlAccessorType(XmlAccessType.FIELD)
public class MessengerListVO {
	
	@XmlElement(name = "msg")
	private List<MessengerVO> messengerList;
	
	public List<MessengerVO> getMessengerList() {
		return messengerList;
	}
	
	public void setMessengerList(List<MessengerVO> messengerList) {
		this.messengerList = messengerList;
	}
}
