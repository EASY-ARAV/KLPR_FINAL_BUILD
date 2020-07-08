package com.klpr.view.helpee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.klpr.biz.e_review.E_ReviewVO;
import com.klpr.biz.helpee.HelpeeService;
import com.klpr.biz.helpee.HelpeeVO;
import com.klpr.biz.language.LanguageVO;
import com.klpr.biz.pagination.PaginationVO;
import com.klpr.biz.seoul.SeoulVO;

@Controller
public class HelpeeController {

	@Autowired
	private HelpeeService helpeeService;

	// 전체 헬피 목록 출력
	@RequestMapping(value = "/getHelpeeList.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String getHelpeeList(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("seoul") SeoulVO svo, @ModelAttribute("e_review") E_ReviewVO evo, Model model) {
		System.out.println("헬피 홍보글 목록으로 이동");

		// 총 헬피 리스트 수
		int totalCnt = helpeeService.getTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		// 시작 row
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		// 끝 ROW
		hvo.setEndRow(pvo.getRowSize());

		// 페이징 처리 변수 모델에 담기
		model.addAttribute("PaginationVO", pvo);

		// 서울 리스트 모델에 담기
		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));

		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));

		// 헬피 홍보글 리스트 모델에 담기
		model.addAttribute("helpeeList", helpeeService.getHelpeeList(hvo, pvo));

		return "getHelpeeList.jsp";
	}

	// 헬피 요청 글 작성 폼
	@RequestMapping(value = "/helpeeWriteForm.do", method = RequestMethod.GET)
	public String helpeeFormView(@ModelAttribute("helpee") HelpeeVO vo, @ModelAttribute("language") LanguageVO lvo,
			@ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("헬피-요청 글 작성 페이지로 이동");

		List<LanguageVO> languageList = helpeeService.getLanguageList(lvo);
		model.addAttribute("languageList", languageList);
		System.out.println(languageList.toString());

		List<SeoulVO> seoulList = helpeeService.getSeoulList(svo);
		model.addAttribute("seoulList", seoulList);
		System.out.println(seoulList.toString());

		return "helpeeWriteForm.jsp";
	}

	// 헬피 홍보 글 입력
	@RequestMapping(value = "/helpeeWriteForm.do", method = RequestMethod.POST)
	public String helpeeForm(@ModelAttribute("helpee") HelpeeVO vo, Model model) {
		System.out.println("헬피-요청 글 작성 후 Submit.");

		// DB에 저장
		helpeeService.insertHelpee(vo);

		return "getHelpeeList.do";
	}

	// 헬피 홍보 글 삭제
	@RequestMapping(value = "/helpeeDelete.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String helpeeDelete(@ModelAttribute("helpee") HelpeeVO vo) {
		System.out.println("헬피-요청 글 삭제.");

		helpeeService.deleteHelpee(vo);

		return "getHelpeeList.do";
	}

	// 헬피 요청 글 수정 폼
	@RequestMapping(value = "/helpeeUpdate.do", method = RequestMethod.GET)
	public String helpeeUpdateView(@ModelAttribute("helpee") HelpeeVO vo, @ModelAttribute("language") LanguageVO lvo,
			@ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("헬피-요청 글 상세 보기.");

		List<LanguageVO> languageList = helpeeService.getLanguageList(lvo);
		model.addAttribute("languageList", languageList);

		List<SeoulVO> seoulList = helpeeService.getSeoulList(svo);
		model.addAttribute("seoulList", seoulList);

		HelpeeVO helpee = helpeeService.getHelpee(vo);
		model.addAttribute("helpee", helpee);

		return "helpeeUpdateForm.jsp";
	}

	@RequestMapping(value = "/helpeeUpdate.do", method = RequestMethod.POST)
	public String helpeeUpdate(@ModelAttribute("helpee") HelpeeVO vo, Model model) {
		System.out.println("헬피-요청 글 수정.");

		helpeeService.updateHelpee(vo);

		return "getHelpeeList.do";
	}

	// 헬피글 평점순 정렬
	@RequestMapping(value = "/scoreHelpeeList.do", method = RequestMethod.GET)
	public String scoreHelpeeList(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("e_review") E_ReviewVO evo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("헬피 홍보글 평점순 목록으로 이동");

		int totalCnt = helpeeService.getScoreTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		hvo.setEndRow(pvo.getRowSize());
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));
		model.addAttribute("helpeeList", helpeeService.scoreHelpeeList(hvo));
		return "getHelpeeList.jsp";
	}

	// 이사 헬피 리스트
	@RequestMapping(value = "/moveHelpee.do", method = RequestMethod.GET)
	public String moveHelpee(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("e_review") E_ReviewVO evo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("이사 서비스 헬피 목록 출력");

		int totalCnt = helpeeService.getMoveTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		hvo.setEndRow(pvo.getRowSize());
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));
		model.addAttribute("helpeeList", helpeeService.moveHelpee(hvo));
		return "getHelpeeList.jsp";
	}

	// 병원 헬피 리스트
	@RequestMapping(value = "/hospitalHelpee.do", method = RequestMethod.GET)
	public String hospitalHelpee(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("e_review") E_ReviewVO evo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("병원 서비스 헬피 목록 출력");

		int totalCnt = helpeeService.getHospitalTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		hvo.setEndRow(pvo.getRowSize());
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));
		model.addAttribute("helpeeList", helpeeService.hospitalHelpee(hvo));
		return "getHelpeeList.jsp";
	}

	// 출입국 헬피 리스트
	@RequestMapping(value = "/immigrationHelpee.do", method = RequestMethod.GET)
	public String immigrationHelpee(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("e_review") E_ReviewVO evo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("출입국 서비스 헬피 목록 출력");

		int totalCnt = helpeeService.getImmigrationTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		hvo.setEndRow(pvo.getRowSize());
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));
		model.addAttribute("helpeeList", helpeeService.immigrationHelpee(hvo));
		return "getHelpeeList.jsp";
	}

	// 지역별 헬피 리스트
	@RequestMapping(value = "/seoulHelpeeList.do", method = RequestMethod.GET)
	public String seoulHelpeeList(@ModelAttribute("helpee") HelpeeVO hvo, @ModelAttribute("paging") PaginationVO pvo,
			@ModelAttribute("e_review") E_ReviewVO evo, @ModelAttribute("seoul") SeoulVO svo, Model model) {
		System.out.println("지역별 헬피 목록 출력");

		int totalCnt = helpeeService.getSeoulTotalCnt();
		pvo = new PaginationVO(totalCnt, pvo.getCurPage());
		hvo.setStartRow((pvo.getCurPage() - 1) * pvo.getRowSize());
		hvo.setEndRow(pvo.getRowSize());
		model.addAttribute("PaginationVO", pvo);

		model.addAttribute("seoulList", helpeeService.getSeoulList(svo));
		// 리뷰 리스트 모델에 담기
		model.addAttribute("e_reviewList", helpeeService.getE_ReviewList(evo));
		model.addAttribute("helpeeList", helpeeService.seoulHelpeeList(hvo));
		return "getHelpeeList.jsp";
	}
	
	//2020-06-26 추가 : 헬피가 요청 받는 리퀘스트 (Matching Insert를 위한) 
		@RequestMapping(value = "/helpeeRequest.do", method = RequestMethod.GET)
		public String helpeeRequest(@ModelAttribute("helpee") HelpeeVO vo, @ModelAttribute("seoul") SeoulVO svo, @ModelAttribute("language") LanguageVO lvo, Model model){
			System.out.println("헬피가 요청 받는 리퀘스트.");

			List<LanguageVO> languageList = helpeeService.getLanguageList(lvo);
			model.addAttribute("languageList", languageList);

			List<SeoulVO> seoulList = helpeeService.getSeoulList(svo);
			model.addAttribute("seoulList", seoulList);
			
			HelpeeVO helpee = helpeeService.getHelpee(vo);
			model.addAttribute("helpee", helpee);
			
			return "helpeeRequestForm.jsp";
		}	

}
