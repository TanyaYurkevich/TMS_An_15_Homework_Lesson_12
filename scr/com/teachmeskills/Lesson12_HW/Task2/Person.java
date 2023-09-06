package com.teachmeskills.Lesson12_HW.Task2;

public class Person {
    private String typeOfActivity;
    private String age;

    public Person(String type) {
        this.typeOfActivity = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "typeOfActivity='" + typeOfActivity + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
