package com.klpr.biz.user;

import java.util.List;

public interface UserDAO {
	// 회원 존재 여부를 알려준다
	public UserVO getUser(UserVO vo);
	// 회원을 가입시킨다
	public void insertUser(UserVO vo);
	// 회원 정보 수정
	public void updateUser(UserVO vo);
	// 회원 돈 충전
	public void updateUserMoney(UserVO vo, int money);
	// 회원 목록
	public List<UserVO> getUserList(UserVO vo);
	
	public void spendMoney(UserVO vo);
}
