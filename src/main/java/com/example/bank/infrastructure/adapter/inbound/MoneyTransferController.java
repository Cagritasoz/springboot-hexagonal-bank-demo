package com.example.bank.infrastructure.adapter.inbound;

import com.example.bank.domain.port.inbound.MoneyTransferUseCase;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyTransferController {

    private MoneyTransferUseCase moneyTransferUseCase;

    public MoneyTransferController(MoneyTransferUseCase moneyTransferUseCase) {
        this.moneyTransferUseCase = moneyTransferUseCase; //example of Dependency Injection
    }

}
