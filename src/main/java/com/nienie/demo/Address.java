package com.nienie.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
//    @JsonProperty("street_number")
    public String street_number;
//    @JsonProperty("street_name")
    public String street_name;
    public String city;
    public String state;
    public String zip;

    public Address() {
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetNumber='" + street_number + '\'' +
                ", streetName='" + street_name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
