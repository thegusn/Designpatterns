package com.guan.adapter.objectadapter;

import com.guan.adapter.IVoltage5V;

//适配器
public class VpltageAdapter  implements IVoltage5V {

    private Voltage220V voltage220V;


    public VpltageAdapter(Voltage220V voltage220V){
        super();
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5V() {

        int dst=0;
        int src=0;
        if(voltage220V!=null){
            src=voltage220V.output220V();
            System.out.println("使用对象适配器");
        }
        dst=src/44;
        return dst;
    }
}
