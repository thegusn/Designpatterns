package com.guan.command;

public class LightOneCommand implements Command{

    LightReceiver liget;

    public LightOneCommand(LightReceiver liget){
        super();
        this.liget=liget;
    }

    @Override
    public void execute() {
        liget.on();
    }

    @Override
    public void undo() {
        liget.off();
    }
}
