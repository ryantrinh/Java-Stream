package com.devsfast.stream.optional;

import com.devsfast.stream.mapflatmap.Customer;
import com.devsfast.stream.mapflatmap.CustomerDatabase;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) throws Exception {
        return CustomerDatabase.getAll().stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception("No customer found"));
    }

    public static void main(String[] args) throws Exception {

        Customer customerByEmail = OptionalDemo.getCustomerByEmail("test@gmail.com");
        System.out.println(customerByEmail);

    }
}
