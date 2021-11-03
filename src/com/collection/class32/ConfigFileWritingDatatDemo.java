package com.collection.class32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDatatDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\pc\\IdeaProjects\\Learning Java\\Files\\Config1.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("URL","www.google.com");
        properties.store(fileOutputStream,"new data added");

    }
}
