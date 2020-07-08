package com.klpr.biz.user.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.klpr.biz.user.UserDAO;
import com.klpr.biz.user.UserVO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("===> MyBatis로 UserDAOImpl에서 getUser() 기능 처리");
		return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
	}

	@Override
	public void insertUser(UserVO vo) {
		System.out.println("===> MyBatis로 UserDAOImpl에서 insertUser() 기능 처리");
		mybatis.insert("UserDAO.insertUser", vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		System.out.println("===> MyBatis로 UserDAOImpl에서 updateUser() 기능 처리");
		mybatis.update("UserDAO.updateUser", vo);
	}

	@Override
	public void updateUserMoney(UserVO vo, @Param("money") int money) {
		System.out.println("===> MyBatis로 UserDAOImpl에서 updateUserMoney() 기능 처리");
		mybatis.update("UserDAO.updateUserMoney", vo);
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("===> MyBatis로 UserDAOImpl에서 getUserList() 기능 처리");
		return mybatis.selectList("UserDAO.getUserList", vo);
	}

	@Override
	public void spendMoney(UserVO vo) {
		mybatis.update("UserDAO.spendMoney", vo);
	}

}
