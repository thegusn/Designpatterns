package com.guan.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");


        OrganizationComponent collge1=new Collge("计算机学院","计算机学院");
        OrganizationComponent collge2=new Collge("信息工程学院","信息工程学院");

        collge1.add(new Department("计算机科学与技术","计算机科学与技术"));
        collge1.add(new Department("软件工程","软件工程"));
        collge2.add(new Department("通信工程","好学"));
        collge2.add(new Department("电信工程","不好学"));

        university.add(collge1);
        university.add(collge2);
        university.prit();
    }
}
