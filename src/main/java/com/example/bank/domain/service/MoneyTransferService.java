package com.example.bank.domain.service;


import com.example.bank.domain.model.BankAccount;
import com.example.bank.domain.port.inbound.MoneyTransferUseCase;
import com.example.bank.domain.port.outbound.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class MoneyTransferService implements MoneyTransferUseCase {

    private final BankAccountRepository bankAccountRepository;

    public MoneyTransferService(BankAccountRepository bankAccountRepository) { //example of Dependency Injection
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public void transferMoney(long senderId, long receiverId, double amount) {

        BankAccount senderAccount = bankAccountRepository.findAccountById(senderId).orElseThrow(()->
                new IllegalArgumentException("Sender account does not exist!") );

        BankAccount receiverAccount = bankAccountRepository.findAccountById(receiverId).orElseThrow(()->
                new IllegalArgumentException("Receiver account does not exist!"));

        if(senderAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Sender balance missing funds: " + (amount-senderAccount.getBalance()));
        }

        senderAccount.setBalance(senderAccount.getBalance()-amount);
        receiverAccount.setBalance(receiverAccount.getBalance()+amount);

        bankAccountRepository.updateAccount(senderAccount);
        bankAccountRepository.updateAccount(receiverAccount);
    }
}
