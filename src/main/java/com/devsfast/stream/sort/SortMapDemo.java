package com.devsfast.stream.sort;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("eight",8);
        map.put("two",2);
        map.put("ten",10);
        map.put("three",3);
        map.put("four",4);

        //Traditional sort method
        //Convert to Set
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //Convert to List
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        printList(entries);

    }

    public static void printList(List list){
        list.stream().forEach(o -> System.out.println(o));
    }
}
