package com.dbsolutions.accounts.service;

import com.dbsolutions.accounts.model.Accounts;
import com.dbsolutions.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountsService {

    private final AccountsRepository accountRepository;

    @Autowired
    public AccountsService(AccountsRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Accounts> getAccounts() {
        return accountRepository.findAll();
    }

    public void addAccount(Accounts accounts) {
        Optional<Accounts> accountsOptional =
                accountRepository.findAccountByAccountNumber(accounts.getAccountNumber());

        if (accountsOptional.isPresent()) {
            throw new IllegalStateException("Account number already exists.");
        }
        accountRepository.save(accounts);
    }
}
