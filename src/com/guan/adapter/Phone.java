package com.guan.adapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("电压为5V可以充电");
        }else{
            System.out.println("不能充电");
        }
    }
}
