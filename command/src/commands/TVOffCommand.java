package commands;

import device.TV;

public class TVOffCommand implements Command {
    TV tv;
    public TVOffCommand(TV tv){
        this.tv =tv;
    }

    @Override
    public void execute() {
        System.out.println("tv off");
    }

    @Override
    public void undo() {
        System.out.println("tv off undo");
    }
}
