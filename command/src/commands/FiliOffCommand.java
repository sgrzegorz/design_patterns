package commands;

import device.Fili;

public class FiliOffCommand implements Command {
    Fili fili;
    public FiliOffCommand(Fili fili){
        this.fili =fili;
    }
    @Override
    public void execute() {
        System.out.println("filiOffCommand");
    }

    @Override
    public void undo() {
        System.out.println("filiOffCommand undo");
    }
}
