package com.junit.mock.test;

import java.util.HashMap;
import java.util.Map;


public class MockAccountManager implements AccountManager
{

   private Map<String, Account> accounts = new HashMap<String, Account>();

   /**
    * 아이디와 account 객체를 HashMap객체에 put
    * 
    * @param userId
    * @param account
    */
   public void addAccount( String userId, Account account )
   {
       this.accounts.put( userId, account );
   }

   /**
    * 아이디로 HashMap객체에서 account 객체를 찾아 리턴
    */
   public Account findAccountForUser( String userId )
   {
       return this.accounts.get( userId );
   }

   /**
    * 계정 정보를 갱신하며 반환값은 없다.
    */
   public void updateAccount( Account account )
   {
       // do nothing
   }
}