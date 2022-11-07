package com.guan.game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Caretaker {

//    只保存一次
    private Memento memento;

//    保存多次
//    private ArrayList<Memento> mementoArrayList;
//
//    private HashMap<String ,ArrayList<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
