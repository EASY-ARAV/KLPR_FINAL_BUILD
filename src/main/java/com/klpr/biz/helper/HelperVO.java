package com.klpr.biz.helper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class HelperVO {
	@XmlAttribute
	private int rno; // 헬퍼글 번호 (sequence)
	private String sta;
	private String end;
	private int rplace;
	private int moving;
	private int hospital;
	private int immigration;
	private String r_intro;
	private int uno; // 유저 번호
	private String name;
	private int dno;
	private String district;
	private int lno;
	private String language;
	private double avg;
	private int cnt;

	private int startRow = 5;
	private int endRow = 5;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSta() {
		return sta;
	}

	public void setSta(String sta) {
		this.sta = sta;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getRplace() {
		return rplace;
	}

	public void setRplace(int rplace) {
		this.rplace = rplace;
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

	public String getR_intro() {
		return r_intro;
	}

	public void setR_intro(String r_intro) {
		this.r_intro = r_intro;
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
		return "HelperVO [rno=" + rno + ", sta=" + sta + ", end=" + end + ", rplace=" + rplace + ", moving=" + moving
				+ ", hospital=" + hospital + ", immigration=" + immigration + ", r_intro=" + r_intro + ", uno=" + uno
				+ ", name=" + name + ", dno=" + dno + ", district=" + district + ", lno=" + lno + ", language="
				+ language + ", avg=" + avg + ", cnt=" + cnt + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}

}
