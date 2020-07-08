package com.klpr.biz.matching.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.matching.MatchingDAO;
import com.klpr.biz.matching.MatchingVO;
import com.klpr.biz.user.UserVO;

@Repository("matchingDAO")
public class MatchingDAOImpl implements MatchingDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public List<MatchingVO> getMatchingList0(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList1", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).getRcno() == uno) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public List<MatchingVO> getMatchingList1(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList1", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).getSeno() == uno) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public List<MatchingVO> getMatchingList2(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList2", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if ((list1.get(i).getSeno() == uno) || (list1.get(i).getRcno() == uno)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public List<MatchingVO> getMatchingList3(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList3", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if ((list1.get(i).getSeno() == uno) || (list1.get(i).getRcno() == uno)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public List<MatchingVO> getMatchingList4(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList4", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if ((list1.get(i).getSeno() == uno) || (list1.get(i).getRcno() == uno)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public List<MatchingVO> getMatchingList5(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getMatchingList5", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if ((list1.get(i).getSeno() == uno) || (list1.get(i).getRcno() == uno)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

	@Override
	public void setMatchingState(UserVO vo, HttpSession session) {
		session.setAttribute("mstate0", getMatchingList0(vo).size());
		session.setAttribute("mstate1", getMatchingList1(vo).size());
		session.setAttribute("mstate2", getMatchingList2(vo).size());
		session.setAttribute("mstate3", getMatchingList3(vo).size());
		session.setAttribute("mstate4", getMatchingList4(vo).size());
		session.setAttribute("mstate5", getMatchingList5(vo).size());
	}

	@Override
	public void insertMatching(MatchingVO vo) {
		System.out.println("--------MatchingExtraDAOImpl의 -insertMatching() 기능 실행");
		mybatis.insert("insertMatching", vo);

	}

	@Override
	public void updateMatchingState1(MatchingVO vo) {
		mybatis.update("updateMatchingState1", vo);
	}

	@Override
	public void updateMatchingState2(MatchingVO vo) {
		mybatis.update("updateMatchingState2", vo);
	}

	@Override
	public void updateMatchingState3(MatchingVO vo) {
		mybatis.update("updateMatchingState3", vo);
	}

	@Override
	public MatchingVO getMatching(MatchingVO vo) {
		return (MatchingVO) mybatis.selectOne("", vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		mybatis.update("updateUser", vo);
	}

	@Override
	public MatchingVO matchingAlert(MatchingVO vo) {
		return (MatchingVO) mybatis.selectOne("MatchingDAO.matchingAlert", vo);
	}

	@Override
	public MatchingVO getRNOMatchingReview(MatchingVO vo) {
		return (MatchingVO) mybatis.selectOne("MatchingDAO.getRNOMatchingReview", vo);
	}

	@Override
	public MatchingVO getENOMatchingReview(MatchingVO vo) {
		return (MatchingVO) mybatis.selectOne("MatchingDAO.getENOMatchingReview", vo);
	}

	@Override
	public void rejectMatching(MatchingVO vo) {
		mybatis.update("updateMatchingState4", vo);
	}

	@Override
	public void cancelMatching(MatchingVO vo) {
		mybatis.delete("cancelMatching", vo);
	}

	@Override
	public List<MatchingVO> getRejectedList(UserVO vo) {
		List<MatchingVO> list1 = mybatis.selectList("getRejectedList", vo);
		int uno = vo.getUno();
		List<MatchingVO> list2 = new ArrayList<MatchingVO>();
		for (int i = 0; i < list1.size(); i++) {
			if ((list1.get(i).getSeno() == uno) || (list1.get(i).getRcno() == uno)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}

}
