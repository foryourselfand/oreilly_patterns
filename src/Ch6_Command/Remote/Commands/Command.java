package Ch6_Command.Remote.Commands;

public interface Command {
    public void execute();
    public void undo();
}