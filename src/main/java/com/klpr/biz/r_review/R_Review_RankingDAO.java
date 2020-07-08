package com.klpr.biz.r_review;

import java.util.List;


public interface R_Review_RankingDAO {
	
	public List<R_Review_RankingVO> best_Rtop5(R_Review_RankingVO vo);
	// 메인페이지에서 헬퍼 TOP5 리스트
	public List<R_Review_RankingVO> greatest_Rtop5(R_Review_RankingVO vo);
}
