package com.ithe;

import com.ithe.config.SpringConfig;
import com.ithe.dao.AccountDao;
import com.ithe.dao.Imp.AccountDaoImp;
import com.ithe.domain.Account;
import com.ithe.service.AccountService;
import com.ithe.service.Imp.AccountServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AccountDao accountDao = ctx.getBean(AccountDaoImp.class);
//        Account account;
//        for (int i = 0; i <1 ; i++) {
//            account = new Account();
//            account.setName("Test"+i);
//            account.setMoney(1000.00+i);
//            accountDao.save(account);
//        }
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        accountService.transfer("Test0","Test1",200.0);




//        List<Account> list =  accountService.findAll();
//        for (Account account1:list) {
//            System.out.println(account1.toString());
//        }


    }
}
