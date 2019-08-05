package commands;

import device.TV;

public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand(TV tv){
        this.tv =tv;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
