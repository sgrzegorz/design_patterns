package commands;

import device.Fili;

public class FiliOffCommand implements Command {
    Fili fili;
    public FiliOffCommand(Fili fili){
        this.fili =fili;
    }
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
