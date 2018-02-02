package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccount() {
        List<Account>accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public Account getAccount(Long customer_id){
        return accountRepository.findOne(customer_id);
    }

    public Account getAccountByCustomerId(Long customer_id){
        return accountRepository.findOne(customer_id);
    }

    public void addAccount(Account account){
        accountRepository.save(account);
    }

    public void updateAccount(Long customer_id, Account account){
        accountRepository.save(account);
    }


    public void deleteAccount(Long id){
        accountRepository.delete(id);
    }


}
