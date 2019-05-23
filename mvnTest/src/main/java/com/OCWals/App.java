package com.OCWals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class App {

    public static void main (String[] args) throws IOException {
        Properties vProp = new Properties();
        InputStream vInputStream = null;

        try {
            vInputStream = App.class.getResourceAsStream("/info.properties");
            vProp.load(vInputStream);
        } finally {
            if (vInputStream != null) {
                vInputStream.close();
            }
        }

        System.out.println("Hello Wals ! :D");
        System.out.println("Version de l'app : " + vProp.getProperty("com.OCWals.version", "?"));
    }
}