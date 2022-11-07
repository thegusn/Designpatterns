package com.guan.game;

import java.awt.*;

public class Memento {

//    攻击力
    private int vit;
    private  int def;

    public Memento(int vit,int def){
        super();
        this.def=def;
        this.vit=vit;
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
