package com.klpr.biz.helpee;

import java.util.List;

import com.klpr.biz.e_review.E_ReviewVO;
import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.seoul.SeoulVO;

public interface HelpeeService {
	
	public HelpeeVO getHelpee(HelpeeVO vo);
	
	public void insertHelpee(HelpeeVO vo);
	public void updateHelpee(HelpeeVO vo);
	public void deleteHelpee(HelpeeVO vo);


	public List<HelpeeVO> getHelpeeList(HelpeeVO vo, PaginationVO pvo);
	
	public List<HelpeeVO> scoreHelpeeList(HelpeeVO vo);
	
	public List<HelpeeVO> moveHelpee(HelpeeVO vo);	// 이사 헬퍼 리스트	
	public List<HelpeeVO> hospitalHelpee(HelpeeVO vo);	// 병원 헬퍼 리스트
	public List<HelpeeVO> immigrationHelpee(HelpeeVO vo);	// 출입국 헬퍼 리스트
	
	public List<HelpeeVO> seoulHelpeeList(HelpeeVO vo);
	
	public List<LanguageVO> getLanguageList(LanguageVO vo);
	public List<SeoulVO> getSeoulList(SeoulVO vo);
	public List<E_ReviewVO> getE_ReviewList(E_ReviewVO vo);
	
	public int getTotalCnt();	//총 헬피 리스트 수
	public int getScoreTotalCnt();
	public int getMoveTotalCnt();
	public int getHospitalTotalCnt();
	public int getImmigrationTotalCnt();
	public int getSeoulTotalCnt();
}
