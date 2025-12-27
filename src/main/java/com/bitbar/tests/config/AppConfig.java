package com.bitbar.tests.config;

/**
 * Configuration class containing all test settings
 */
public class AppConfig {
    
    // Appium Server Configuration
    public static final String APPIUM_HOST = "127.0.0.1";
    public static final int APPIUM_PORT = 4723;
    public static final String APPIUM_URL = "http://" + APPIUM_HOST + ":" + APPIUM_PORT;
    
    // App Package and Activity
    public static final String APP_PACKAGE = "com.bitbarsampleapp";
    public static final String APP_ACTIVITY = ".MainActivity";
    
    // Timeouts (in seconds)
    public static final int IMPLICIT_WAIT = 10;
    public static final int EXPLICIT_WAIT = 20;
    
    // Report Configuration
    public static final String REPORT_PATH = "test-output/ExtentReport.html";
    public static final String SCREENSHOT_PATH = "test-output/screenshots/";
}

