package io.jdcore;

import io.jdcore.commands.CommandMap;
import io.jdcore.utils.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;

public class Bot {
    private JDABuilder builder;

    private static Bot instance;

    private CommandMap commandMap;

    private final JDA jda;

    private final Config config;

    public Bot() throws LoginException, IOException {
        this.commandMap = new CommandMap();
        this.config = new Config(this.getDataFolder() + "config.properties");
        this.builder = JDABuilder.createLight(this.getConfig().get("token"), Collections.emptyList());
        this.builder.setActivity(Activity.playing(this.getConfig().get("status")));
        this.jda = this.builder.build();
    }

    public String getDataFolder() {
        URL resource = this.getClass().getResource("/");
        assert resource != null;
        return resource.getPath();
    }

    public Config getConfig() {
        return this.config;
    }

    public Bot getInstance() {
        return instance;
    }

    public void run() throws InterruptedException {
        this.jda.awaitReady();
    }
}
