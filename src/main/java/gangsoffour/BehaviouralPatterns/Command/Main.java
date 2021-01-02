import buttons.Button;
import commands.Command;
import commands.Fire;
import commands.Jump;
import entities.Actor;

public class Main {

    public static void main(String[] args)
    {
        Actor actor = new Actor();
        Command fire = new Fire(actor);
        Command jump = new Jump(actor);


        ControllerHandler inputHandler = new ControllerHandler();
        Button buttonA = inputHandler.getButton("A");
        Button buttonB = inputHandler.getButton("B");

        buttonA.setAction(fire);
        buttonB.setAction(jump);


        Button buttonInput = inputHandler.getButton("B");
        if (buttonInput != null) {
            Command command = buttonInput.getAction();
            if (command != null) {
                command.execute();
            }
        }
    }
}
