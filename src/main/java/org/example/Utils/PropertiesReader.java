package org.example.Utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static Properties p =  new Properties();

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readKey(String key) {


        return p.getProperty(key);
    }


    public static String getURL() {

        // Read env from Maven command, default = qa
        String env = System.getProperty("env", "qa");
if(env==null || env.isEmpty()){
    env="qa";
}
        // Create key like: qa.url / dev.url / uat.url
        String urlKey = env + ".url";

        return p.getProperty(urlKey);
    }
}

