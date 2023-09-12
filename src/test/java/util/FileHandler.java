package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHandler {
    Properties properties;


    public FileHandler(String propertiesFilePath) throws IOException {
        LoggingManager.info("In Class FileHandler Reading Configuration Properties File From Path: " + propertiesFilePath);
        FileReader configProperties = new FileReader(propertiesFilePath);
        properties = new Properties();
        properties.load(configProperties);
    }

    public String getBrowserName() {
        LoggingManager.info("getBrowserName: Reading Browser Name From Properties File");
        return properties.get("browser").toString();
    }

    public String getBasePageUrl() {
        LoggingManager.info("getBasePageUrl: Reading BaseURl For Tests");
        return properties.get("basePageUrl").toString();
    }
}
