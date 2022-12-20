package com.payeshgaran.customer.customer.entity.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Setter
@Getter
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class BasePerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigInteger balance;
    private String pin;

    public BasePerson() {

    }

//    public BasePerson() {
//        this.id = UUID.randomUUID().toString();
//    }


}
