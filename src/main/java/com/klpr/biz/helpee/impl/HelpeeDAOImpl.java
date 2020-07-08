package com.klpr.biz.helpee.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.helpee.HelpeeDAO;
import com.klpr.biz.helpee.HelpeeVO;
import com.klpr.biz.pagination.PaginationVO;

@Repository("helpeeDAO")
public class HelpeeDAOImpl implements HelpeeDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public HelpeeVO getHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 getHelpee() 기능처리");
		return mybatis.selectOne("HelpeeDAO.getHelpee", vo);
	}

	@Override
	public List<HelpeeVO> getHelpeeList(HelpeeVO vo, PaginationVO pvo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 getHelpeeList() 기능처리");
		return mybatis.selectList("HelpeeDAO.getHelpeeList", vo);
	}

	@Override
	public void insertHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 insertHelpee() 기능처리");
		mybatis.insert("HelpeeDAO.insertHelpee", vo);
	}

	@Override
	public void updateHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 updateHelpee() 기능처리");
		mybatis.update("HelpeeDAO.updateHelpee", vo);

	}

	@Override
	public void deleteHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 deleteHelpee() 기능처리");
		mybatis.delete("HelpeeDAO.deleteHelpee", vo);

	}

	@Override
	public void deleteDateHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 deleteDateHelpee() 기능처리");
		mybatis.delete("HelpeeDAO.deleteDateHelpee", vo);

	}

	@Override
	public List<HelpeeVO> scoreHelpeeList(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 scoreHelpeeList() 기능처리");
		return mybatis.selectList("HelpeeDAO.scoreHelpeeList", vo);
	}

	@Override
	public List<HelpeeVO> moveHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 moveHelpee() 기능처리");
		return mybatis.selectList("HelpeeDAO.moveHelpee", vo);
	}

	@Override
	public List<HelpeeVO> hospitalHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 hospitalHelpee() 기능처리");
		return mybatis.selectList("HelpeeDAO.hospitalHelpee", vo);
	}

	@Override
	public List<HelpeeVO> immigrationHelpee(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 immigrationHelpee() 기능처리");
		return mybatis.selectList("HelpeeDAO.immigrationHelpee", vo);
	}

	@Override
	public List<HelpeeVO> seoulHelpeeList(HelpeeVO vo) {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 seoulHelpeeList() 기능처리");
		return mybatis.selectList("HelpeeDAO.seoulHelpeeList", vo);
	}

	// 페이징 처리를 위한 추가부분

	@Override
	public int getTotalCnt() {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 getTotalCnt() 기능처리");
		return mybatis.selectOne("HelpeeDAO.getTotalCnt");
	}

	@Override
	public int getScoreTotalCnt() {
		return mybatis.selectOne("HelpeeDAO.getScoreTotalCnt");
	}

	@Override
	public int getMoveTotalCnt() {
		return mybatis.selectOne("HelpeeDAO.getMoveTotalCnt");
	}

	@Override
	public int getHospitalTotalCnt() {
		return mybatis.selectOne("HelpeeDAO.getHospitalTotalCnt");
	}

	@Override
	public int getImmigrationTotalCnt() {
		return mybatis.selectOne("HelpeeDAO.getImmigrationTotalCnt");
	}

	@Override
	public int getSeoulTotalCnt() {
		return mybatis.selectOne("HelpeeDAO.getSeoulTotalCnt");
	}

}
