package commands;

import entities.Actor;

public class Jump implements Command {
    private Actor actor;

    public Jump(Actor actor) {
        this.actor = actor;
    }

    public void execute() {
        actor.fire();
    }
}

