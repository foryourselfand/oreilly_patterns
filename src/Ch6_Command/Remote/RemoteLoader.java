package Ch6_Command.Remote;

import Ch6_Command.Remote.Components.*;
import Ch6_Command.Remote.Commands.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        Command livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        Command kitchenLightOn =
                new LightOnCommand(kitchenLight);
        Command kitchenLightOff =
                new LightOffCommand(kitchenLight);

        Command ceilingFanOn =
                new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        Command garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        Command garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        Command stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        Command stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
