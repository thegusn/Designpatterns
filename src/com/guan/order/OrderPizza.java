package com.guan.order;

import com.guan.simplefactory.CheesePizza;
import com.guan.simplefactory.GreekPizza;
import com.guan.simplefactory.PepperPizza;
import com.guan.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private String gettype(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入想要的披萨口味");
            String str=bufferedReader.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }

    }
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do{
            orderType=gettype();
            if(orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if (orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("胡椒披萨");
            }else {
                break;
            }
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);


    }

}
