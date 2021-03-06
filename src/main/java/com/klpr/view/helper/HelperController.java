package com.klpr.view.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.helper.HelperService;
import com.klpr.biz.helper.HelperVO;
import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.r_review.R_ReviewVO;
import com.klpr.biz.seoul.SeoulVO;

@Controller
public class HelperController {

	@Autowired
	private HelperService helperService;

	// 헬퍼 목록
	@RequestMapping(value = "/getHelperList.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String getHelperList(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("seoul") SeoulVO svo, @ModelAttribute("r_review") R_ReviewVO rvo, Model model) {
		System.out.println("헬퍼 홍보글 목록으로 이동");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		// 서울 리스트 모델에 담기
		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		// 헬퍼 홍보글 리스트 모델에 담기
		model.addAttribute("helperList", helperService.getHelperList(vo, pvo));

		return "getHelperList.jsp";
	}

	// 헬퍼 홍보 작성 폼
	@RequestMapping(value = "/helperWriteForm.do", method = RequestMethod.GET)
	public String helperFormView(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("language") LanguageVO lvo,
			@ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("헬퍼-홍보 글 작성 페이지로 이동");

		List<LanguageVO> languageList = helperService.getLanguageList(lvo);
		model.addAttribute("languageList", languageList);
		System.out.println(languageList.toString());

		List<SeoulVO> seoulList = helperService.getSeoulList(svo);
		model.addAttribute("seoulList", seoulList);
		System.out.println(seoulList.toString());

		return "helperWriteForm.jsp";
	}

	// 헬퍼 홍보 글 입력
	@RequestMapping(value = "/helperWriteForm.do", method = RequestMethod.POST)
	public String helperForm(@ModelAttribute("helper") HelperVO vo, Model model) {
		System.out.println("헬퍼-홍보 글 작성 submit. DB에 저장.");

		// DB에 저장
		helperService.insertHelper(vo);

		return "getHelperList.do";
	}

	// 헬퍼 홍보 글 삭제
	@RequestMapping(value = "/helperDelete.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String helperDelete(@ModelAttribute("helper") HelperVO vo) {
		System.out.println("헬퍼-홍보 글 삭제. DB에 저장.");

		helperService.deleteHelper(vo);

		return "getHelperList.do";
	}

	@RequestMapping(value = "/helperUpdate.do", method = RequestMethod.GET)
	public String helperUpdateView(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("language") LanguageVO lvo,
			@ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("헬퍼-홍보 글 상세 보기.");

		List<LanguageVO> languageList = helperService.getLanguageList(lvo);
		model.addAttribute("languageList", languageList);

		List<SeoulVO> seoulList = helperService.getSeoulList(svo);
		model.addAttribute("seoulList", seoulList);

		HelperVO helper = helperService.getHelper(vo);
		model.addAttribute("helper", helper);

		return "helperUpdateForm.jsp";
	}

	@RequestMapping(value = "/helperUpdate.do", method = RequestMethod.POST)
	public String helperUpdate(@ModelAttribute("helper") HelperVO vo, Model model) {
		System.out.println("헬퍼-홍보 글 수정");

		helperService.updateHelper(vo);

		return "getHelperList.do";
	}

//		 평점순 정렬
	@RequestMapping(value = "/scoreHelperList.do", method = RequestMethod.GET)
	public String scoreHelperList(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("seoul") SeoulVO svo, @ModelAttribute("r_review") R_ReviewVO rvo, Model model) {
		System.out.println("평점순 헬퍼 목록 처리 모델로한거임");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		model.addAttribute("helperList", helperService.scoreHelperList(vo));
		return "getHelperList.jsp";
	}

	// 이사 헬퍼 리스트
	@RequestMapping(value = "/moveHelper.do", method = RequestMethod.GET)
	public String moveHelper(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("r_review") R_ReviewVO rvo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("모델로 이사헬퍼 리스트");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		model.addAttribute("helperList", helperService.moveHelper(vo));
		return "getHelperList.jsp";
	}

	// 병원 헬퍼 리스트
	@RequestMapping(value = "/hospitalHelper.do", method = RequestMethod.GET)
	public String hospitalHelper(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("r_review") R_ReviewVO rvo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("모델로 병원헬퍼 리스트");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		model.addAttribute("helperList", helperService.hospitalHelper(vo));
		return "getHelperList.jsp";
	}

	// 출입국 헬퍼 리스트
	@RequestMapping(value = "/immigrationHelper.do", method = RequestMethod.GET)
	public String immigrationHelper(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("r_review") R_ReviewVO rvo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("모델로 출입국헬퍼 리스트");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		model.addAttribute("helperList", helperService.immigrationHelper(vo));
		return "getHelperList.jsp";
	}

	// 지역별 리스트
	@RequestMapping(value = "/seoulHelperList.do", method = RequestMethod.GET)
	public String seoulHelperList(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("r_review") R_ReviewVO rvo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("지역별 헬퍼 목록 처리 모델로한거임");

		// 총 헬퍼 리스트 수
		int totalCnt = helperService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		vo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		vo.setEndRow(pvo.getRowSize());
		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helperService.getSeoulList(svo));
		model.addAttribute("r_reviewList", helperService.getR_ReviewList(rvo));
		model.addAttribute("helperList", helperService.seoulHelperList(vo));
		return "getHelperList.jsp";
	}

	// 2020-06-26 추가: 헬퍼가 요청 받는 리퀘스트 (Matching Insert를 위한...)
	@RequestMapping(value = "/helperRequest.do", method = RequestMethod.GET)
	public String helperRequest(@ModelAttribute("helper") HelperVO vo, @ModelAttribute("seoul") SeoulVO svo,
			@ModelAttribute("language") LanguageVO lvo, Model model) {
		System.out.println("헬퍼가 요청 받는 리퀘스트");

		List<LanguageVO> languageList = helperService.getLanguageList(lvo);
		model.addAttribute("languageList", languageList);

		List<SeoulVO> seoulList = helperService.getSeoulList(svo);
		model.addAttribute("seoulList", seoulList);

		HelperVO helper = helperService.getHelper(vo);
		model.addAttribute("helper", helper);

		return "helperRequestForm.jsp";
	}

}
