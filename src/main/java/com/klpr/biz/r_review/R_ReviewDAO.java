package com.klpr.biz.r_review;

import java.util.List;

public interface R_ReviewDAO {
	
	public void insertR_Review(R_ReviewVO vo);
	
	// 헬퍼가 받은 리뷰 보기
	public R_ReviewVO getR_Review(R_ReviewVO vo);
	
	// 헬퍼들이 받은 리뷰 리스트
	public List<R_ReviewVO> getR_ReviewList(R_ReviewVO vo);

}
