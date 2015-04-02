package com.junit.mock.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAccountService
{
   @Test
   public void testTransferOk()
   {
       //�׽�Ʈ�� �ϱ����� ��ü ���� �� �غ�
       MockAccountManager mockAccountManager = new MockAccountManager();
       Account senderAccount = new Account( "1", 200 );  
       Account beneficiaryAccount = new Account( "2", 100 );
       mockAccountManager.addAccount( "1", senderAccount );
       mockAccountManager.addAccount( "2", beneficiaryAccount );
       
       AccountService accountService = new AccountService();
       accountService.setAccountManager( mockAccountManager );
       // �׽�Ʈ ����
       accountService.transfer( "1", "2", 50 );
       // ��� ����
       assertEquals( 150, senderAccount.getBalance() );
       assertEquals( 150, beneficiaryAccount.getBalance() );
   }
}