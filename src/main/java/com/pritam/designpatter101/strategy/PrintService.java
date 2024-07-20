package com.pritam.designpatter101.strategy;

import java.util.LinkedList;
//Context
public class PrintService {
    private OrderPrinter orderPrinter;

    public PrintService(OrderPrinter orderPrinter){
        this.orderPrinter = orderPrinter;
    }
    public void printOrder(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
