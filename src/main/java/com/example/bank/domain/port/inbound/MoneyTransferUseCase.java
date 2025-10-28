package com.example.bank.domain.port.inbound;

public interface MoneyTransferUseCase { //Inbound port for using the money transfer services

    void transferMoney(long senderId, long receiverId, double amount);

}
