package com.democoding.kridlminef.commands;

import java.util.List;

public class VanillaCommand extends Command {
    public VanillaCommand(String name, String description) {
        this(name, description, null);
    }
    public VanillaCommand(String name, String description, List<String> aliases) {
        super(name, description, null, aliases);
    }
}
