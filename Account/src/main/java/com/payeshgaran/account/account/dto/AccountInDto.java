package com.payeshgaran.account.account.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class AccountInDto {

    private String accountNumber;
    private BigInteger balance;
    private String pin;
    private Long customerId;
}
