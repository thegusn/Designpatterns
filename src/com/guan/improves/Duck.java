package com.guan.improves;

public abstract class Duck {

    FlyBehavior flyBehavior;

//    显示鸭子信息
    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫");

    }
    public void swit(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
