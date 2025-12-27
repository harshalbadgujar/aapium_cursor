package com.bitbar.tests.tests;

import com.bitbar.tests.base.BaseTest;
import com.bitbar.tests.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for BitBar Sample App Home Page
 * 
 * NOTE: This test class only verifies elements on the Home Page.
 * Navigation to other screens is handled in separate test classes.
 * 
 * Test Coverage:
 * 1. Verify page loads successfully
 * 2. Verify app title is displayed correctly
 * 3. Verify logo image is displayed
 * 4. Verify Biometric Authentication button is displayed
 * 5. Verify Biometric Authentication button is clickable
 * 6. Verify Biometric Authentication button text
 * 7. Verify scroll view is present
 * 8. Verify all UI elements are present
 */
public class HomePageTest extends BaseTest {
    
    private HomePage homePage;
    
    @BeforeMethod
    public void initPage() {
        homePage = new HomePage(driver);
    }
    
    // ==================== PAGE LOAD TESTS ====================
    
    @Test(priority = 1, description = "Verify home page loads successfully")
    public void testHomePageLoads() {
        System.out.println("Test: Verifying home page loads...");
        
        boolean isLoaded = homePage.isPageLoaded();
        
        Assert.assertTrue(isLoaded, "Home page should be loaded");
        System.out.println("✓ Home page loaded successfully");
    }
    
    // ==================== APP TITLE TESTS ====================
    
    @Test(priority = 2, description = "Verify app title is displayed")
    public void testAppTitleIsDisplayed() {
        System.out.println("Test: Verifying app title is displayed...");
        
        boolean isDisplayed = homePage.isAppTitleDisplayed();
        
        Assert.assertTrue(isDisplayed, "App title should be displayed");
        System.out.println("✓ App title is displayed");
    }
    
    @Test(priority = 3, description = "Verify app title text is correct")
    public void testAppTitleText() {
        System.out.println("Test: Verifying app title text...");
        
        String expectedTitle = "BitBar Sample App";
        String actualTitle = homePage.getAppTitleText();
        
        Assert.assertEquals(actualTitle, expectedTitle, 
            "App title should be '" + expectedTitle + "'");
        System.out.println("✓ App title text is correct: " + actualTitle);
    }
    
    // ==================== LOGO TESTS ====================
    
    @Test(priority = 4, description = "Verify logo image is displayed")
    public void testLogoIsDisplayed() {
        System.out.println("Test: Verifying logo image is displayed...");
        
        boolean isDisplayed = homePage.isLogoDisplayed();
        
        Assert.assertTrue(isDisplayed, "Logo image should be displayed");
        System.out.println("✓ Logo image is displayed");
    }
    
    // ==================== BIOMETRIC AUTHENTICATION BUTTON TESTS ====================
    
    @Test(priority = 5, description = "Verify Biometric Authentication button is displayed")
    public void testBiometricAuthButtonIsDisplayed() {
        System.out.println("Test: Verifying Biometric Authentication button is displayed...");
        
        boolean isDisplayed = homePage.isBiometricAuthButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, 
            "Biometric Authentication button should be displayed");
        System.out.println("✓ Biometric Authentication button is displayed");
    }
    
    @Test(priority = 6, description = "Verify Biometric Authentication button is enabled")
    public void testBiometricAuthButtonIsEnabled() {
        System.out.println("Test: Verifying Biometric Authentication button is enabled...");
        
        boolean isEnabled = homePage.isBiometricAuthButtonEnabled();
        
        Assert.assertTrue(isEnabled, 
            "Biometric Authentication button should be enabled");
        System.out.println("✓ Biometric Authentication button is enabled");
    }
    
    @Test(priority = 7, description = "Verify Biometric Authentication button is clickable")
    public void testBiometricAuthButtonIsClickable() {
        System.out.println("Test: Verifying Biometric Authentication button is clickable...");
        
        boolean isClickable = homePage.isBiometricAuthButtonClickable();
        
        Assert.assertTrue(isClickable, 
            "Biometric Authentication button should be clickable");
        System.out.println("✓ Biometric Authentication button is clickable");
    }
    
    @Test(priority = 8, description = "Verify Biometric Authentication button text")
    public void testBiometricAuthButtonText() {
        System.out.println("Test: Verifying Biometric Authentication button text...");
        
        String expectedText = "BIOMETRIC AUTHENTICATION";
        String actualText = homePage.getBiometricAuthButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Biometric Authentication button text is correct: " + actualText);
    }
    
    @Test(priority = 9, description = "Verify Biometric Authentication button content description")
    public void testBiometricAuthButtonContentDesc() {
        System.out.println("Test: Verifying Biometric Authentication button content description...");
        
        String expectedContentDesc = "Biometric authentication";
        String actualContentDesc = homePage.getBiometricAuthContentDesc();
        
        Assert.assertEquals(actualContentDesc, expectedContentDesc, 
            "Content description should be '" + expectedContentDesc + "'");
        System.out.println("✓ Content description is correct: " + actualContentDesc);
    }
    
    // ==================== SCROLL VIEW TESTS ====================
    
    @Test(priority = 10, description = "Verify scroll view is present")
    public void testScrollViewIsPresent() {
        System.out.println("Test: Verifying scroll view is present...");
        
        boolean isPresent = homePage.isScrollViewPresent();
        
        Assert.assertTrue(isPresent, "Scroll view should be present");
        System.out.println("✓ Scroll view is present");
    }
    
    // ==================== COMPREHENSIVE UI TESTS ====================
    
    @Test(priority = 11, description = "Verify all UI elements are displayed on Home Page")
    public void testAllUIElementsDisplayed() {
        System.out.println("Test: Verifying all UI elements are displayed...");
        
        boolean allDisplayed = homePage.areAllElementsDisplayed();
        
        Assert.assertTrue(allDisplayed, "All UI elements should be displayed");
        System.out.println("✓ All UI elements are displayed correctly");
    }
}

