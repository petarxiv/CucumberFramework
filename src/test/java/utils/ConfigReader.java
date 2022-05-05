//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public ConfigReader() {
    }

    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException var2) {
            var2.printStackTrace();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        return prop;
    }

    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }
}
