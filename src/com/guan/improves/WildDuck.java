package com.guan.improves;

public class WildDuck extends Duck{

//    构造器，传入FlyBehavor的的对象
    public WildDuck(){
        flyBehavior=new GoodFlyBehavior();

    }
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
