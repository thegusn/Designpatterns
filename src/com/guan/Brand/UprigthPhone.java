package com.guan.Brand;

public class UprigthPhone extends Phone{
    public UprigthPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("直立式的手机");
    }
    public void close(){
        super.close();
        System.out.println("直立式的手机");
    }
    public void call(){
        super.call();
        System.out.println("直立式的手机");
    }
}
