package com.example.bank.domain.port.inbound;

//Inbound port for using the money transfer services

public interface MoneyTransferUseCase {

    void transferMoney(long senderId, long receiverId, double amount);

}
