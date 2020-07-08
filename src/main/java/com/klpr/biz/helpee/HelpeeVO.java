package com.klpr.biz.helpee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class HelpeeVO {
	@XmlAttribute
	private int eno; // 헬피글 번호(sequence)
	private String edate;
	private int eplace;
	private int moving;
	private int hospital;
	private int immigration;
	private String e_intro;
	private int uno; // 유저 번호
	private String name;
	private int dno; // 지역 번호
	private String district;
	private int lno;
	private String language;
	private double avg; // 리뷰 평점 평균
	private int cnt; // 리뷰 갯수

	private int startRow = 5;
	private int endRow = 5;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public int getEplace() {
		return eplace;
	}

	public void setEplace(int eplace) {
		this.eplace = eplace;
	}

	public int getMoving() {
		return moving;
	}

	public void setMoving(int moving) {
		this.moving = moving;
	}

	public int getHospital() {
		return hospital;
	}

	public void setHospital(int hospital) {
		this.hospital = hospital;
	}

	public int getImmigration() {
		return immigration;
	}

	public void setImmigration(int immigration) {
		this.immigration = immigration;
	}

	public String getE_intro() {
		return e_intro;
	}

	public void setE_intro(String e_intro) {
		this.e_intro = e_intro;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	@Override
	public String toString() {
		return "HelpeeVO [eno=" + eno + ", edate=" + edate + ", eplace=" + eplace + ", moving=" + moving + ", hospital="
				+ hospital + ", immigration=" + immigration + ", e_intro=" + e_intro + ", uno=" + uno + ", name=" + name
				+ ", dno=" + dno + ", district=" + district + ", lno=" + lno + ", language=" + language + ", avg=" + avg
				+ ", cnt=" + cnt + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}

}
