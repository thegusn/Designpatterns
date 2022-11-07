package com.guan.visitor;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价是待定");
    }

    @Override
    public void getWomanResult(Wuman woman) {
        System.out.println("女人的评价是待定");
    }
}
