package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<Account> getAllTopics(){
        return accountService.getAllAccount();
    }

    @RequestMapping("/account/{customer_id}")
    public Account getAccount(@PathVariable Long customer_id){
        return accountService.getAccount(customer_id);
    }

    @RequestMapping("/customers/{customer_id}/accounts")
    public Account getAccountByCustomerId(@PathVariable Long customer_id){
        return accountService.getAccountByCustomerId(customer_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customer_id}/accounts")
    public void getAccountByCustomerId(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/account/{id}")
    public void updateAccount(@RequestBody Account account, @PathVariable Long id){
        accountService.updateAccount(id, account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/account/{id}")
    public void deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }


}
