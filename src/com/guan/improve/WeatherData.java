package com.guan.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subjrct{
    private float temperanture;
    private float pressure;
    private float humidity;

    /*观察者集合*/
    private List<com.guan.improve.Observer> observers;

    public WeatherData(){
        observers=new ArrayList<com.guan.improve.Observer>();
    }

    public void setData(float temperanture,float pressure,float humidity){
        this.humidity=humidity;
        this.temperanture=temperanture;
        this.pressure=pressure;
        display();
    }
    public void display(){
        notifyObserver();
    }



    public float getTemperanture() {
        return temperanture;
    }

    public void setTemperanture(float temperanture) {
        this.temperanture = temperanture;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(this.temperanture,this.pressure,this.humidity);
        }
    }


































}
