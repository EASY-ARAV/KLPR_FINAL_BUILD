package com.klpr.biz.withdraw;

public interface WithdrawService {
	// 무통장 인출 요청
	public void insertWithdrawBank(WithdrawVO vo);

	// 카카오페이 인출 요청
	public void insertWithdrawKakao(WithdrawVO vo);
}
