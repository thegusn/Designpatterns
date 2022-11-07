package com.guan.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
//        点一份LongBlack
        Drink longBlack = new LongBlack();
        System.out.println("费用="+longBlack.cost());
        System.out.println("订单="+longBlack.getDes());

        longBlack=new Milk(longBlack);
        System.out.println("费用="+longBlack.cost());
        System.out.println("订单="+longBlack.getDes());

        longBlack=new Chocolate(longBlack);
        System.out.println("费用="+longBlack.cost());
        System.out.println("订单="+longBlack.getDes());
    }
}
