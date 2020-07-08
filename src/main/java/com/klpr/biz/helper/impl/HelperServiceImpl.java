package com.klpr.biz.helper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.helper.HelperDAO;
import com.klpr.biz.helper.HelperService;
import com.klpr.biz.helper.HelperVO;
import com.klpr.biz.language.LanguageDAO;
import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.r_review.R_ReviewDAO;
import com.klpr.biz.r_review.R_ReviewVO;
import com.klpr.biz.seoul.SeoulDAO;
import com.klpr.biz.seoul.SeoulVO;

@Service("helperService")
public class HelperServiceImpl implements HelperService {

	@Autowired
	private HelperDAO helperDAO;

	@Autowired
	private SeoulDAO seoulDAO;

	@Autowired
	private LanguageDAO languageDAO;

	@Autowired
	private R_ReviewDAO r_reviewDAO;

	@Override
	public HelperVO getHelper(HelperVO vo) {
		return helperDAO.getHelper(vo);
	}

	@Override
	public void insertHelper(HelperVO vo) {
		helperDAO.insertHelper(vo);
	}

	@Override
	public void updateHelper(HelperVO vo) {
		helperDAO.updateHelper(vo);
	}

	@Override
	public void deleteHelper(HelperVO vo) {
		helperDAO.deleteHelper(vo);
	}

	@Override
	public List<HelperVO> getHelperList(HelperVO vo, PaginationVO pvo) {
		System.out.println("HelperServiceImpl의 getHelperList() 실행...");
		helperDAO.deleteDateHelper(vo);
		return helperDAO.getHelperList(vo, pvo);
	}

	@Override
	public List<HelperVO> scoreHelperList(HelperVO vo) {
		System.out.println("HelperServiceImpl의 scoreHelperList() 실행...");
		return helperDAO.scoreHelperList(vo);
	}

	@Override
	public List<HelperVO> moveHelper(HelperVO vo) {
		System.out.println("HelperServiceImpl의 moveHelper() 실행...");
		return helperDAO.moveHelper(vo);
	}

	@Override
	public List<HelperVO> hospitalHelper(HelperVO vo) {
		System.out.println("HelperServiceImpl의 hospitalHelper() 실행...");
		return helperDAO.hospitalHelper(vo);
	}

	@Override
	public List<HelperVO> immigrationHelper(HelperVO vo) {
		System.out.println("HelperServiceImpl의 immigrationHelper() 실행...");
		return helperDAO.immigrationHelper(vo);
	}

	@Override
	public List<HelperVO> seoulHelperList(HelperVO vo) {
		System.out.println("HelperServiceImpl의 seoulHelperList() 실행...");
		return helperDAO.seoulHelperList(vo);
	}

	@Override
	public List<LanguageVO> getLanguageList(LanguageVO vo) {
		System.out.println("HelperServiceImpl의 getLanguageList() 실행...");
		return languageDAO.getLanguageList(vo);
	}

	@Override
	public List<SeoulVO> getSeoulList(SeoulVO vo) {
		System.out.println("HelperServiceImpl의 getSeoulList() 실행...");
		return seoulDAO.getSeoulList(vo);
	}

	@Override
	public List<R_ReviewVO> getR_ReviewList(R_ReviewVO vo) {
		System.out.println("HelperServiceImpl의 getR_ReviewList() 실행...");
		return r_reviewDAO.getR_ReviewList(vo);
	}

	// 페이징 처리를 위한 추가부분

	@Override
	public int getTotalCnt() {
		System.out.println("HelpeeServiceImpl의 getTotalCount() 실행...");
		return helperDAO.getTotalCnt();
	}

	@Override
	public int getScoreTotalCnt() {
		return helperDAO.getScoreTotalCnt();
	}

	@Override
	public int getMoveTotalCnt() {
		return helperDAO.getMoveTotalCnt();
	}

	@Override
	public int getHospitalTotalCnt() {
		return helperDAO.getHospitalTotalCnt();
	}

	@Override
	public int getImmigrationTotalCnt() {
		return helperDAO.getImmigrationTotalCnt();
	}

	@Override
	public int getSeoulTotalCnt() {
		return helperDAO.getSeoulTotalCnt();
	}

}
