package com.pritam.designpatter101.strategy;

import java.util.Collection;

//Strategy
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
