package commands;

import commands.Command;
import device.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
        System.out.println("LighOffCommand");
    }
    @Override
    public void undo() {
        light.on();System.out.println("LighOffCommand undo");
    }
}
