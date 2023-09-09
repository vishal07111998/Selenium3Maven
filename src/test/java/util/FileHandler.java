package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHandler {
    Properties properties;
    public FileHandler(String propertiesFilePath) throws IOException {
        FileReader configProperties=new FileReader("src/test/resources/config.properties");
         properties= new Properties();
        properties.load(configProperties);
    }
    public String getBrowserName()  {
       return properties.get("browser").toString();
    }

    public String getBasePageUrl(){
        return properties.get("basePageUrl").toString();
    }
}
