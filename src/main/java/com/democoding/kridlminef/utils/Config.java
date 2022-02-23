package com.democoding.kridlminef.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * @author Crunchify.com
 *
 */

public class Config {
    private final Properties properties = new Properties();

    private final File file;

    private final String fileName;

    private final String path;

    public Config(String path) throws IOException {
        this.path = path;
        this.file = new File(this.getPath());
        this.fileName = this.getFile().getName();
        if (this.getFile().exists()) {
            this.properties.load(this.getFile().toURL().openStream());
        } else {
            this.getFile().createNewFile();
            this.properties.load(this.getFile().toURL().openStream());
        }
    }

    public String get(String key) {
        if (!this.properties.containsKey(key)) return null;
        return (String) this.properties.get(key);
    }

    public void set(String key, String value) {
        this.properties.setProperty(key, value);
    }

    public String getFileName() {
        return this.fileName;
    }

    public File getFile() {
        return this.file;
    }

    public String getPath() {
        return this.path;
    }
}