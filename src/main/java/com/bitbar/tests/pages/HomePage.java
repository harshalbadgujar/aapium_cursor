package com.bitbar.tests.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

/**
 * Page Object for BitBar Sample App Home Page
 * 
 * This page contains:
 * - App title "BitBar Sample App"
 * - Logo image (cloud with checkmark)
 * - Biometric Authentication button
 */
public class HomePage extends BasePage {
    
    // ==================== LOCATORS ====================
    
    // App Title
    private final By appTitle = AppiumBy.xpath(
        "//android.widget.TextView[@text='BitBar Sample App']"
    );
    
    // Logo Image
    private final By logoImage = AppiumBy.className("android.widget.ImageView");
    
    // Biometric Authentication Button
    private final By biometricAuthButton = AppiumBy.accessibilityId("Biometric authentication");
    
    // Biometric Authentication Button Text
    private final By biometricAuthButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='BIOMETRIC AUTHENTICATION']"
    );
    
    // Scroll View Container
    private final By scrollView = AppiumBy.className("android.widget.ScrollView");
    
    // ==================== CONSTRUCTOR ====================
    
    public HomePage(AndroidDriver driver) {
        super(driver);
    }
    
    // ==================== PAGE ACTIONS ====================
    
    /**
     * Verify if home page is loaded by checking app title
     */
    public boolean isPageLoaded() {
        return isElementDisplayed(appTitle);
    }
    
    /**
     * Get the app title text
     */
    public String getAppTitleText() {
        return getText(appTitle);
    }
    
    /**
     * Check if app title is displayed
     */
    public boolean isAppTitleDisplayed() {
        return isElementDisplayed(appTitle);
    }
    
    /**
     * Check if logo image is displayed
     */
    public boolean isLogoDisplayed() {
        return isElementDisplayed(logoImage);
    }
    
    /**
     * Check if Biometric Authentication button is displayed
     */
    public boolean isBiometricAuthButtonDisplayed() {
        return isElementDisplayed(biometricAuthButton);
    }
    
    /**
     * Check if Biometric Authentication button is clickable
     */
    public boolean isBiometricAuthButtonClickable() {
        return isElementClickable(biometricAuthButton);
    }
    
    /**
     * Check if Biometric Authentication button is enabled
     */
    public boolean isBiometricAuthButtonEnabled() {
        return isElementEnabled(biometricAuthButton);
    }
    
    /**
     * Click on Biometric Authentication button
     */
    public void clickBiometricAuthButton() {
        clickElement(biometricAuthButton);
    }
    
    /**
     * Get Biometric Authentication button text
     */
    public String getBiometricAuthButtonText() {
        return getText(biometricAuthButtonText);
    }
    
    /**
     * Check if scroll view is available
     */
    public boolean isScrollViewPresent() {
        return isElementDisplayed(scrollView);
    }
    
    /**
     * Get content description of Biometric Auth button
     */
    public String getBiometricAuthContentDesc() {
        return getElementAttribute(biometricAuthButton, "content-desc");
    }
    
    /**
     * Verify all elements on home page are displayed
     */
    public boolean areAllElementsDisplayed() {
        return isAppTitleDisplayed() && 
               isLogoDisplayed() && 
               isBiometricAuthButtonDisplayed();
    }
}

