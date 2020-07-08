package com.klpr.biz.payment;

import java.util.List;

public interface PaymentService {

	// 결제준비
	public PaymentVO kakaoPayReady(PaymentVO vo);

	// 결제승인
	public PaymentVO kakaoPayApproval(PaymentVO vo, String pg_token);

	// 결제 히스토리
	public List<PaymentVO> getChargeList(PaymentVO vo);
}
