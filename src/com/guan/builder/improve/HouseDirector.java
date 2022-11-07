package com.guan.builder.improve;
//指挥
public class HouseDirector {

    HouseBuilder houseBuilder=null;
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.boildHouse();
    }

}











