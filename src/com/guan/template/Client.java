package com.guan.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();


        System.out.println("--------------------------------------------");
        System.out.println("制作花生豆浆");
        SoyaMilk redBeanSoyaMilk1 = new PeanutSoyaMilk();
        redBeanSoyaMilk1.make();
        System.out.println("--------------------------------------------");
        System.out.println("制作纯豆浆");
        SoyaMilk PureSoyaMilk=new PureSoyaMilk();
        PureSoyaMilk.make();
    }
}
