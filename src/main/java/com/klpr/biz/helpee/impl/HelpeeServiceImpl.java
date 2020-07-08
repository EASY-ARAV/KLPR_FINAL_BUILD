package com.klpr.biz.helpee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.e_review.E_ReviewDAO;
import com.klpr.biz.e_review.E_ReviewVO;
import com.klpr.biz.helpee.HelpeeDAO;
import com.klpr.biz.helpee.HelpeeService;
import com.klpr.biz.helpee.HelpeeVO;
import com.klpr.biz.language.LanguageDAO;
import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.seoul.SeoulDAO;
import com.klpr.biz.seoul.SeoulVO;

@Service("helpeeService")
public class HelpeeServiceImpl implements HelpeeService {

	@Autowired
	private HelpeeDAO helpeeDAO;

	@Autowired
	private SeoulDAO seoulDAO;

	@Autowired
	private LanguageDAO languageDAO;

	@Autowired
	private E_ReviewDAO e_reviewDAO;

	@Override
	public HelpeeVO getHelpee(HelpeeVO vo) {
		return helpeeDAO.getHelpee(vo);
	}

	@Override
	public void insertHelpee(HelpeeVO vo) {
		helpeeDAO.insertHelpee(vo);
	}

	@Override
	public void updateHelpee(HelpeeVO vo) {
		helpeeDAO.updateHelpee(vo);
	}

	@Override
	public void deleteHelpee(HelpeeVO vo) {
		helpeeDAO.deleteHelpee(vo);
	}

	@Override
	public List<HelpeeVO> getHelpeeList(HelpeeVO vo, PaginationVO pvo) {
		System.out.println("HelpeeServiceImpl의 getHelpeeList() 실행...");
		helpeeDAO.deleteDateHelpee(vo);
		return helpeeDAO.getHelpeeList(vo, pvo);
	}

	@Override
	public List<HelpeeVO> scoreHelpeeList(HelpeeVO vo) {
		System.out.println("HelpeeServiceImpl의 scoreHelpeeList() 실행...");
		return helpeeDAO.scoreHelpeeList(vo);
	}

	@Override
	public List<HelpeeVO> moveHelpee(HelpeeVO vo) {
		System.out.println("HelpeeServiceImpl의 moveHelpee() 실행...");
		return helpeeDAO.moveHelpee(vo);
	}

	@Override
	public List<HelpeeVO> hospitalHelpee(HelpeeVO vo) {
		System.out.println("HelperSeeviceImpl의 hospitalHelpee() 실행...");
		return helpeeDAO.hospitalHelpee(vo);
	}

	@Override
	public List<HelpeeVO> immigrationHelpee(HelpeeVO vo) {
		System.out.println("HelpeeServiceImpl의 immigrationHelpee() 실행...");
		return helpeeDAO.immigrationHelpee(vo);
	}

	@Override
	public List<HelpeeVO> seoulHelpeeList(HelpeeVO vo) {
		System.out.println("HelpeeServiceImpl의 seoulHelpeeList() 실행...");
		return helpeeDAO.seoulHelpeeList(vo);
	}

	@Override
	public List<LanguageVO> getLanguageList(LanguageVO vo) {
		System.out.println("HelperServiceImpl의 getLanguageList() 실행...");
		return languageDAO.getLanguageList(vo);
	}

	@Override
	public List<SeoulVO> getSeoulList(SeoulVO vo) {
		System.out.println("HelpeeServiceImpl의 getSeoulList() 실행...");
		return seoulDAO.getSeoulList(vo);
	}

	@Override
	public List<E_ReviewVO> getE_ReviewList(E_ReviewVO vo) {
		System.out.println("HelpeeServiceImpl의 getE_ReviewList() 실행...");
		return e_reviewDAO.getE_ReviewList(vo);
	}

	// 페이징 처리를 위한 추가부분

	@Override
	public int getTotalCnt() {
		System.out.println("HelpeeServiceImpl의 getTotalCount() 실행...");
		return helpeeDAO.getTotalCnt();
	}

	@Override
	public int getScoreTotalCnt() {
		return helpeeDAO.getScoreTotalCnt();
	}

	@Override
	public int getMoveTotalCnt() {
		return helpeeDAO.getMoveTotalCnt();
	}

	@Override
	public int getHospitalTotalCnt() {
		return helpeeDAO.getHospitalTotalCnt();
	}

	@Override
	public int getImmigrationTotalCnt() {
		return helpeeDAO.getImmigrationTotalCnt();
	}

	@Override
	public int getSeoulTotalCnt() {
		return helpeeDAO.getSeoulTotalCnt();
	}

}
