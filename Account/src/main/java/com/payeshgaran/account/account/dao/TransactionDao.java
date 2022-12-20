package com.payeshgaran.account.account.dao;

import com.payeshgaran.account.account.entity.data.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction,Long> {


}
