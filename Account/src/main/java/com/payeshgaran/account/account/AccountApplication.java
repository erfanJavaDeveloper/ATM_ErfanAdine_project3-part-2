package com.payeshgaran.account.account;

import com.payeshgaran.account.account.entity.data.Account;
import com.payeshgaran.account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;

@SpringBootApplication
public class AccountApplication {

//    private final AccountService accountService;
//
//    @Autowired
//    public AccountApplication(AccountService accountService) {
//        this.accountService = accountService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }


    @Bean
    CommandLineRunner run(AccountService accountService ) {
        return args -> {

            accountService.save(new Account("6038",BigInteger.valueOf(5000),"123",1L));
            accountService.save(new Account("6038",BigInteger.valueOf(5000),"123",2L));
            accountService.save(new Account("6038",BigInteger.valueOf(5000),"123",3L));
            accountService.save(new Account("6038",BigInteger.valueOf(5000),"123",4L));
            accountService.save(new Account("6038",BigInteger.valueOf(5000),"123",5L));




        };
    }
}
