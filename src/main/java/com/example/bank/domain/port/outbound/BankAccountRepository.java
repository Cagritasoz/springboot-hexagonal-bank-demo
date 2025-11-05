package com.example.bank.domain.port.outbound;

import com.example.bank.domain.model.BankAccount;
import java.util.Optional;

//Outbound port for the database

public interface BankAccountRepository {

    Optional<BankAccount> findAccountById(long id);

    void createAccount(BankAccount bankAccount);

    void updateAccount(BankAccount bankAccount);

}
