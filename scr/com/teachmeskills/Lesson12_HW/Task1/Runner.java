package com.teachmeskills.Lesson12_HW.Task1;

import com.teachmeskills.Lesson12_HW.Task1.clientModel.Client;
import com.teachmeskills.Lesson12_HW.Task1.clientModel.Order;
import com.teachmeskills.Lesson12_HW.Task1.clientModel.Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client(10.07, "Kris", 23, "Kris23");
        Client client1 = new Client(15.05, "Nikita", 26, "Nikita23");

        Order order = new Order("sweater", "clothes", 70.5, "1 description");
        Order order1 = new Order("dress", "clothes", 95.5, "2 description");
        Order order2 = new Order("sneakers", "shoes", 150.5, "3 description");
        Order order3 = new Order("hoodie", "clothes", 80.5, "4 description");

        client.addOrder(order);
        client.addOrder(order1);
        client1.addOrder(order2);
        client1.addOrder(order3);

        Map<String, Client> map = new HashMap<>();
        map.put(Utils.PASSPORT_NUMBER1, client);
        map.put(Utils.PASSPORT_NUMBER2, client1);

        for (Map.Entry<String, Client> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }System.out.println("********");

        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Client> myEntry = iterator.next();
            System.out.println(myEntry.getKey() + "->" + myEntry.getValue());
        }System.out.println("********");

        for(String key : map.keySet()){
            System.out.println(key);
        }System.out.println("********");

        for(Client clients : map.values()){
            System.out.println(clients);
        }
    }
}
