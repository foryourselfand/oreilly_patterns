package Ch6_Command.Remote.Commands;

import Ch6_Command.Remote.Components.CeilingFan;

public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.SpeedType prevSpeedType;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeedType = ceilingFan.getSpeedType();
        ceilingFan.low();
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
