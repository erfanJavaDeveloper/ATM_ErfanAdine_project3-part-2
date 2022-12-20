package com.payeshgaran.account.account.entity.data;

import com.payeshgaran.account.account.entity.core.BasePerson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigInteger;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "account_id")
public class Account extends BasePerson {

    private String accountNumber;
    private BigInteger balance;
    private String pin;
    private Long customerId;
}
