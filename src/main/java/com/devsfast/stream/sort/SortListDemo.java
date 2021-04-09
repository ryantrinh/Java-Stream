package com.devsfast.stream.sort;

import com.devsfast.stream.api.Database;
import com.devsfast.stream.api.Employee;

import java.util.Collections;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Employee> employees = Database.getEmployees();

        //Traditional Method
        //ASC
//        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        //DES
        Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

        printList(employees);

    }
    public static void printList(List<Employee> employees){
        employees.forEach(employee -> System.out.println(employee));
    }

}

