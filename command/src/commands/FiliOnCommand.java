package commands;

import device.Fili;

public class FiliOnCommand implements Command {
    Fili fili;
    public FiliOnCommand(Fili fili){
        this.fili =fili;
    }
    @Override
    public void execute() {
        System.out.println("filiOnCommand");
    }

    @Override
    public void undo() {
        System.out.println("filiOnCommand undo");
    }
}
