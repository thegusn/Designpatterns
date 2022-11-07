package com.guan.improve;


//接口
public interface Subjrct {

    public  void registerObserver(Observer o);
    public  void removeObserver(Observer o);
    public  void notifyObserver();

}
