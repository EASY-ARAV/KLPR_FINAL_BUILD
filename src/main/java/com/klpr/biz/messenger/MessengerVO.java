package com.klpr.biz.messenger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class MessengerVO {
	@XmlAttribute
	private int msgno; // 메시지 번호(PK, AI)
	private int mno; // 매칭 번호(조인용)
	private int rno; // 헬퍼 번호
	private int eno; // 헬피 번호
	private String rmsg; // 헬퍼 메세지
	private String emsg; // 헬피 메세지
	private String msgdate; // 채팅 시간(timeStamp)
	private int rstate; // 헬퍼 1: 안읽음 0: 읽음
	private int estate; // 헬피 1: 안읽음 0: 읽음
	private String rname;
	private String ename;

	public int getMsgno() {
		return msgno;
	}

	public void setMsgno(int msgno) {
		this.msgno = msgno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getRmsg() {
		return rmsg;
	}

	public void setRmsg(String rmsg) {
		this.rmsg = rmsg;
	}

	public String getEmsg() {
		return emsg;
	}

	public void setEmsg(String emsg) {
		this.emsg = emsg;
	}

	public String getMsgdate() {
		return msgdate;
	}

	public void setMsgdate(String msgdate) {
		this.msgdate = msgdate;
	}

	public int getRstate() {
		return rstate;
	}

	public void setRstate(int rstate) {
		this.rstate = rstate;
	}

	public int getEstate() {
		return estate;
	}

	public void setEstate(int estate) {
		this.estate = estate;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "MessengerVO [msgno=" + msgno + ", mno=" + mno + ", rno=" + rno + ", eno=" + eno + ", rmsg=" + rmsg
				+ ", emsg=" + emsg + ", msgdate=" + msgdate + ", rstate=" + rstate + ", estate=" + estate + ", rname="
				+ rname + ", ename=" + ename + "]";
	}

}
