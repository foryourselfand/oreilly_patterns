package Ch6_Command.Simle;

import Ch6_Command.Simle.Commands.GarageDoorOpenCommand;
import Ch6_Command.Simle.Commands.LightOnCommand;
import Ch6_Command.Simle.Components.GarageDoor;
import Ch6_Command.Simle.Components.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
