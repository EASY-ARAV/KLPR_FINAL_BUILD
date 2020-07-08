package com.klpr.biz.withdraw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.withdraw.WithdrawDAO;
import com.klpr.biz.withdraw.WithdrawService;
import com.klpr.biz.withdraw.WithdrawVO;

@Service("withdrawService")
public class WithdrawServiceImpl implements WithdrawService {

	@Autowired
	private WithdrawDAO withdrawDAO;

	@Override
	public void insertWithdrawBank(WithdrawVO vo) {
		withdrawDAO.insertWithdrawBank(vo);
	}

	@Override
	public void insertWithdrawKakao(WithdrawVO vo) {
		withdrawDAO.insertWithdrawKakao(vo);
	}

}
