package com.payeshgaran.account.account.entity.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public class BasePerson {
    @Id
    @GeneratedValue
    private Long id;

//    public BasePerson() {
//        this.id = UUID.randomUUID().toString();
//    }

}
