package com.klpr.biz.user;

public interface UserService {
	public UserVO getUser(UserVO vo);
	public void insertUser(UserVO vo);
	public void updateUser(UserVO vo);
	public void updateUserMoney(UserVO vo, int pay);
	public void spendMoney(UserVO vo);
}
