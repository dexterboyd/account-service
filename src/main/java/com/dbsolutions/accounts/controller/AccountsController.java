package com.dbsolutions.accounts.controller;

import com.dbsolutions.accounts.model.Accounts;
import com.dbsolutions.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/accounts")
public class AccountsController {

    private final AccountsService accountsService;

    @Autowired
    public AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @GetMapping
    public List<Accounts> getAccounts() {
        return accountsService.getAccounts();
    }

//    @PostMapping
//    public void registerNewAccount(@RequestBody Accounts accounts) {
//        accountsService.addAccount(accounts);
//    }
//
//    @PostMapping("/myAccount")
//    public Accounts getAccountDetails(@RequestBody Accounts accounts) {
//
//        accounts = accountsService.addNewCustomer(accounts.getAccountNumber());
//        if (accounts != null) {
//              return accounts;
//        } else {
//            return null;
//        }
//    }
}