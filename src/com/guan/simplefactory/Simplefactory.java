package com.guan.simplefactory;

public class Simplefactory {

    public Pizza createPizza(String OrderType){
        Pizza pizza=null;
        System.out.println("使用简单工厂模式");
        if(OrderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(OrderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (OrderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
