package utils;

import com.github.dockerjava.api.model.CpuUsageConfig;

public class Constants {

    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    public static final int IMPLICIT_WAIT = 10;
    public static final int EXPLICIT_WAIT = 20;
    public static final String TESTDATA_FILEPATH = System.getProperty("user.dir")+"/src/test/resources/testdata/batch12ExcelFile.xlsx";
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/";
}
