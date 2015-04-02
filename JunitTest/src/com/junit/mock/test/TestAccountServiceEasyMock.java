package com.junit.mock.test;
import static org.junit.Assert.assertEquals;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAccountServiceEasyMock
{
   private AccountManager mockAccountManager;

   @Before
   public void setUp()
   {
       //�� ��ü�� �����Ѵ�.
       mockAccountManager = createMock("mockAccountManager", AccountManager.class );
   }

   @Test
   public void testTransferOk()
   {
       Account senderAccount = new Account( "1", 200 );
       Account beneficiaryAccount = new Account( "2", 100 );

       mockAccountManager.updateAccount( senderAccount );
       mockAccountManager.updateAccount( beneficiaryAccount );

       // ���Ǵ� ���� �� ���� �� ��� �Ѵ�.
       // expect : ���Ǵ� ���� �޼���
       // addReturn : ���� 
       expect( mockAccountManager.findAccountForUser( "1" ) ).andReturn( senderAccount );
       expect( mockAccountManager.findAccountForUser( "2" ) ).andReturn( beneficiaryAccount );
       // �ش� �� ��ü�� �����Ѵ�.
       replay( mockAccountManager );

       AccountService accountService = new AccountService();
       accountService.setAccountManager( mockAccountManager);
       accountService.transfer( "1", "2", 50 );

       assertEquals( 150, senderAccount.getBalance() );
       assertEquals( 150, beneficiaryAccount.getBalance() );
   }

   @After
   public void tearDown()
   {
       // �׽�Ʈ ����
       verify( mockAccountManager);
   }
}