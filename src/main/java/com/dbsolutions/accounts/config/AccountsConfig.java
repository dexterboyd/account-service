package com.dbsolutions.accounts.config;

import com.dbsolutions.accounts.model.Accounts;
import com.dbsolutions.accounts.repository.AccountsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class AccountsConfig {

    @Bean
    CommandLineRunner commandLineRunner(AccountsRepository accountsRepository) {
        return args -> {
            Accounts richard = new Accounts(
                    4229003255L,
                    "Savings",
                    "224 Russell Street, New York",
                    LocalDate.of(2022, Month.JULY, 29));
            accountsRepository.saveAll(
                    List.of(richard));
        };
    }
}