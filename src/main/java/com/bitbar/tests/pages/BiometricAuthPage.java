package com.bitbar.tests.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

/**
 * Page Object for Biometric Authentication Screen
 * 
 * This page appears after clicking "BIOMETRIC AUTHENTICATION" button on Home Page
 * 
 * Elements on this page:
 * - Page title: "Biometric authentication"
 * - Navigate up button (back arrow)
 * - CHECK IF AVIALABLE button
 * - SENSOR TYPE label with value "ANDROID BIOMETRICS"
 * - ASK BIOMETRIC AUTHENTICATION button
 * - FORCE PASS CALLBACK button
 * - FORCE FAIL CALLBACK button
 * - AUTHENTICATION STATUS label with value "WAITING"
 * - GO BACK button
 */
public class BiometricAuthPage extends BasePage {
    
    // ==================== LOCATORS ====================
    
    // Page Title
    private final By pageTitle = AppiumBy.xpath(
        "//android.widget.TextView[@text='Biometric authentication']"
    );
    
    // Navigate Up Button (Back Arrow)
    private final By navigateUpButton = AppiumBy.accessibilityId("Navigate up");
    
    // CHECK IF AVIALABLE Button
    private final By checkIfAvailableButton = AppiumBy.accessibilityId("Check if avialable");
    
