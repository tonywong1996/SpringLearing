package com.ithe.service;

import com.ithe.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    Account finById(Integer id);

    List<Account> findAll();

    void transfer(String out, String in , Double money);

}
