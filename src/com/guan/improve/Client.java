package com.guan.improve;

public class Client {
    public static void main(String[] args) {

        WeatherData weatherData=new WeatherData();
//        创建观察患者
        CurrentConditions currentConditions=new CurrentConditions();
//        添加到集合中
        weatherData.registerObserver(currentConditions);
        weatherData.setData(10f,100f,30f);
    }
}
