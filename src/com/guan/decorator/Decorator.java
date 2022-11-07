package com.guan.decorator;

public class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink obj){
        this.obj=obj;
    }
    @Override
    public float cost() {
//        obj.cost()自己价格
        return super.getPrice()+obj.cost();
    }
    public String getDes(){
//        obj.getDes()输出装饰者的信息
        return super.des+""+super.getPrice()+"&&"+obj.getDes();
    }

























}
