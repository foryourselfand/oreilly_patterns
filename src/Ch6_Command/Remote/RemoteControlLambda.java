package Ch6_Command.Remote;

import Ch6_Command.Remote.Commands.Command;
import Ch6_Command.Remote.Commands.CommandNoUndo;

public class RemoteControlLambda {
    CommandNoUndo[] onCommands;
    CommandNoUndo[] offCommands;

    public RemoteControlLambda() {
        onCommands = new CommandNoUndo[7];
        offCommands = new CommandNoUndo[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> { };
            offCommands[i] = () -> { };
        }
    }

    public void setCommand(int slot, CommandNoUndo onCommand, CommandNoUndo offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
