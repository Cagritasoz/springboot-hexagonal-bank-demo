package com.example.bank.infrastructure.adapter.outbound.database;

import com.example.bank.domain.model.BankAccount;
import org.springframework.stereotype.Component;

//Class to convert a bankAccountEntity to a bankAccount and vice versa.

@Component
public class BankAccountMapper {

    public BankAccount toDomain(BankAccountEntity bankAccountEntity) {
        return new BankAccount(bankAccountEntity.getId(), bankAccountEntity.getAccountHolder(),
                bankAccountEntity.getBalance());
    }

    public BankAccountEntity toEntity(BankAccount bankAccount) {
        return new BankAccountEntity(bankAccount.getId(), bankAccount.getAccountHolder(),
                bankAccount.getBalance());
    }
}
