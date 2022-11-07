package com.guan.improve;

public class CurrentConditions implements Observer{

//    温度，气压，湿度
    private float temperanture;
    private float pressure;
    private float humidity;

//    更新天气情况，
    public void update(float temperanture,float pressure,float humidity){
        this.humidity=humidity;
        this.temperanture=temperanture;
        this.pressure=pressure;
        display();
    }
    public void display(){
        System.out.println(humidity);
        System.out.println(temperanture);
        System.out.println(pressure);
    }

}
