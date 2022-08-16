package com.dbsolutions.accounts.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Accounts {

    @Id
    private Long accountNumber;
//    private Long customerId;
    private String accountType;
    private String branchLocale;
    private LocalDate createDate;

    public Accounts() {
    }

    public Accounts(Long accountNumber, String accountType, String branchLocale, LocalDate createDate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchLocale = branchLocale;
        this.createDate = createDate;
    }

    public Accounts(String accountType, String branchLocale, LocalDate createDate) {
        this.accountType = accountType;
        this.branchLocale = branchLocale;
        this.createDate = createDate;
    }
}