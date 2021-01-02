package buttons;

import commands.Command;

public class Button {
    private Command command;
    public void setAction(Command command) {
        this.command = command;
    }
    public Command getAction() {
        return this.command;
    }
}
