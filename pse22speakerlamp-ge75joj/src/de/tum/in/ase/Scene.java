package de.tum.in.ase;

import java.util.HashSet;
import java.util.Set;

public class Scene {

    private String name;

    private Set<Command> commands;

    public Scene(String name, Set<Command> commands) {
        this.name = name;
        this.commands = commands;
    }

    public Scene(String name) {
        this(name, new HashSet<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Command> getCommands() {
        return new HashSet<>(commands);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void trigger() {
        commands.forEach(Command::execute);
    }
}
