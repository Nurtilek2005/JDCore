package com.democoding.kridlminef.commands;

import java.util.ArrayList;

public class CommandMap {
    private ArrayList<Command> commands;

    public void register(String fallbackPrefix, Command command) {
        this.commands.add(command);
    }

    public ArrayList<Command> getCommands() {
        return this.commands;
    }
}
