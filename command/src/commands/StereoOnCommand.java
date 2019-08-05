package commands;

import device.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(11);
        System.out.println("StereoOnCommand ");
    }

    @Override
    public void undo() {
        System.out.println("StereoOnCommand undo");
    }
}
