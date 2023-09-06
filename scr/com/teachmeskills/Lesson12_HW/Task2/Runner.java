package com.teachmeskills.Lesson12_HW.Task2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        map.put("Andrew Reut",new Person("teacher"));
        map.put("Dovlet Atakishiev",new Person("student"));
        map.put("Andrey Troan",new Person("student"));
        map.put("Hleb Yurchuk",new Person("student"));
        map.put("Aleksander Grouzdev",new Person("student"));
        map.put("Aleksei Gorbal",new Person("student"));
        map.put("Vladimir Bashlikov",new Person("student"));
        map.put("Vladislav Losik",new Person("student"));
        map.put("Dmitry Kripan",new Person("student"));
        map.put("Roman Belov",new Person("student"));
        map.put("Tatyana Yurkevich",new Person("student"));

        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("->" + entry.getValue());

        }
    }
}
