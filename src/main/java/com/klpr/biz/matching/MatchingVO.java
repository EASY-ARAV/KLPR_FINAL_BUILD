package com.klpr.biz.matching;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class MatchingVO {
	@XmlAttribute
	private int mno;
	private int seno;
	private int rcno;
	private int rno;
	private int eno;
	private String mdate;
	private int mplace;
	private int mservice;
	private int mstate;
	private String ename;
	private String rname;
	private String seName;
	private String rcName;
	private String district;
//	private String mplaceName;
//	private List<String> language;

	// 알람때문에 쓸 변수 생성
	private int count;

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getSeno() {
		return seno;
	}

	public void setSeno(int seno) {
		this.seno = seno;
	}

	public int getRcno() {
		return rcno;
	}

	public void setRcno(int rcno) {
		this.rcno = rcno;
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

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public int getMplace() {
		return mplace;
	}

	public void setMplace(int mplace) {
		this.mplace = mplace;
	}

	public int getMservice() {
		return mservice;
	}

	public void setMservice(int mservice) {
		this.mservice = mservice;
	}

	public int getMstate() {
		return mstate;
	}

	public void setMstate(int mstate) {
		this.mstate = mstate;
	}

//	public List<String> getLanguage() {
//		return language;
//	}
//	public void setLanguage(List<String> language) {
//		this.language = language;
//	}

	public String getEname() {
		return ename;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getSeName() {
		return seName;
	}

	public void setSeName(String seName) {
		this.seName = seName;
	}

	public String getRcName() {
		return rcName;
	}

	public void setRcName(String rcName) {
		this.rcName = rcName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "MatchingVO [mno=" + mno + ", seno=" + seno + ", rcno=" + rcno + ", rno=" + rno + ", eno=" + eno
				+ ", mdate=" + mdate + ", mplace=" + mplace + ", mservice=" + mservice + ", mstate=" + mstate
				+ ", ename=" + ename + ", rname=" + rname + ", seName=" + seName + ", rcName=" + rcName + ", district="
				+ district + "]";
	}
}
