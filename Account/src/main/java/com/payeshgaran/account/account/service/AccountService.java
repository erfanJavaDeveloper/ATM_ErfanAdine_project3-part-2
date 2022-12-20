package com.payeshgaran.account.account.service;

import com.payeshgaran.account.account.dao.AccountDao;
import com.payeshgaran.account.account.entity.data.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountDao accountDao;

    @Autowired
    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findByCustomerId(Long customerId) {

        return accountDao.findByCustomerId(customerId);

    }

    public void save(Account account){
        accountDao.save(account);
    }


}
