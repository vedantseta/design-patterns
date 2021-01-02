import buttons.Button;
import commands.Command;

public class ControllerHandler {
    private Button buttonX;
    private Button buttonY;
    private Button buttonA;
    private Button buttonB;

    public ControllerHandler(){
        this.buttonX = new Button();
        this.buttonY = new Button();
        this.buttonA = new Button();
        this.buttonB = new Button();
    }

    public Button getButton(String input) {
        if ("A".equals(input)) {
            return buttonA;
        }
        if ("B".equals(input)) {
            return buttonB;
        }
        if ("X".equals(input)) {
            return buttonX;
        }
        if ("Y".equals(input)) {
            return buttonY;
        }
        return null;
    }
}
