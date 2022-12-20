package com.payeshgaran.customer.customer.dto.data;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class RealPersonDto {

    private String firstName;
    private String lastName;
    private String accountNumber;
    private BigInteger balance;
    private String pin;
    private Long accountId;

}
