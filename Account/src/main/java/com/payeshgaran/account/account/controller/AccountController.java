package com.payeshgaran.account.account.controller;

import com.payeshgaran.account.account.entity.data.Account;
import com.payeshgaran.account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Account>> findByCustomerId(Long customerId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(accountService.findByCustomerId(customerId));

    }

}
