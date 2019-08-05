package commands;

import device.TV;

import java.sql.SQLOutput;

public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand(TV tv){
        this.tv =tv;
    }

    @Override
    public void execute() {
        System.out.println("Turning on tv");
    }

    @Override
    public void undo() {
        System.out.println("tv undo");
    }
}
