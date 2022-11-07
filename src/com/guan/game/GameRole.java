package com.guan.game;

public class GameRole {

    private int vit;
    private int def;


//    创建
    public Memento createMemento(){
        return new Memento(vit,def);
    }
//    从备忘录里拿
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit=memento.getVit();
        this.def=memento.getDef();
    }

    public void display(){
        System.out.println("攻击力为"+this.vit+"防御力为"+this.def);
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
