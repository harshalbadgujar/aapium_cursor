package com.bitbar.tests.tests;

import com.bitbar.tests.base.BaseTest;
import com.bitbar.tests.pages.HomePage;
import com.bitbar.tests.pages.BiometricAuthPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for Biometric Authentication Screen
 * 
 * IMPORTANT: This screen appears ONLY after clicking "BIOMETRIC AUTHENTICATION" 
 * button on the Home Page. Tests are sequenced accordingly.
 * 
 * Test Coverage:
 * 1. Navigate from Home page to Biometric Auth page
 * 2. Verify page title
 * 3. Verify Navigate Up button
 * 4. Verify Check If Available button
 * 5. Verify Sensor Type section
 * 6. Verify Ask Biometric Authentication button
 * 7. Verify Force Pass Callback button
 * 8. Verify Force Fail Callback button
 * 9. Verify Authentication Status section
 * 10. Verify Go Back button
 * 11. Verify navigation back to Home page
 */
public class BiometricAuthPageTest extends BaseTest {
    
    private HomePage homePage;
    private BiometricAuthPage biometricAuthPage;
    
    @BeforeMethod
    public void initPages() {
        homePage = new HomePage(driver);
        biometricAuthPage = new BiometricAuthPage(driver);
    }
    
    // ==================== NAVIGATION TEST ====================
    
    @Test(priority = 1, description = "Navigate from Home page to Biometric Auth page")
    public void testNavigateToBiometricAuthPage() {
        System.out.println("Test: Navigating to Biometric Authentication page...");
        
        // Verify we are on Home page first
        Assert.assertTrue(homePage.isPageLoaded(), "Home page should be loaded");
        
        // Click on Biometric Authentication button
        homePage.clickBiometricAuthButton();
        
        // Verify Biometric Auth page is loaded
        Assert.assertTrue(biometricAuthPage.isPageLoaded(), 
            "Biometric Authentication page should be loaded");
        System.out.println("✓ Successfully navigated to Biometric Authentication page");
    }
    
    // ==================== PAGE TITLE TESTS ====================
    