    private final By checkIfAvailableButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='CHECK IF AVIALABLE']"
    );
    
    // SENSOR TYPE Section
    private final By sensorTypeTitle = AppiumBy.xpath(
        "//android.widget.TextView[@text='SENSOR TYPE']"
    );
    
    private final By sensorTypeValue = AppiumBy.xpath(
        "//android.widget.TextView[@text='ANDROID BIOMETRICS']"
    );
    
    // ASK BIOMETRIC AUTHENTICATION Button
    private final By askBiometricAuthButton = AppiumBy.accessibilityId("Ask biometric authentication");
    
    private final By askBiometricAuthButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='ASK BIOMETRIC AUTHENTICATION']"
    );
    
    // FORCE PASS CALLBACK Button
    private final By forcePassCallbackButton = AppiumBy.accessibilityId("Force pass callback");
    
    private final By forcePassCallbackButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='FORCE PASS CALLBACK']"
    );
    
    // FORCE FAIL CALLBACK Button
    private final By forceFailCallbackButton = AppiumBy.accessibilityId("Force fail callback");
    
    private final By forceFailCallbackButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='FORCE FAIL CALLBACK']"
    );
    
    // AUTHENTICATION STATUS Section
    private final By authStatusTitle = AppiumBy.xpath(
        "//android.widget.TextView[@text='AUTHENTICATION STATUS']"
    );
    
    private final By authStatusValue = AppiumBy.xpath(
        "//android.widget.TextView[@text='WAITING']"
    );
    
    // GO BACK Button
    private final By goBackButton = AppiumBy.accessibilityId("Go back");
    
    private final By goBackButtonText = AppiumBy.xpath(
        "//android.widget.TextView[@text='GO BACK']"
    );
    
    // Scroll View
    private final By scrollView = AppiumBy.className("android.widget.ScrollView");
    
    // ==================== CONSTRUCTOR ====================
    
    public BiometricAuthPage(AndroidDriver driver) {
        super(driver);
    }
    
    // ==================== PAGE VERIFICATION ====================
    
    /**
     * Verify if Biometric Authentication page is loaded
     */
    public boolean isPageLoaded() {
        return isElementDisplayed(pageTitle);
    }
    
    /**
     * Get page title text
     */
    public String getPageTitleText() {
        return getText(pageTitle);
    }
    
    // ==================== NAVIGATE UP BUTTON ====================
    
    /**
     * Check if Navigate Up button is displayed
     */
    public boolean isNavigateUpButtonDisplayed() {
        return isElementDisplayed(navigateUpButton);
    }
    
    /**
     * Click Navigate Up button
     */
    public void clickNavigateUpButton() {
        clickElement(navigateUpButton);
    }
    
    // ==================== CHECK IF AVAILABLE BUTTON ====================
    
    /**
     * Check if "Check if available" button is displayed
     */
    public boolean isCheckIfAvailableButtonDisplayed() {
        return isElementDisplayed(checkIfAvailableButton);
    }
    
    /**
     * Check if "Check if available" button is clickable
     */
    public boolean isCheckIfAvailableButtonClickable() {
        return isElementClickable(checkIfAvailableButton);
    }
    
    /**
     * Get "Check if available" button text
     */
    public String getCheckIfAvailableButtonText() {
        return getText(checkIfAvailableButtonText);
    }
    
    /**
     * Click "Check if available" button
     */
    public void clickCheckIfAvailableButton() {
        clickElement(checkIfAvailableButton);
    }
    
    // ==================== SENSOR TYPE SECTION ====================
    
    /**
     * Check if Sensor Type title is displayed
     */
    public boolean isSensorTypeTitleDisplayed() {
        return isElementDisplayed(sensorTypeTitle);
    }
    
    /**
     * Get Sensor Type title text
     */
    public String getSensorTypeTitleText() {
        return getText(sensorTypeTitle);
    }
    
    /**
     * Check if Sensor Type value is displayed
     */
    public boolean isSensorTypeValueDisplayed() {
        return isElementDisplayed(sensorTypeValue);
    }
    
    /**
     * Get Sensor Type value text
     */
    public String getSensorTypeValueText() {
        return getText(sensorTypeValue);
    }
    
    // ==================== ASK BIOMETRIC AUTHENTICATION BUTTON ====================
    
    /**
     * Check if "Ask biometric authentication" button is displayed
     */
    public boolean isAskBiometricAuthButtonDisplayed() {
        return isElementDisplayed(askBiometricAuthButton);
    }
    
    /**
     * Check if "Ask biometric authentication" button is clickable
     */
    public boolean isAskBiometricAuthButtonClickable() {
        return isElementClickable(askBiometricAuthButton);
    }
    
    /**
     * Get "Ask biometric authentication" button text
     */
    public String getAskBiometricAuthButtonText() {
        return getText(askBiometricAuthButtonText);
    }
    
    /**
     * Click "Ask biometric authentication" button
     */
    public void clickAskBiometricAuthButton() {
        clickElement(askBiometricAuthButton);
    }
    
    // ==================== FORCE PASS CALLBACK BUTTON ====================
    
    /**
     * Check if "Force pass callback" button is displayed
     */
    public boolean isForcePassCallbackButtonDisplayed() {
        return isElementDisplayed(forcePassCallbackButton);
    }
    
    /**
     * Check if "Force pass callback" button is clickable
     */
    public boolean isForcePassCallbackButtonClickable() {
        return isElementClickable(forcePassCallbackButton);
    }
    
    /**
     * Get "Force pass callback" button text
     */
    public String getForcePassCallbackButtonText() {
        return getText(forcePassCallbackButtonText);
    }
    
    /**
     * Click "Force pass callback" button
     */
    public void clickForcePassCallbackButton() {
        clickElement(forcePassCallbackButton);
    }
    
    // ==================== FORCE FAIL CALLBACK BUTTON ====================
    
    /**
     * Check if "Force fail callback" button is displayed
     */
    public boolean isForceFailCallbackButtonDisplayed() {
        return isElementDisplayed(forceFailCallbackButton);
    }
    
    /**
     * Check if "Force fail callback" button is clickable
     */
    public boolean isForceFailCallbackButtonClickable() {
        return isElementClickable(forceFailCallbackButton);
    }
    
    /**
     * Get "Force fail callback" button text
     */
    public String getForceFailCallbackButtonText() {
        return getText(forceFailCallbackButtonText);
    }
    
    /**
     * Click "Force fail callback" button
     */
    public void clickForceFailCallbackButton() {
        clickElement(forceFailCallbackButton);
    }
    
    // ==================== AUTHENTICATION STATUS SECTION ====================
    
    /**
     * Check if Authentication Status title is displayed
     */
    public boolean isAuthStatusTitleDisplayed() {
        return isElementDisplayed(authStatusTitle);
    }
    
    /**
     * Get Authentication Status title text
     */
    public String getAuthStatusTitleText() {
        return getText(authStatusTitle);
    }
    
    /**
     * Check if Authentication Status value is displayed
     */
    public boolean isAuthStatusValueDisplayed() {
        return isElementDisplayed(authStatusValue);
    }
    
    /**
     * Get Authentication Status value text
     */
    public String getAuthStatusValueText() {
        return getText(authStatusValue);
    }
    
    // ==================== GO BACK BUTTON ====================
    
    /**
     * Check if "Go back" button is displayed
     */
    public boolean isGoBackButtonDisplayed() {
        return isElementDisplayed(goBackButton);
    }
    
    /**
     * Check if "Go back" button is clickable
     */
    public boolean isGoBackButtonClickable() {
        return isElementClickable(goBackButton);
    }
    
    /**
     * Get "Go back" button text
     */
    public String getGoBackButtonText() {
        return getText(goBackButtonText);
    }
    
    /**
     * Click "Go back" button to return to Home page
     */
    public void clickGoBackButton() {
        clickElement(goBackButton);
    }
    
    // ==================== SCROLL VIEW ====================
    
    /**
     * Check if scroll view is present
     */
    public boolean isScrollViewPresent() {
        return isElementDisplayed(scrollView);
    }
    
    // ==================== COMPREHENSIVE VERIFICATION ====================
    
    /**
     * Verify all key elements on Biometric Auth page are displayed
     */
    public boolean areAllElementsDisplayed() {
        return isPageLoaded() &&
               isNavigateUpButtonDisplayed() &&
               isCheckIfAvailableButtonDisplayed() &&
               isSensorTypeTitleDisplayed() &&
               isSensorTypeValueDisplayed() &&
               isAskBiometricAuthButtonDisplayed() &&
               isForcePassCallbackButtonDisplayed() &&
               isForceFailCallbackButtonDisplayed() &&
               isAuthStatusTitleDisplayed() &&
               isAuthStatusValueDisplayed() &&
               isGoBackButtonDisplayed();
    }
}

