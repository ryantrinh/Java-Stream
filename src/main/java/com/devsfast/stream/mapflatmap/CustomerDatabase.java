package com.devsfast.stream.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(
                        1,"Trung","trung@gmail.com", Arrays.asList("9999999","888888","777777")
                ),
                new Customer(
                        1,"Ryan","ryan@gmail.com", Arrays.asList("9999999","888888","777777")
                )
        ).collect(Collectors.toList());
    }
}
