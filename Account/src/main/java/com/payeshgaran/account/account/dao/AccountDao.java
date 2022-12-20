package com.payeshgaran.account.account.dao;

import com.payeshgaran.account.account.entity.data.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao extends JpaRepository<Account,Long> {

    //todo 5-نمایش تمامی حساب های شخص
    @Query("select a from Account a where a.customerId = ?1")
    List<Account> findByCustomerId(Long customerId);
}
