package commands;

import device.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("GarageDoorUpCommand");
    }

    @Override
    public void undo() {
        System.out.println("GarageDoorUpCommand undo");
    }
}
