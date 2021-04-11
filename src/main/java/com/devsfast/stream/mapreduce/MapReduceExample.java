package com.devsfast.stream.mapreduce;

import com.devsfast.stream.api.Database;
import com.devsfast.stream.api.Employee;

import java.util.List;
import java.util.OptionalDouble;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Employee> employees = Database.getEmployees();

        //Total Salary of IT Dep
        Double totalITSalary = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .map(employee -> employee.getSalary())
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(totalITSalary);

        //Average Salary of IT Dep

        Double averageSalary = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .mapToDouble(Employee::getSalary)
                .average().getAsDouble();
        System.out.println(averageSalary);

        //Max Salary in IT Dep

        Double maxSalary = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .map(Employee::getSalary)
                .reduce(0.0, (a, b) -> a > b ? a : b);
        System.out.println(maxSalary);

        //Max Salary using method reference

        Double maxSalaryUsingReference = employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(Double::max)
                .get();
        System.out.println(maxSalaryUsingReference);



    }
}
