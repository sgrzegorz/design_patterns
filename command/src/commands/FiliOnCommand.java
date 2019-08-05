package commands;

import device.Fili;

public class FiliOnCommand implements Command {
    Fili fili;
    public FiliOnCommand(Fili fili){
        this.fili =fili;
    }
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
