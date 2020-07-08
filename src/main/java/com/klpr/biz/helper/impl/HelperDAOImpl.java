package com.klpr.biz.helper.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.helper.HelperDAO;
import com.klpr.biz.helper.HelperVO;
import com.klpr.biz.pagination.PaginationVO;

@Repository("helperDAO")
public class HelperDAOImpl implements HelperDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public HelperVO getHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 getHelper() 기능처리");
		return (HelperVO) mybatis.selectOne("HelperDAO.getHelper", vo);
	}

	@Override
	public List<HelperVO> getHelperList(HelperVO vo, PaginationVO pvo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 getHelperList() 기능처리");
		return mybatis.selectList("HelperDAO.getHelperList", vo);
	}

	@Override
	public void insertHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 insertHelper() 기능 처리");
		mybatis.insert("HelperDAO.insertHelper", vo);
	}

	@Override
	public void updateHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 updateHelper() 기능 처리");
		mybatis.update("HelperDAO.updateHelper", vo);
	}

	@Override
	public void deleteHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 deleteHelper() 기능 처리");
		mybatis.delete("HelperDAO.deleteHelper", vo);
	}

	@Override
	public void deleteDateHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 deleteDateHelper() 기능 처리");
		mybatis.delete("HelperDAO.deleteDateHelper", vo);
	}

	@Override
	public List<HelperVO> scoreHelperList(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 scoreHelperList() 기능처리");
		return mybatis.selectList("HelperDAO.scoreHelperList", vo);
	}

	@Override
	public List<HelperVO> moveHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 moveHelper() 기능처리");
		return mybatis.selectList("HelperDAO.moveHelper", vo);
	}

	@Override
	public List<HelperVO> hospitalHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 hospitalHelper() 기능처리");
		return mybatis.selectList("HelperDAO.hospitalHelper", vo);
	}

	@Override
	public List<HelperVO> immigrationHelper(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 immigrationHelper() 기능처리");
		return mybatis.selectList("HelperDAO.immigrationHelper", vo);
	}

	@Override
	public List<HelperVO> seoulHelperList(HelperVO vo) {
		System.out.println("===> MyBatis로 HelperDAOImpl에서 seoulHelperList() 기능처리");
		return mybatis.selectList("HelperDAO.seoulHelperList", vo);
	}

	@Override
	public int getTotalCnt() {
		System.out.println("===> MyBatis로 HelpeeDAOImpl에서 getTotalCnt() 기능처리");
		return mybatis.selectOne("HelperDAO.getTotalCnt");
	}

	@Override
	public int getScoreTotalCnt() {
		return mybatis.selectOne("HelperDAO.getScoreTotalCnt");
	}

	@Override
	public int getMoveTotalCnt() {
		return mybatis.selectOne("HelperDAO.getMoveTotalCnt");
	}

	@Override
	public int getHospitalTotalCnt() {
		return mybatis.selectOne("HelperDAO.getHospitalTotalCnt");
	}

	@Override
	public int getImmigrationTotalCnt() {
		return mybatis.selectOne("HelperDAO.getImmigrationTotalCnt");
	}

	@Override
	public int getSeoulTotalCnt() {
		return mybatis.selectOne("HelperDAO.getSeoulTotalCnt");
	}

}
