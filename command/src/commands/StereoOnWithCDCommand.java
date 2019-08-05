package commands;
import device.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
        System.out.println("stereoOnWithCommand");
    }

    @Override
    public void undo() {
        System.out.println("stereoOnWithCommand undo");

    }
}
