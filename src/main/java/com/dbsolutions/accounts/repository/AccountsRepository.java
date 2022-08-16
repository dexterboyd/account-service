package com.dbsolutions.accounts.repository;

import com.dbsolutions.accounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

//    Accounts findByCustomerId(Long customerId);

    @Query("SELECT s FROM Accounts s WHERE s.accountNumber = ?1")
    Optional<Accounts> findAccountByAccountNumber(Long accountNumber);
}