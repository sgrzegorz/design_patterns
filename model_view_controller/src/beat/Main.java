package beat;

import beat.BeatController;
import beat.BeatModel;
import beat.BeatModelInterface;
import beat.ControllerInterface;

public class Main {
    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
