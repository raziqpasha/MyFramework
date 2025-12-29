package org.example.Utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key) {
        Properties p =  new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }



}
