package com.junit.mock.test;

public interface AccountManager {
	/**
	 * ���̵�� ���� ���� ã��
	 * @param userId
	 * @return
	 */
	Account findAccountForUser( String userId);
	
	
	/**
	 * ���� ���� ������Ʈ
	 * @param account
	 */
	void updateAccount(Account account);
}
