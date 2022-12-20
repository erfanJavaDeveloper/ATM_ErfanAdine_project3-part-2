package com.payeshgaran.account.account.entity.data;


import com.payeshgaran.account.account.entity.core.BasePerson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigInteger;

@Entity
@Setter
@Getter
@PrimaryKeyJoinColumn(name = "transaction_id")
public class Transaction extends BasePerson {

    private String accountNumber;
    private BigInteger balance;
    private String pin;

}
