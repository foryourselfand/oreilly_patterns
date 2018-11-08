package Ch6_Command.Simle;

import Ch6_Command.Simle.Commands.Command;

//
// This is the invoker
//
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}