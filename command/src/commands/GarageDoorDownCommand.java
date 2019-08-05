package commands;

import device.GarageDoor;

public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("GarageDoorDownCommand");
    }

    @Override
    public void undo() {
        System.out.println("GarageDoorDownCommand undo");
    }
}
