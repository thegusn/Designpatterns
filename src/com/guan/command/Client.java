package com.guan.command;

public class Client {
    public static void main(String[] args) {


//        使用命令模式完成对遥控器，对电灯进行操作
        LightReceiver lightReceiver=new LightReceiver();
//        创建电灯相关的开关命令
        LightOneCommand lightOneCommand=new LightOneCommand(lightReceiver);
        LightOffCommand lightOffCommand=new LightOffCommand(lightReceiver);
//        需要一个遥控器
        RemoteController remoteController=new RemoteController();
//        给我们的遥控器设置吗命令，比如no=0是电灯的开和关的操作
        remoteController.setCommand(0,lightOneCommand,lightOffCommand);
        System.out.println("按下开灯的按钮");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下关灯的按钮");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下撤销的按钮");
        remoteController.undoButtonWasPushed();
    }




























}
