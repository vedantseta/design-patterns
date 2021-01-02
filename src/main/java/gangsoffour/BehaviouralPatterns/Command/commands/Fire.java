package commands;

import entities.Actor;

public class Fire implements Command {
    private Actor actor;

    public Fire(Actor actor) {
        this.actor = actor;
    }

    public void execute() {
        actor.fire();
    }
}
