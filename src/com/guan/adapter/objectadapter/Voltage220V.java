package com.guan.adapter.objectadapter;
//被适配类
public class Voltage220V {
    public  int output220V(){
        int src=220;
        System.out.println("电压"+src+"伏");
        return src;
    }
}
