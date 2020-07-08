package com.klpr.biz.matching;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.klpr.biz.user.UserVO;

public interface MatchingDAO {

	// 매칭리스트를 추가한다(state=1, 요청보내서 받음.)
	public void insertMatching(MatchingVO vo);

	public void updateMatchingState1(MatchingVO vo);

	// 매칭리스트의 state를 업데이트 한다(state=2, 요청확인을 해서 결제대기 상태)
	public void updateMatchingState2(MatchingVO vo);

	// 매칭리스트의 state를 업데이트 한다(state=3, 결제완료~서비스이용직전까지 상태)
	public void updateMatchingState3(MatchingVO vo);

	// 매칭리스트 상세보기
	public MatchingVO getMatching(MatchingVO vo);

	void setMatchingState(UserVO vo, HttpSession session);

	void updateUser(UserVO vo);

	public List<MatchingVO> getMatchingList0(UserVO vo);

	public List<MatchingVO> getMatchingList1(UserVO vo);

	public List<MatchingVO> getMatchingList2(UserVO vo);

	public List<MatchingVO> getMatchingList3(UserVO vo);

	public List<MatchingVO> getMatchingList4(UserVO vo);

	public List<MatchingVO> getMatchingList5(UserVO vo);

	// 로그인 하자마자 쓸 매칭 알러트
	public MatchingVO matchingAlert(MatchingVO vo);

	// 리뷰 넣을때 찾을 용
	public MatchingVO getRNOMatchingReview(MatchingVO vo);

	public MatchingVO getENOMatchingReview(MatchingVO vo);

	// 매칭리스트의 state를 업데이트 한다(state=4, 서비스이용 후 리뷰까지 작성함. 이전내역에서 볼수있음.)
	public void rejectMatching(MatchingVO vo);

	// 매칭 요청 취소(DELETE)
	public void cancelMatching(MatchingVO vo);

	// 매칭 요청 거절 된 목록
	List<MatchingVO> getRejectedList(UserVO vo);
}
