package com.klpr.biz.helper;

import java.util.List;

import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.r_review.R_ReviewVO;
import com.klpr.biz.seoul.SeoulVO;

public interface HelperService {
	
	public HelperVO getHelper(HelperVO vo);

	public void insertHelper(HelperVO vo);
	public void updateHelper(HelperVO vo);
	public void deleteHelper(HelperVO vo);

	public List<HelperVO> getHelperList(HelperVO vo, PaginationVO pvo);

	public List<HelperVO> scoreHelperList(HelperVO vo);

	public List<HelperVO> moveHelper(HelperVO vo); // 이사 헬퍼 리스트
	public List<HelperVO> hospitalHelper(HelperVO vo); // 병원 헬퍼 리스트
	public List<HelperVO> immigrationHelper(HelperVO vo); // 출입국 헬퍼 리스트

	public List<HelperVO> seoulHelperList(HelperVO vo);
	
	public List<LanguageVO> getLanguageList(LanguageVO vo);
	public List<SeoulVO> getSeoulList(SeoulVO vo);
	public List<R_ReviewVO> getR_ReviewList(R_ReviewVO vo);
	
	public int getTotalCnt();	//총 헬피 리스트 수
	public int getScoreTotalCnt();
	public int getMoveTotalCnt();
	public int getHospitalTotalCnt();
	public int getImmigrationTotalCnt();
	public int getSeoulTotalCnt();
}