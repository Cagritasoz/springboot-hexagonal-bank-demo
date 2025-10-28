package com.example.bank.domain.port.outbound;

import com.example.bank.domain.model.BankAccount;

import java.util.Optional;

public interface BankAccountRepository { //Outbound port for the database

    Optional<BankAccount> findAccountById(long id);

    void createAccount(BankAccount bankAccount);

    void updateAccount(BankAccount bankAccount);

}
