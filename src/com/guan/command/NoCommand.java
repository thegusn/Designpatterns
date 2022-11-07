package com.guan.command;
//没有任何命令，空执行，用于初始化，当调用命令，对象什么都不做，

//这位也是一种设计模式，可以省掉对空的判断
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
