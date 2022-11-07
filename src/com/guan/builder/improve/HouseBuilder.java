package com.guan.builder.improve;
//抽象建造者
public abstract class HouseBuilder {
    protected  House house=new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House boildHouse(){
        return house;
    }
}
