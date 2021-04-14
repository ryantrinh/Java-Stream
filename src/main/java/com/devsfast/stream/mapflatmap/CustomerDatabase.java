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
                        2,"Ryan","ryan@gmail.com", Arrays.asList("44444","555555","666666")
                ),
                new Customer(
                        3,"moon","moon@gmail.com", Arrays.asList("111111","222222","33333")
                )
        ).collect(Collectors.toList());
    }
}
