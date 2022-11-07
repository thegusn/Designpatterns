package com.guan.order;

import com.guan.simplefactory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleOrder {

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
    Simplefactory simplefactory;
    Pizza pizza=null;
    public SimpleOrder(Simplefactory simplefactory){
        creat(simplefactory);
    }

    public void creat(Simplefactory simplefactoryr){
        String oredrType="";
        this.simplefactory=simplefactoryr;
        do{
            oredrType=gettype();
            pizza=this.simplefactory.createPizza(oredrType);

            if(pizza!=null){
                pizza.bake();;
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }
}
