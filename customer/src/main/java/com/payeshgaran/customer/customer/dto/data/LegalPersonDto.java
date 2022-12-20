package com.payeshgaran.customer.customer.dto.data;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class LegalPersonDto {

    private String accountNumber;
    private BigInteger balance;
    private String pin;
    private String nameOfCompany;
    private Long accountId;
}
