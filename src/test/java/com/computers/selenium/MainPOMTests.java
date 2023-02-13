package com.computers.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import selenium.PageObjects.MainPage;
import selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.GlobalVariables;

public class MainPOMTests {

    // Variables
    WebDriver driver;
    Base base;
    MainPage mainPage;
    String expectedComputer;
    ExtentReports extent;
    ExtentTest logger;
    String failedStep;


    @BeforeTest
    public void beforeTest() {
        base = new Base(driver);
        driver = base.chromeDriverConnection();
        mainPage = new MainPage(driver);
        expectedComputer = base.getJSONValue("testCase01", "computer");

        // Extent Reports setup
        extent = new ExtentReports(GlobalVariables.REPORT_PATH);
    }

    @Test
    public void testCase01(){
        // Extent report start test
        // PASS
        // FAIL
        // SKIP
        // INFO
        logger = extent.startTest(new Object() {}.getClass().getEnclosingMethod().getName());

        // Step 1
        base.launchBrowser(GlobalVariables.QA_URL);
        logger.log(LogStatus.INFO, "Opening brower with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable("ACR"));
        logger.log(LogStatus.PASS, "Validation was succcessful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
    }
    @Test
    public void testCase02(){
        // Extent report start test
        // PASS
        // FAIL
        // SKIP
        // INFO
        logger = extent.startTest(new Object() {}.getClass().getEnclosingMethod().getName());

        // Step 1
        base.launchBrowser(GlobalVariables.QA_URL);
        logger.log(LogStatus.INFO, "Opening brower with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
        logger.log(LogStatus.PASS, "Validation was succcessful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void testCase03(){
        // Extent report start test
        // PASS
        // FAIL
        // SKIP
        // INFO
        logger = extent.startTest(new Object() {}.getClass().getEnclosingMethod().getName());

        // Step 1
        base.launchBrowser(GlobalVariables.QA_URL);
        logger.log(LogStatus.INFO, "Opening brower with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
        logger.log(LogStatus.PASS, "Validation was succcessful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
    }
    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(LogStatus.FAIL, logger.addScreenCapture(base.takeScreenshot("Failed_Step")));
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test Case was skipped. " + result.getName());
        }
        extent.endTest(logger);
    }
    @AfterTest
    public void afterTest() {
        extent.flush();
        extent.close();
        base.closeBrowser();
    }
}
