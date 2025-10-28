package com.example.bank.domain.service;


import com.example.bank.domain.port.inbound.MoneyTransferUseCase;
import com.example.bank.domain.port.outbound.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class MoneyTransferService implements MoneyTransferUseCase {

    private BankAccountRepository bankAccountRepository;

    public MoneyTransferService(BankAccountRepository bankAccountRepository) { //example of Dependency Injection
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public void transferMoney(long senderId, long receiverId, double amount) {

    }
}
