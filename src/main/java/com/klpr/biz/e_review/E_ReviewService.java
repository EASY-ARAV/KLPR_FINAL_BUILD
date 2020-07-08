package com.klpr.biz.e_review;

import java.util.List;

public interface E_ReviewService {
	
	public void insertE_Review(E_ReviewVO vo);

	public E_ReviewVO getE_Review(E_ReviewVO vo);

	public List<E_ReviewVO> getE_ReviewList(E_ReviewVO vo);
	
	// 메인페이지에서 헬피 TOP5 리스트
	public List<E_Review_RankingVO> greatest_Etop5(E_Review_RankingVO vo);
}
