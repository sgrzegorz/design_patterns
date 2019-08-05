package commands;

import device.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        System.out.println("StereoOffCommand ");
    }

    @Override
    public void undo() {
        System.out.println("StereoOffCommand undo");
    }
}
