package com.guan.visitor;

public class Man extends Preson{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
