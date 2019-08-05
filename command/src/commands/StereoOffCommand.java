package commands;

import device.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
