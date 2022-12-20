package com.payeshgaran.customer.customer.entity.valueObject;

import lombok.*;

import java.math.BigInteger;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountM {

    private String accountNumber;
    private BigInteger balance;
    private String pin;
    private Long customerId;

}
