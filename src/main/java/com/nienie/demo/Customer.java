package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JsonProperty("customer_id")
    public Long customer_id;
//    @JsonProperty("first_name")
    public String first_name;
//    @JsonProperty("last_name")
    public String last_name;

    @OneToMany(cascade = CascadeType.ALL)
    public Set<Address> address;

    public Customer() {
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customer_id +
                ", first_Name='" + first_name + '\'' +
                ", last_Name='" + last_name + '\'' +
                ", address=" + address +
                '}';
    }
}
