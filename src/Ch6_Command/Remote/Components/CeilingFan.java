package Ch6_Command.Remote.Components;

import static Ch6_Command.Remote.Components.CeilingFan.SpeedType.*;

public class CeilingFan {
    String location = "";
    SpeedType speedType;
    public CeilingFan(String location) {
        this.location = location;
        speedType = OFF;
    }

    public void high() {
        // turns the ceiling fan on to high
        speedType = HIGH;
        System.out.println(location + " ceiling fan is on high");

    }

    public void medium() {
        // turns the ceiling fan on to medium
        speedType = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fan on to low
        speedType = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turns the ceiling fan off
        speedType = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public SpeedType getSpeedType() {
        return speedType;
    }

    public enum SpeedType {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }
}
