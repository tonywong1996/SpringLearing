package com.ithe.service.Imp;

import com.ithe.dao.AccountDao;
import com.ithe.domain.Account;
import com.ithe.service.AccountService;
import com.ithe.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service("accountService")
public class AccountServiceImp implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void save(Account account) {
        accountDao.save(account);

    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public Account finById(Integer id) {
        return accountDao.finById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out,money);
//            int i = 10/0;
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out, in, money);
        }

    }


}
