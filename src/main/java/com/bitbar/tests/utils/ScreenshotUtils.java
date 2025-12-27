package com.bitbar.tests.utils;

import com.bitbar.tests.config.AppConfig;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for taking and managing screenshots
 */
public class ScreenshotUtils {
    
    /**
     * Take screenshot and save with auto-generated filename
     */
    public static String takeScreenshot(AndroidDriver driver, String testName) {
        try {
            // Generate timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = testName + "_" + timestamp + ".png";
            String filePath = AppConfig.SCREENSHOT_PATH + fileName;
            
            // Create screenshot directory if not exists
            File screenshotDir = new File(AppConfig.SCREENSHOT_PATH);
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs();
            }
            
            // Take screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(filePath);
            FileUtils.copyFile(srcFile, destFile);
            
            System.out.println("Screenshot saved: " + filePath);
            return filePath;
            
        } catch (IOException e) {
            System.err.println("Failed to take screenshot: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * Get screenshot as Base64 string (for embedding in reports)
     */
    public static String getScreenshotAsBase64(AndroidDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}

