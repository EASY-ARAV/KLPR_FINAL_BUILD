package com.klpr.biz.matching.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.matching.MatchingDAO;
import com.klpr.biz.matching.MatchingService;
import com.klpr.biz.matching.MatchingVO;
import com.klpr.biz.user.UserVO;

@Service("matchingService")
public class MatchingServiceImpl implements MatchingService {
	@Autowired
	private MatchingDAO matchingDAO;

	@Override
	public List<MatchingVO> getMatchingList0(UserVO vo) {
		return matchingDAO.getMatchingList0(vo);
	}

	@Override
	public List<MatchingVO> getMatchingList1(UserVO vo) {
		return matchingDAO.getMatchingList1(vo);
	}

	@Override
	public List<MatchingVO> getMatchingList2(UserVO vo) {
		return matchingDAO.getMatchingList2(vo);
	}

	@Override
	public List<MatchingVO> getMatchingList3(UserVO vo) {
		return matchingDAO.getMatchingList3(vo);
	}

	@Override
	public List<MatchingVO> getMatchingList4(UserVO vo) {
		return matchingDAO.getMatchingList4(vo);
	}

	@Override
	public List<MatchingVO> getMatchingList5(UserVO vo) {
		return matchingDAO.getMatchingList5(vo);
	}

	@Override
	public void setMatchingState(UserVO vo, HttpSession session) {
		matchingDAO.setMatchingState(vo, session);

	}

	@Override
	public void updateState(MatchingVO mvo) {
		if (mvo.getMstate() == 1) {
			matchingDAO.updateMatchingState1(mvo);
		} else if (mvo.getMstate() == 2) {
			matchingDAO.updateMatchingState2(mvo);
		} else if (mvo.getMstate() == 3) {
			matchingDAO.updateMatchingState3(mvo);
		}
	}

	public void insertMatching(MatchingVO mvo) {
		matchingDAO.insertMatching(mvo);
	}

	public void updateUser(UserVO vo) {
		matchingDAO.updateUser(vo);
	}

	@Override
	public MatchingVO matchingAlert(MatchingVO vo) {
		return matchingDAO.matchingAlert(vo);
	}

	@Override
	public MatchingVO getRNOMatchingReview(MatchingVO vo) {
		return matchingDAO.getRNOMatchingReview(vo);
	}

	@Override
	public MatchingVO getENOMatchingReview(MatchingVO vo) {
		return matchingDAO.getENOMatchingReview(vo);
	}

	@Override
	public List<MatchingVO> getRejectedList(UserVO vo) {
		return matchingDAO.getRejectedList(vo);
	}

	@Override
	public void rejectMatching(MatchingVO vo) {
		matchingDAO.rejectMatching(vo);
	}

	@Override
	public void cancelMatching(MatchingVO vo) {
		matchingDAO.cancelMatching(vo);
	}

}
