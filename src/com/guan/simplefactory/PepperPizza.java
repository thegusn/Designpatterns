package com.guan.simplefactory;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备材料");
    }
}
