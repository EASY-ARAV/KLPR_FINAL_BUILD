package com.klpr.biz.withdraw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class WithdrawVO {
	@XmlAttribute
	private int wno; // 인출내역 인덱스번호
	private int uno; // 인출 신청 사용자번호
	private int wmoney; // 인출 신청한 돈
	private String wdate; // 인출 신청한 날짜
	private int netprofit; // 수수료 떼고 줄 돈
	private String waccount; // 계좌번호
	private String wbank; // 은행
	private String wname; // 예금주
	private String wphone; // 카카오페이용 연락처
	private String ddate; // 사용자에게 입금해준 날짜

	public int getWno() {
		return wno;
	}

	public void setWno(int wno) {
		this.wno = wno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getWmoney() {
		return wmoney;
	}

	public void setWmoney(int wmoney) {
		this.wmoney = wmoney;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getNetprofit() {
		return netprofit;
	}

	public void setNetprofit(int netprofit) {
		this.netprofit = netprofit;
	}

	public String getWaccount() {
		return waccount;
	}

	public void setWaccount(String waccount) {
		this.waccount = waccount;
	}

	public String getWbank() {
		return wbank;
	}

	public void setWbank(String wbank) {
		this.wbank = wbank;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public String getWphone() {
		return wphone;
	}

	public void setWphone(String wphone) {
		this.wphone = wphone;
	}

	public String getDdate() {
		return ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

	@Override
	public String toString() {
		return "WithdrawVO [wno=" + wno + ", uno=" + uno + ", wmoney=" + wmoney + ", wdate=" + wdate + ", netprofit="
				+ netprofit + ", waccount=" + waccount + ", wbank=" + wbank + ", wname=" + wname + ", wphone=" + wphone
				+ ", ddate=" + ddate + "]";
	}

}
