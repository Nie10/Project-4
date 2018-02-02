package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRespository;

    public List<Customer> getAllCustomers() {
        List<Customer>customers = new ArrayList<>();
        customerRespository.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(Long customer_id){
        return customerRespository.findOne(customer_id);
    }

    public void addCustomer(Customer customer){
        customerRespository.save(customer);
    }

    public void updateCustomer(Long customer_id, Customer customer){
        customerRespository.save(customer);
    }

    public Customer getCustomerAccount(Long customer_id){
        return customerRespository.findOne(customer_id);
    }

}
