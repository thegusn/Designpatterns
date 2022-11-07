package com.guan.visitor;

public class Wuman extends Preson{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
