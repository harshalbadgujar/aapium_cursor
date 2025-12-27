package com.bitbar.tests.base;

import com.bitbar.tests.config.AppConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Base Test class that handles driver initialization and teardown
 * 
 * Uses @BeforeSuite and @AfterSuite to maintain a SINGLE driver instance
 * across all test classes for continuous test flow:
 * 
 * Open App → Home Page Tests → Navigate → Biometric Auth Tests → Close App
 */
public class BaseTest {
    
    // Static driver shared across all test classes
    protected static AndroidDriver driver;
    
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        // Configure UiAutomator2 Options
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Android Device")
                .setAppPackage(AppConfig.APP_PACKAGE)
                .setAppActivity(AppConfig.APP_ACTIVITY)
                .setNoReset(true)
                .setAutoGrantPermissions(true)
                .setNewCommandTimeout(Duration.ofSeconds(300));
        
        // Initialize AndroidDriver (only once for entire suite)
        driver = new AndroidDriver(new URL(AppConfig.APPIUM_URL), options);
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(AppConfig.IMPLICIT_WAIT));
        
        // Reset app to home screen to ensure clean state
        resetAppToHomeScreen();
        
        System.out.println("✓ Driver initialized successfully (Single session for all tests)");
    }
    
    /**
     * Reset app to home screen by terminating and reactivating
     * This ensures tests always start from the main activity
     */
    protected void resetAppToHomeScreen() {
        try {
            // Terminate the app
            driver.terminateApp(AppConfig.APP_PACKAGE);
            
            // Wait briefly
            Thread.sleep(500);
            
            // Activate (restart) the app
            driver.activateApp(AppConfig.APP_PACKAGE);
            
            // Wait for app to load
            Thread.sleep(1000);
            
            System.out.println("✓ App reset to home screen");
        } catch (Exception e) {
            System.out.println("Note: App reset skipped - " + e.getMessage());
        }
    }
    
    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("✓ Driver closed successfully (End of test suite)");
        }
    }
    
    /**
     * Get the driver instance
     */
    public AndroidDriver getDriver() {
        return driver;
    }
}

