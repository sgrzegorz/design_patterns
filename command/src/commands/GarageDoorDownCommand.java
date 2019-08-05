package commands;

import device.GarageDoor;

public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
