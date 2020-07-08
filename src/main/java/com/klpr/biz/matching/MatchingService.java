package com.klpr.biz.matching;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.klpr.biz.user.UserVO;

public interface MatchingService {
	public void setMatchingState(UserVO vo, HttpSession session);

	public void updateState(MatchingVO mvo);

	List<MatchingVO> getMatchingList0(UserVO vo);

	List<MatchingVO> getMatchingList1(UserVO vo);

	List<MatchingVO> getMatchingList2(UserVO vo);

	List<MatchingVO> getMatchingList3(UserVO vo);

	List<MatchingVO> getMatchingList4(UserVO vo);

	List<MatchingVO> getMatchingList5(UserVO vo);

	public void insertMatching(MatchingVO vo);

	public void updateUser(UserVO vo);

	// 로그인 하자마자 쓸 매칭 알러트
	public MatchingVO matchingAlert(MatchingVO vo);

	// 리뷰 넣을때 찾을 용
	public MatchingVO getRNOMatchingReview(MatchingVO vo);

	public MatchingVO getENOMatchingReview(MatchingVO vo);

	// 요청 거절된 리스트
	List<MatchingVO> getRejectedList(UserVO vo);

	// 매칭 요청 거절하기
	public void rejectMatching(MatchingVO vo);

	// 매칭 요청 취소하기
	public void cancelMatching(MatchingVO vo);

}
