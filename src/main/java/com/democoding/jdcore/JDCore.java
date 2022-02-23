package com.democoding.jdcore;

import javax.security.auth.login.LoginException;
import java.io.IOException;

public class JDCore {
    public static void main(String[] args) throws LoginException, InterruptedException, IOException {
        Bot bot = new Bot();
        bot.run();
    }
}