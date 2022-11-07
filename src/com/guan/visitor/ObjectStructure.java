package com.guan.visitor;

import com.guan.simplefactory.PepperPizza;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
//    维护了一个集合
    private List<Preson> presons=new LinkedList<>();
//    添加到集合中
    public void attach(Preson preson){
        presons.add(preson);
    }
    public void detach(Preson preson){
        presons.remove(preson);
    }


    public void display(Action action){
        for(Preson p:presons){
            p.accept(action);
        }
    }
}






















