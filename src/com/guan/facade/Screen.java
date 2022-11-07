package com.guan.facade;

public class Screen {
    private static Screen instance=new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Screen on");
    }
    public void off(){
        System.out.println("Screen off");
    }
    public void pop(){
        System.out.println("Screen pop");
    }
}
