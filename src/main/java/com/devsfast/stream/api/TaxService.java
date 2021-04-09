package com.devsfast.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateListTaxUsers(){
        return Database.getEmployees().stream().filter(employee -> employee.getSalary() > 100000).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        evaluateListTaxUsers().forEach(employee -> System.out.println(employee));

    }
}
