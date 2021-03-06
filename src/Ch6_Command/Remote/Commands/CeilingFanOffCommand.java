package Ch6_Command.Remote.Commands;

import Ch6_Command.Remote.Components.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.SpeedType prevSpeedType;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeedType = ceilingFan.getSpeedType();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeedType) {
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}
