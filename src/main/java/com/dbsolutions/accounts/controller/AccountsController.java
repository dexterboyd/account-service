package com.dbsolutions.accounts.controller;

import com.dbsolutions.accounts.model.Accounts;
import com.dbsolutions.accounts.model.Customer;
import com.dbsolutions.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

//    @Autowired
//    public AccountsController(AccountsRepository accountsRepository) {
//        this.accountsRepository = accountsRepository;
//    }

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}