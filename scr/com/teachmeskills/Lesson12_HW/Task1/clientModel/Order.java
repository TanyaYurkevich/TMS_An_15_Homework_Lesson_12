package com.teachmeskills.Lesson12_HW.Task1.clientModel;

public class Order {
    private String nameItem;
    private String category;
    private double price;
    private String description;


    public Order(String nameItem, String category, double price, String description) {
        this.nameItem = nameItem;
        this.category = category;
        this.price = price;
        this.description = description ;

    }

    @Override
    public String toString() {
        return '\n' +"Order{" +
                "nameItem='" + nameItem + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
