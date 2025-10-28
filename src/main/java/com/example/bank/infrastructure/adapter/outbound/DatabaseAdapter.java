package com.example.bank.infrastructure.adapter.outbound;

import com.example.bank.domain.model.BankAccount;
import com.example.bank.domain.port.outbound.BankAccountRepository;
import com.example.bank.infrastructure.entity.BankAccountEntity;
import com.example.bank.infrastructure.mapper.BankAccountMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Optional;

@Component //@Component is an annotation that allows Spring to detect our custom beans automatically.
public class DatabaseAdapter implements BankAccountRepository {
    private HashMap<Long, BankAccountEntity> accounts;
    private BankAccountMapper bankAccountMapper;

    public DatabaseAdapter(BankAccountMapper bankAccountMapper) {
        accounts = new HashMap<>();
        accounts.put(1L, new BankAccountEntity(1L,"Michael Syfers", 500));
        accounts.put(2L, new BankAccountEntity(2L,"Ava Smith", 300));
        this.bankAccountMapper = bankAccountMapper; //example of Dependency Injection
    }

    @Override
    public Optional<BankAccount> findAccountById(long id) {
        return Optional.of(new BankAccount(0, "Default", 0));
    }

    @Override
    public void createAccount(BankAccount bankAccount) {

    }

    @Override
    public void updateAccount(BankAccount bankAccount) {

    }
}
