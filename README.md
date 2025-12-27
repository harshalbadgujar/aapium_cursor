# BitBar Sample App - Appium Test Automation

Automated UI tests for the BitBar Sample App using **Appium + Java + TestNG + Extent Reports**.

---

## Project Structure

```
├── pom.xml                          # Maven dependencies & build config
├── testng.xml                       # TestNG suite configuration
├── README.md                        # Project documentation
│
├── src/
│   ├── main/java/com/bitbar/tests/
│   │   ├── base/
│   │   │   └── BaseTest.java        # Base test class (driver setup/teardown)
│   │   │
│   │   ├── config/
│   │   │   └── AppConfig.java       # Configuration settings
│   │   │
│   │   ├── pages/
│   │   │   ├── BasePage.java        # Base page with common methods
│   │   │   ├── HomePage.java        # Home page object (locators & actions)
│   │   │   └── BiometricAuthPage.java  # Biometric auth page object
│   │   │
│   │   ├── listeners/
│   │   │   └── ExtentReportListener.java  # TestNG listener for reports
│   │   │
│   │   └── utils/
│   │       └── ScreenshotUtils.java # Screenshot utility methods
│   │
│   └── test/java/com/bitbar/tests/
│       └── tests/
│           ├── HomePageTest.java    # Test cases for home page
│           └── BiometricAuthPageTest.java  # Test cases for biometric auth page
│
└── test-output/                     # Generated test reports (after run)
    ├── ExtentReport_*.html          # Extent HTML Report
    └── screenshots/                 # Failed test screenshots
```

---

## Prerequisites

1. **Java JDK 11+** installed
2. **Maven** installed
3. **Appium Server** running (default: http://127.0.0.1:4723)
4. **Android Device/Emulator** with BitBar Sample App installed
5. **Android SDK** configured

---

## Configuration

Edit `src/main/java/com/bitbar/tests/config/AppConfig.java` if needed:

```java
APPIUM_HOST = "127.0.0.1"    // Appium server host
APPIUM_PORT = 4723           // Appium server port
APP_PACKAGE = "com.bitbarsampleapp"
APP_ACTIVITY = ".MainActivity"
```

---

## How to Run Tests

### Option 1: Using Maven (Recommended)
```bash
mvn clean test
```

### Option 2: Using TestNG XML
```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## Test Report

After test execution, the HTML report is generated at:
```
test-output/ExtentReport_<timestamp>.html
```

Open this file in a browser to view detailed test results.

---

## Test Coverage

| Test Case | Description |
|-----------|-------------|
| testHomePageLoads | Verify home page loads successfully |
| testAppTitleIsDisplayed | Verify app title is displayed |
| testAppTitleText | Verify app title text is "BitBar Sample App" |
| testLogoIsDisplayed | Verify logo image is displayed |
| testBiometricAuthButtonIsDisplayed | Verify Biometric button is displayed |
| testBiometricAuthButtonIsEnabled | Verify Biometric button is enabled |
| testBiometricAuthButtonIsClickable | Verify Biometric button is clickable |
| testBiometricAuthButtonText | Verify button text is "BIOMETRIC AUTHENTICATION" |
| testBiometricAuthButtonContentDesc | Verify button accessibility label |
| testClickBiometricAuthButton | Verify clicking the Biometric button |
| testScrollViewIsPresent | Verify scroll view container exists |
| testAllUIElementsDisplayed | Verify all UI elements are present |

---

## App Under Test

**BitBar Sample App** with:
- App title: "BitBar Sample App"
- Logo: Cloud with checkmark image
- Button: "BIOMETRIC AUTHENTICATION"

---

## Troubleshooting

1. **Appium not connecting**: Ensure Appium server is running at configured URL
2. **App not found**: Verify app package and activity names
3. **Element not found**: Check if app is on the correct screen
4. **Driver timeout**: Increase timeout values in AppConfig.java

---

## License

This project is for educational and testing purposes.

