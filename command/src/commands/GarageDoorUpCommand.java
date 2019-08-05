package commands;

import device.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
