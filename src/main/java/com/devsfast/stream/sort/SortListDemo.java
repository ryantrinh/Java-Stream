package com.devsfast.stream.sort;

import com.devsfast.stream.api.Database;
import com.devsfast.stream.api.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortListDemo {
    public static void main(String[] args) {
        List<Employee> employees = Database.getEmployees();

        //Traditional Method

        //ASC
//        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        //DES
//        Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

//        Collections.sort(employees, new MyComparator());
//        printList(employees);

        //Stream sort method

        employees.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(employee -> System.out.println(employee));


    }

    public static void printList(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee));
    }

}

class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

