import commands.*;
import device.*;

public class Main {
    public static void main(String []args){


        RemoteControl remoteControl = new RemoteControl();
/*
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanMediumCommand ceilingFanOn = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
        remoteControl.setCommand(3,stereoOnWithCD,stereoOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
*/

        //////////////MACRO/////////////////////////////////////////////////////////////////////////////////
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Fili fili = new Fili();
        TVOnCommand tvOn = new TVOnCommand(tv);
        FiliOnCommand filiOn = new FiliOnCommand(fili);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        LightOnCommand lightOn = new LightOnCommand(light);

        TVOffCommand tvOff = new TVOffCommand(tv);
        FiliOffCommand filiOff = new FiliOffCommand(fili);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        LightOffCommand lightOff = new LightOffCommand(light);

        Command[] partyOn = { lightOn, stereoOn, tvOn, filiOn};
        Command[] partyOff = { lightOff, stereoOff, tvOff, filiOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(4);



    }

}
