package com.guan.responsibilitychain;

public class PurchaseRequest {

    private int type=0;
    private float price =0.0f;
    private int id=0;
//    构造器
    public PurchaseRequest(int type,float price,int id){
        this.id=id;
        this.price=price;
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
