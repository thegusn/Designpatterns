package com.guan.game;

public class Client {
    public static void main(String[] args) {


        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("开始的战斗力");
        gameRole.display();

//        保存当前状态
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(gameRole.createMemento());


        System.out.println("战斗");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("恢复状态");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
