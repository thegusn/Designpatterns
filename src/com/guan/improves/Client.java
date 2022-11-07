package com.guan.improves;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck=new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck=new PekingDuck();
        pekingDuck.fly();
//        动态改变北京鸭的飞行
        pekingDuck.setFlyBehavior(new BadFlyBehavior());
        pekingDuck.fly();
    }
}
