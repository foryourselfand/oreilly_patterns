package Ch6_Command.Simle.Commands;

import Ch6_Command.Simle.Components.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}