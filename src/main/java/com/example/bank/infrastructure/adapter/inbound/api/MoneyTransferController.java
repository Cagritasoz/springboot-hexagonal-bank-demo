package com.example.bank.infrastructure.adapter.inbound.api;

import com.example.bank.domain.port.inbound.MoneyTransferUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//API for money transfers

@RestController
public class MoneyTransferController {

    private final MoneyTransferUseCase moneyTransferUseCase;

    public MoneyTransferController(MoneyTransferUseCase moneyTransferUseCase) {
        this.moneyTransferUseCase = moneyTransferUseCase; //example of Dependency Injection
    }

    @PostMapping("/transfer") //PostMapping says handle POST requests
    public void transferMoney(@RequestParam long senderId,
                              @RequestParam long receiverId,
                              @RequestParam double amount) { //RequestParam says have these parameters when sending a request
        try {
            moneyTransferUseCase.transferMoney(senderId,receiverId,amount);
            System.out.println("Transfer successfully completed!");
        }
        catch (Exception e) {
            System.out.println("An exception has occurred! (" + e.getMessage() +")");
        }
    }
}
