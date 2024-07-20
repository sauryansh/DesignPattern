package com.pritam.designpatter101.strategy;

import java.util.LinkedList;

public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();
    public static void main(String[] args) {
        createOrder();
        //print all Orders
        //PrintService service = new PrintService(new SummaryPrinter());
        PrintService service = new PrintService(new DetailPrinter() );
        service.printOrder(orders);
    }

    private static void createOrder() {
        Order o = new Order("100");
        o.addItem("Cake", 2);
        o.addItem("Cookies", 3);
        o.addItem("Nuts", 4);
        orders.add(o);

        o = new Order("200");
        o.addItem("Soda", 5);
        o.addItem("Chips",6);
        o.addItem("Biscuit", 7);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 10);
        orders.add(o);
    }
}
