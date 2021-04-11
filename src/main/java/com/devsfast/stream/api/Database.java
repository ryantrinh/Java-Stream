package com.devsfast.stream.api;

import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> employees = Arrays.asList(
                new Employee("Trung","IT",120000.0),
                new Employee("Ryan","CIV",200000.0),
                new Employee("Moon","IT",90000.0),
                new Employee("Rio","IT",90000.0),
                new Employee("Elise","CIV",90000.0)
        );

        return employees;
    }
}
