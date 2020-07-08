package com.klpr.biz.helper;

import java.util.List;

import com.klpr.biz.pagination.PaginationVO;

public interface HelperDAO {
	// 헬퍼 존재 여부를 알려준다
	public HelperVO getHelper(HelperVO vo);
	// 전체 헬퍼 목록을 보여준다(최신순 정렬 - 디폴트)
	public List<HelperVO> getHelperList(HelperVO vo, PaginationVO pvo);
	
	public void insertHelper(HelperVO vo); // 헬퍼 글 등록
	public void updateHelper(HelperVO vo); // 헬퍼 글 수정
	public void deleteHelper(HelperVO vo); // 헬퍼 글 삭제
	
	// 가능날짜가 지난 헬퍼 글을 삭제해준다
	public void deleteDateHelper(HelperVO vo);
	// 전체 헬퍼 목록을 보여준다(평점순 정렬)
	public List<HelperVO> scoreHelperList(HelperVO vo);
	
	public List<HelperVO> moveHelper(HelperVO vo);	// 이사 헬퍼 리스트	
	public List<HelperVO> hospitalHelper(HelperVO vo);	// 병원 헬퍼 리스트
	public List<HelperVO> immigrationHelper(HelperVO vo);	// 출입국 헬퍼 리스트
	
	// 지역별로 헬퍼 목록을 보여준다
	public List<HelperVO> seoulHelperList(HelperVO vo);

	public int getTotalCnt();	//총 헬피 리스트 수
	public int getScoreTotalCnt();
	public int getMoveTotalCnt();
	public int getHospitalTotalCnt();
	public int getImmigrationTotalCnt();
	public int getSeoulTotalCnt();
}
