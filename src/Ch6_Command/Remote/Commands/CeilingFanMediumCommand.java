package Ch6_Command.Remote.Commands;

import Ch6_Command.Remote.Components.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.SpeedType prevSpeedType;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeedType = ceilingFan.getSpeedType();
        ceilingFan.medium();
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
