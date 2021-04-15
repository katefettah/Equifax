package utilities;

import java.io.FileInputStream;
import java.util.Properties;
public class ConfigurationReader {
    private static Properties properties;
    static{
        String path = "/Users/apple/IdeaProjects/Equifax/Configuration.properties";
        try{

            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (Exception e){
        }
    }
    public static String getProperty(String key){
        String deger = properties.getProperty(key);
        return deger;
    }
}
