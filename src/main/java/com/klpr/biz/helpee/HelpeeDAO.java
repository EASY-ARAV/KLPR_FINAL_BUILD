package com.klpr.biz.helpee;

import java.util.List;

import com.klpr.biz.pagination.PaginationVO;

public interface HelpeeDAO {
	// 헬피 존재 여부를 알려준다
	public HelpeeVO getHelpee(HelpeeVO vo);
	// 전체 헬피 목록을 보여준다(최신순 정렬 - 디폴트)
	public List<HelpeeVO> getHelpeeList(HelpeeVO vo, PaginationVO pvo);
	
	public void insertHelpee(HelpeeVO vo);	// 헬피 글 등록
	public void updateHelpee(HelpeeVO vo);	// 헬피 글 수정
	public void deleteHelpee(HelpeeVO vo);	// 헬피 글 삭제
	
	// 가능날짜가 지난 헬피글 삭제하기
	public void deleteDateHelpee(HelpeeVO vo);	
	// 헬피 리스트 평점순 정렬
	public List<HelpeeVO> scoreHelpeeList(HelpeeVO vo);	
	
	public List<HelpeeVO> moveHelpee(HelpeeVO vo);	// 이사 헬퍼 리스트	
	public List<HelpeeVO> hospitalHelpee(HelpeeVO vo);	// 병원 헬퍼 리스트
	public List<HelpeeVO> immigrationHelpee(HelpeeVO vo);	// 출입국 헬퍼 리스트
	
	public List<HelpeeVO> seoulHelpeeList(HelpeeVO vo);	// 헬퍼 리스트 지역별로
	
	public int getTotalCnt();	//총 헬피 리스트 수
	public int getScoreTotalCnt();
	public int getMoveTotalCnt();
	public int getHospitalTotalCnt();
	public int getImmigrationTotalCnt();
	public int getSeoulTotalCnt();
}


