package Ch6_Command.Remote;

import Ch6_Command.Remote.Commands.*;
import Ch6_Command.Remote.Components.*;

public class RemoteLoaderUndo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLightOn = new Light("Living Room");

        Command lightOnCommand = new LightOnCommand(livingRoomLightOn);
        Command lightOffCommand = new LightOffCommand(livingRoomLightOn);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();


    }
}
