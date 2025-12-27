package com.bitbar.tests.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bitbar.tests.config.AppConfig;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TestNG Listener for generating Extent Reports
 */
public class ExtentReportListener implements ITestListener {
    
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    @Override
    public void onStart(ITestContext context) {
        // Create report directory if not exists
        File reportDir = new File("test-output");
        if (!reportDir.exists()) {
            reportDir.mkdirs();
        }
        
        // Create screenshot directory
        File screenshotDir = new File(AppConfig.SCREENSHOT_PATH);
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }
        
        // Generate timestamp for report
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String reportPath = "test-output/ExtentReport_" + timestamp + ".html";
        
        // Initialize Extent Spark Reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("BitBar Sample App - Test Report");
        sparkReporter.config().setReportName("Appium Automation Test Results");
        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        
        // Initialize ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
        // Add system information
        extent.setSystemInfo("Application", "BitBar Sample App");
        extent.setSystemInfo("Platform", "Android");
        extent.setSystemInfo("Automation Tool", "Appium");
        extent.setSystemInfo("Framework", "TestNG");
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("  BitBar Sample App - Appium Test Execution Started");
        System.out.println("═══════════════════════════════════════════════════════");
    }
    
    @Override
    public void onTestStart(ITestResult result) {
        // Create new test in report
        ExtentTest extentTest = extent.createTest(
            result.getMethod().getMethodName(),
            result.getMethod().getDescription()
        );
        test.set(extentTest);
        
        System.out.println("\n▶ Starting Test: " + result.getMethod().getMethodName());
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test PASSED: " + result.getMethod().getMethodName());
        System.out.println("✓ PASSED: " + result.getMethod().getMethodName());
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test FAILED: " + result.getMethod().getMethodName());
        test.get().log(Status.FAIL, "Failure Reason: " + result.getThrowable());
        System.out.println("✗ FAILED: " + result.getMethod().getMethodName());
        System.out.println("  Reason: " + result.getThrowable().getMessage());
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test SKIPPED: " + result.getMethod().getMethodName());
        System.out.println("⊘ SKIPPED: " + result.getMethod().getMethodName());
    }
    
    @Override
    public void onFinish(ITestContext context) {
        // Flush the report
        extent.flush();
        
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("  Test Execution Completed");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("  Total Tests: " + (context.getPassedTests().size() + 
                          context.getFailedTests().size() + context.getSkippedTests().size()));
        System.out.println("  Passed: " + context.getPassedTests().size());
        System.out.println("  Failed: " + context.getFailedTests().size());
        System.out.println("  Skipped: " + context.getSkippedTests().size());
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("  Report generated at: test-output/ExtentReport_*.html");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}

