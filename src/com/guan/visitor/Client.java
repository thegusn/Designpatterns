package com.guan.visitor;

public class Client {
    public static void main(String[] args) {
//        创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Wuman());


        Success success = new Success();
        objectStructure.display(success);

        System.out.println("=========================");
        Fail fail=new Fail();
        objectStructure.display(fail);
        System.out.println("=========================");

        Wait wait=new Wait();
        objectStructure.display(wait);
    }
}
