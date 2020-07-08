package com.klpr.biz.r_review;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class R_ReviewVO {
	@XmlAttribute
	private int r_vno;	// 리뷰글 번호 (sequence)
	private int rno;	// 리뷰받은 헬퍼의 유저번호(=uno)
	private int eno;
	private String rcomment;
	private int rscore;
	private int mstate;
	
	public int getR_vno() {
		return r_vno;
	}
	public void setR_vno(int r_vno) {
		this.r_vno = r_vno;
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
	public String getRcomment() {
		return rcomment;
	}
	public void setRcomment(String rcomment) {
		this.rcomment = rcomment;
	}
	public int getRscore() {
		return rscore;
	}
	public void setRscore(int rscore) {
		this.rscore = rscore;
	}
	public int getMstate() {
		return mstate;
	}
	public void setMstate(int mstate) {
		this.mstate = mstate;
	}
	
	@Override
	public String toString() {
		return "R_ReviewVO [r_vno=" + r_vno + ", rno=" + rno + ", eno=" + eno + ", rcomment=" + rcomment + ", rscore="
				+ rscore + ", mstate=" + mstate + "]";
	}
	
}
