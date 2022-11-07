package com.guan.command;

public class LightOffCommand implements Command{
    LightReceiver liget;

    public LightOffCommand(LightReceiver liget){
        super();
        this.liget=liget;
    }

    @Override
    public void execute() {
        liget.off();
    }

    @Override
    public void undo() {
        liget.on();
    }
}
