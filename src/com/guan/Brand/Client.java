package com.guan.Brand;

public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.close();
        foldedPhone.open();
        foldedPhone.call();

        Phone uprigthPhone = new UprigthPhone((new Vivo()));
        uprigthPhone.open();
        uprigthPhone.call();
        uprigthPhone.close();
    }
}
