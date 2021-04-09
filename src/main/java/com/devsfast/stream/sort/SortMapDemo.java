package com.devsfast.stream.sort;

import com.devsfast.stream.api.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("eight", 8);
        map.put("two", 2);
        map.put("ten", 10);
        map.put("three", 3);
        map.put("four", 4);

        //Traditional sort method
        //Convert to Set
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //Convert to List
//        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });
//        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//        printList(entries);

//        map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
//                .forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));

//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
//                .forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));


        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        employeeMap.put(new Employee("Trung Trinh","IT", 80000), 200);
        employeeMap.put(new Employee("Ryan Trinh","CV", 90000), 100);
        employeeMap.put(new Employee("Moon Trinh","OG", 67000), 400);
        employeeMap.put(new Employee("Rio Trinh","MP", 50000), 600);

//        System.out.println(employeeMap);

        //Sorted by Key
//        employeeMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey((o1, o2) -> (int) (o2.getSalary()-o1.getSalary())))
//                .forEach(employeeIntegerEntry -> System.out.println(employeeIntegerEntry));

        //Sorted by Value

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1)))
                .forEach(employeeIntegerEntry -> System.out.println(employeeIntegerEntry));


    }

//    public static void printList(List list) {
//        list.stream().forEach(o -> System.out.println(o));
//    }
}
