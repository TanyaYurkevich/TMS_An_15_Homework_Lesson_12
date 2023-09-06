package com.teachmeskills.Lesson12_HW.Task1.clientModel;

import java.util.ArrayList;

public class Client {
    private double dateRegistration;
    private String name;
    private int age;
    private String e_mail;
    private ArrayList<Order> listOrder;

    public Client(double dateRegistration, String name, int age, String e_mail) {
        this.dateRegistration = dateRegistration;
        this.name = name;
        this.age = age;
        this.e_mail = e_mail;
        listOrder = new ArrayList<>();
    }

    public void addOrder(Order order){
        listOrder.add(order);
    }


    @Override
    public String toString() {
        return "Client{" +
                "dateRegistration=" + dateRegistration +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", e_mail='" + e_mail + '\'' +
                "," + '\n' + "listOrder=" + listOrder +
                '}';
    }
}
