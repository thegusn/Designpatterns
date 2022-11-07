package com.guan.test;

import com.guan.order.SimpleOrder;
import com.guan.simplefactory.Simplefactory;

public class PizzaStore1 {
    public static void main(String[] args) {
        new SimpleOrder(new Simplefactory());
    }
}
