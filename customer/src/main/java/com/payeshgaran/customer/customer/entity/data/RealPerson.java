package com.payeshgaran.customer.customer.entity.data;

import com.payeshgaran.customer.customer.entity.core.BasePerson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@PrimaryKeyJoinColumn(name = "customer_id")
public class RealPerson extends BasePerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    private String firstName;
    private String lastName;
    private Long accountId;



}
