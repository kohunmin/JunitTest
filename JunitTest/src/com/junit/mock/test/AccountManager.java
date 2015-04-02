package com.junit.mock.test;

public interface AccountManager {
	/**
	 * 아이디로 계좌 계정 찾기
	 * @param userId
	 * @return
	 */
	Account findAccountForUser( String userId);
	
	
	/**
	 * 게좌 계정 업데이트
	 * @param account
	 */
	void updateAccount(Account account);
}
