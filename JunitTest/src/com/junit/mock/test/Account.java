package com.junit.mock.test;

public class Account {
	/**
	 * ���� ���̵�
	 */
	private String accountId;
	
	/**
	 * ���� �ܰ�
	 */
	private long balance;

	/**
	 * �ʱ�ȭ
	 * @param accountId
	 * @param initialBalance
	 */
	public Account(String accountId, long initialBalance) {
		this.accountId = accountId;
		this.balance = initialBalance;
	}
	
	/**
	 * ���
	 * @param amount
	 */
	public void debit( long amount)
	{
		this.balance -= amount;
	}
	
	/**
	 * �Ա�
	 * @param amount
	 */
	public void credit( long amount)
	{
		this.balance += amount;
	}
	
	/**
	 * ���� �ܰ�
	 * @return
	 */
	public long getBalance()
	{
		return this.balance;
	}
}
