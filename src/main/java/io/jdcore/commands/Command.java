package io.jdcore.commands;

import java.util.List;

public abstract class Command {
    private String name;
    private String description;
    private String usageMessage;
    private String permission;
    private String permissionMessage;
    private List<String> aliases;

    public Command(String name, String description, String usageMessage) {
        this(name, description, usageMessage, null);
    }

    public Command(String name, String description, String usageMessage, List<String> aliases) {

    }
}
