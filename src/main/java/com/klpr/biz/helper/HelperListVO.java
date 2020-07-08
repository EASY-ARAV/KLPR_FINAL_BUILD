package com.klpr.biz.helper;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "helperList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HelperListVO {
	
	@XmlElement(name = "helper")
	private List<HelperVO> helperList;
	
	public List<HelperVO> getHelperList() {
		return helperList;
	}
	
	public void setHelperList(List<HelperVO> helperList) {
		this.helperList = helperList;
	}
}
