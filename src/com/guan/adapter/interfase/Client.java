package com.guan.adapter.interfase;

public class Client {

    public static void main(String[] args) {
//        想用那个方法只需要重写覆盖就可以了
        Impl impl=new Impl() {
            @Override
            public void m1() {
                super.m1();
                System.out.println("重写并实现了m1方法");
            }
        };
        impl.m1();
    }
}
