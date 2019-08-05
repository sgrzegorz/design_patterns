package commands;

import device.CeilingFan;

public class CeilingFanMediumCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed =ceilingFan.getSpeed();
        ceilingFan.medium();
        System.out.println("CeilingFanMediumCommand");
    }

    public void undo(){
        System.out.println("CeilingFanMediumCommand undo");
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
