package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{customer_id}")
    public Customer getCustomer(@PathVariable Long customer_id){
        return  customerService.getCustomer(customer_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{customer_id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long customer_id){
        customerService.updateCustomer(customer_id,customer);
    }

    @RequestMapping("/accounts/{customer_id}/customer")
    public Customer getCustomerAccount(@PathVariable Long customer_id){
        return customerService.getCustomerAccount(customer_id);
    }

}
