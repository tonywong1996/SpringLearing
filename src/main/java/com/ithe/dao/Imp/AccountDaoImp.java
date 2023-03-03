package com.ithe.dao.Imp;

import com.ithe.dao.AccountDao;
import com.ithe.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AccountDaoImp implements AccountDao {
    public void save(Account account) {
        System.out.println("=======save");

    }

    public void delete(Integer id) {

    }

    public void update(Account account) {
        System.out.println("=======update");

    }

    public Account finById(Integer id) {
        return null;
    }

    public List<Account> findAll() {
        return null;
    }

    public void inMoney(String name, Double money) {
        System.out.println("=======inMoney");

    }

    public void outMoney(String name, Double money) {
        System.out.println("=======outMoney");

    }
}