    @Test(priority = 2, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify page title is displayed")
    public void testPageTitleIsDisplayed() {
        System.out.println("Test: Verifying page title is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isPageLoaded();
        
        Assert.assertTrue(isDisplayed, "Page title should be displayed");
        System.out.println("✓ Page title is displayed");
    }
    
    @Test(priority = 3, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify page title text")
    public void testPageTitleText() {
        System.out.println("Test: Verifying page title text...");
        
        String expectedTitle = "Biometric authentication";
        String actualTitle = biometricAuthPage.getPageTitleText();
        
        Assert.assertEquals(actualTitle, expectedTitle, 
            "Page title should be '" + expectedTitle + "'");
        System.out.println("✓ Page title text is correct: " + actualTitle);
    }
    
    // ==================== NAVIGATE UP BUTTON TESTS ====================
    
    @Test(priority = 4, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Navigate Up button is displayed")
    public void testNavigateUpButtonIsDisplayed() {
        System.out.println("Test: Verifying Navigate Up button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isNavigateUpButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, "Navigate Up button should be displayed");
        System.out.println("✓ Navigate Up button is displayed");
    }
    
    // ==================== CHECK IF AVAILABLE BUTTON TESTS ====================
    
    @Test(priority = 5, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Check If Available button is displayed")
    public void testCheckIfAvailableButtonIsDisplayed() {
        System.out.println("Test: Verifying Check If Available button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isCheckIfAvailableButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, "Check If Available button should be displayed");
        System.out.println("✓ Check If Available button is displayed");
    }
    
    @Test(priority = 6, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Check If Available button is clickable")
    public void testCheckIfAvailableButtonIsClickable() {
        System.out.println("Test: Verifying Check If Available button is clickable...");
        
        boolean isClickable = biometricAuthPage.isCheckIfAvailableButtonClickable();
        
        Assert.assertTrue(isClickable, "Check If Available button should be clickable");
        System.out.println("✓ Check If Available button is clickable");
    }
    
    @Test(priority = 7, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Check If Available button text")
    public void testCheckIfAvailableButtonText() {
        System.out.println("Test: Verifying Check If Available button text...");
        
        String expectedText = "CHECK IF AVIALABLE";
        String actualText = biometricAuthPage.getCheckIfAvailableButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Check If Available button text is correct: " + actualText);
    }
    
    // ==================== SENSOR TYPE SECTION TESTS ====================
    
    @Test(priority = 8, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Sensor Type title is displayed")
    public void testSensorTypeTitleIsDisplayed() {
        System.out.println("Test: Verifying Sensor Type title is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isSensorTypeTitleDisplayed();
        
        Assert.assertTrue(isDisplayed, "Sensor Type title should be displayed");
        System.out.println("✓ Sensor Type title is displayed");
    }
    
    @Test(priority = 9, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Sensor Type title text")
    public void testSensorTypeTitleText() {
        System.out.println("Test: Verifying Sensor Type title text...");
        
        String expectedText = "SENSOR TYPE";
        String actualText = biometricAuthPage.getSensorTypeTitleText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Sensor Type title should be '" + expectedText + "'");
        System.out.println("✓ Sensor Type title text is correct: " + actualText);
    }
    
    @Test(priority = 10, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Sensor Type value is displayed")
    public void testSensorTypeValueIsDisplayed() {
        System.out.println("Test: Verifying Sensor Type value is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isSensorTypeValueDisplayed();
        
        Assert.assertTrue(isDisplayed, "Sensor Type value should be displayed");
        System.out.println("✓ Sensor Type value is displayed");
    }
    
    @Test(priority = 11, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Sensor Type value text")
    public void testSensorTypeValueText() {
        System.out.println("Test: Verifying Sensor Type value text...");
        
        String expectedText = "ANDROID BIOMETRICS";
        String actualText = biometricAuthPage.getSensorTypeValueText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Sensor Type value should be '" + expectedText + "'");
        System.out.println("✓ Sensor Type value text is correct: " + actualText);
    }
    
    // ==================== ASK BIOMETRIC AUTHENTICATION BUTTON TESTS ====================
    
    @Test(priority = 12, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Ask Biometric Authentication button is displayed")
    public void testAskBiometricAuthButtonIsDisplayed() {
        System.out.println("Test: Verifying Ask Biometric Authentication button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isAskBiometricAuthButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, 
            "Ask Biometric Authentication button should be displayed");
        System.out.println("✓ Ask Biometric Authentication button is displayed");
    }
    
    @Test(priority = 13, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Ask Biometric Authentication button is clickable")
    public void testAskBiometricAuthButtonIsClickable() {
        System.out.println("Test: Verifying Ask Biometric Authentication button is clickable...");
        
        boolean isClickable = biometricAuthPage.isAskBiometricAuthButtonClickable();
        
        Assert.assertTrue(isClickable, 
            "Ask Biometric Authentication button should be clickable");
        System.out.println("✓ Ask Biometric Authentication button is clickable");
    }
    
    @Test(priority = 14, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Ask Biometric Authentication button text")
    public void testAskBiometricAuthButtonText() {
        System.out.println("Test: Verifying Ask Biometric Authentication button text...");
        
        String expectedText = "ASK BIOMETRIC AUTHENTICATION";
        String actualText = biometricAuthPage.getAskBiometricAuthButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Ask Biometric Authentication button text is correct: " + actualText);
    }
    
    // ==================== FORCE PASS CALLBACK BUTTON TESTS ====================
    
    @Test(priority = 15, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Pass Callback button is displayed")
    public void testForcePassCallbackButtonIsDisplayed() {
        System.out.println("Test: Verifying Force Pass Callback button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isForcePassCallbackButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, "Force Pass Callback button should be displayed");
        System.out.println("✓ Force Pass Callback button is displayed");
    }
    
    @Test(priority = 16, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Pass Callback button is clickable")
    public void testForcePassCallbackButtonIsClickable() {
        System.out.println("Test: Verifying Force Pass Callback button is clickable...");
        
        boolean isClickable = biometricAuthPage.isForcePassCallbackButtonClickable();
        
        Assert.assertTrue(isClickable, "Force Pass Callback button should be clickable");
        System.out.println("✓ Force Pass Callback button is clickable");
    }
    
    @Test(priority = 17, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Pass Callback button text")
    public void testForcePassCallbackButtonText() {
        System.out.println("Test: Verifying Force Pass Callback button text...");
        
        String expectedText = "FORCE PASS CALLBACK";
        String actualText = biometricAuthPage.getForcePassCallbackButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Force Pass Callback button text is correct: " + actualText);
    }
    
    // ==================== FORCE FAIL CALLBACK BUTTON TESTS ====================
    
    @Test(priority = 18, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Fail Callback button is displayed")
    public void testForceFailCallbackButtonIsDisplayed() {
        System.out.println("Test: Verifying Force Fail Callback button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isForceFailCallbackButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, "Force Fail Callback button should be displayed");
        System.out.println("✓ Force Fail Callback button is displayed");
    }
    
    @Test(priority = 19, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Fail Callback button is clickable")
    public void testForceFailCallbackButtonIsClickable() {
        System.out.println("Test: Verifying Force Fail Callback button is clickable...");
        
        boolean isClickable = biometricAuthPage.isForceFailCallbackButtonClickable();
        
        Assert.assertTrue(isClickable, "Force Fail Callback button should be clickable");
        System.out.println("✓ Force Fail Callback button is clickable");
    }
    
    @Test(priority = 20, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Force Fail Callback button text")
    public void testForceFailCallbackButtonText() {
        System.out.println("Test: Verifying Force Fail Callback button text...");
        
        String expectedText = "FORCE FAIL CALLBACK";
        String actualText = biometricAuthPage.getForceFailCallbackButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Force Fail Callback button text is correct: " + actualText);
    }
    
    // ==================== AUTHENTICATION STATUS SECTION TESTS ====================
    
    @Test(priority = 21, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Authentication Status title is displayed")
    public void testAuthStatusTitleIsDisplayed() {
        System.out.println("Test: Verifying Authentication Status title is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isAuthStatusTitleDisplayed();
        
        Assert.assertTrue(isDisplayed, "Authentication Status title should be displayed");
        System.out.println("✓ Authentication Status title is displayed");
    }
    
    @Test(priority = 22, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Authentication Status title text")
    public void testAuthStatusTitleText() {
        System.out.println("Test: Verifying Authentication Status title text...");
        
        String expectedText = "AUTHENTICATION STATUS";
        String actualText = biometricAuthPage.getAuthStatusTitleText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Authentication Status title should be '" + expectedText + "'");
        System.out.println("✓ Authentication Status title text is correct: " + actualText);
    }
    
    @Test(priority = 23, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Authentication Status value is displayed")
    public void testAuthStatusValueIsDisplayed() {
        System.out.println("Test: Verifying Authentication Status value is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isAuthStatusValueDisplayed();
        
        Assert.assertTrue(isDisplayed, "Authentication Status value should be displayed");
        System.out.println("✓ Authentication Status value is displayed");
    }
    
    @Test(priority = 24, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Authentication Status value text")
    public void testAuthStatusValueText() {
        System.out.println("Test: Verifying Authentication Status value text...");
        
        String expectedText = "WAITING";
        String actualText = biometricAuthPage.getAuthStatusValueText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Authentication Status value should be '" + expectedText + "'");
        System.out.println("✓ Authentication Status value text is correct: " + actualText);
    }
    
    // ==================== GO BACK BUTTON TESTS ====================
    
    @Test(priority = 25, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Go Back button is displayed")
    public void testGoBackButtonIsDisplayed() {
        System.out.println("Test: Verifying Go Back button is displayed...");
        
        boolean isDisplayed = biometricAuthPage.isGoBackButtonDisplayed();
        
        Assert.assertTrue(isDisplayed, "Go Back button should be displayed");
        System.out.println("✓ Go Back button is displayed");
    }
    
    @Test(priority = 26, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Go Back button is clickable")
    public void testGoBackButtonIsClickable() {
        System.out.println("Test: Verifying Go Back button is clickable...");
        
        boolean isClickable = biometricAuthPage.isGoBackButtonClickable();
        
        Assert.assertTrue(isClickable, "Go Back button should be clickable");
        System.out.println("✓ Go Back button is clickable");
    }
    
    @Test(priority = 27, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify Go Back button text")
    public void testGoBackButtonText() {
        System.out.println("Test: Verifying Go Back button text...");
        
        String expectedText = "GO BACK";
        String actualText = biometricAuthPage.getGoBackButtonText();
        
        Assert.assertEquals(actualText, expectedText, 
            "Button text should be '" + expectedText + "'");
        System.out.println("✓ Go Back button text is correct: " + actualText);
    }
    
    // ==================== SCROLL VIEW TEST ====================
    
    @Test(priority = 28, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify scroll view is present")
    public void testScrollViewIsPresent() {
        System.out.println("Test: Verifying scroll view is present...");
        
        boolean isPresent = biometricAuthPage.isScrollViewPresent();
        
        Assert.assertTrue(isPresent, "Scroll view should be present");
        System.out.println("✓ Scroll view is present");
    }
    
    // ==================== COMPREHENSIVE UI TEST ====================
    
    @Test(priority = 29, dependsOnMethods = "testNavigateToBiometricAuthPage",
          description = "Verify all UI elements are displayed")
    public void testAllUIElementsDisplayed() {
        System.out.println("Test: Verifying all UI elements are displayed...");
        
        boolean allDisplayed = biometricAuthPage.areAllElementsDisplayed();
        
        Assert.assertTrue(allDisplayed, "All UI elements should be displayed");
        System.out.println("✓ All UI elements are displayed correctly");
    }
    
    // ==================== NAVIGATION BACK TEST (LAST) ====================
    
    @Test(priority = 30, dependsOnMethods = "testAllUIElementsDisplayed",
          description = "Verify clicking Go Back button returns to Home page")
    public void testGoBackButtonNavigation() {
        System.out.println("Test: Clicking Go Back button to return to Home page...");
        
        // Click Go Back button
        biometricAuthPage.clickGoBackButton();
        
        // Verify we are back on Home page
        Assert.assertTrue(homePage.isPageLoaded(), 
            "Should navigate back to Home page");
        System.out.println("✓ Successfully navigated back to Home page");
    }
}

