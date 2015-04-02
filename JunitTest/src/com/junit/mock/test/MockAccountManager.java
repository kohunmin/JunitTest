package com.junit.mock.test;

import java.util.HashMap;
import java.util.Map;


public class MockAccountManager implements AccountManager
{

   private Map<String, Account> accounts = new HashMap<String, Account>();

   /**
    * ���̵�� account ��ü�� HashMap��ü�� put
    * 
    * @param userId
    * @param account
    */
   public void addAccount( String userId, Account account )
   {
       this.accounts.put( userId, account );
   }

   /**
    * ���̵�� HashMap��ü���� account ��ü�� ã�� ����
    */
   public Account findAccountForUser( String userId )
   {
       return this.accounts.get( userId );
   }

   /**
    * ���� ������ �����ϸ� ��ȯ���� ����.
    */
   public void updateAccount( Account account )
   {
       // do nothing
   }
}