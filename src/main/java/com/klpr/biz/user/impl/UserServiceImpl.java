package com.klpr.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.user.UserDAO;
import com.klpr.biz.user.UserService;
import com.klpr.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	@Override
	public void updateUserMoney(UserVO vo, int pay) {
		userDAO.updateUserMoney(vo, pay);
	}

	@Override
	public void spendMoney(UserVO vo) {
		userDAO.spendMoney(vo);
	}
}
