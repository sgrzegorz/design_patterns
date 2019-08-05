package commands;

import commands.Command;
import device.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println("LighOnCommand");
    }

    @Override
    public void undo() {
        System.out.println("LighOnCommand undo");

        light.off();
    }
}
