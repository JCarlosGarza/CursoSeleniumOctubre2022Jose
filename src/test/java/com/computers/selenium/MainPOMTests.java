package com.computers.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import selenium.PageObjects.MainPage;
import selenium.PageObjects.ProyectoFinalPage;
import selenium.base.Base;
import selenium.base.GlobalVariables;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPOMTests {

    // Variables
    WebDriver driver;
    Base base;
    MainPage mainPage;
    String expectedComputer;
    ExtentReports extent;
    ExtentTest logger;
    String failedStep;
    ProyectoFinalPage proyectoFinal;
    String username, password;
    String expectedLoggedInTitle;
    String employeeName, newUsername, newPassword;
    String urlToSearch;
    @BeforeTest
    public void beforeTest() {
        base = new Base(driver);
        driver = base.chromeDriverConnection();
        mainPage = new MainPage(driver);
        proyectoFinal = new ProyectoFinalPage(driver);
        expectedComputer = base.getJSONValue("testCase01", "computer");
        username = base.getJSONValue("proyectoFinal", "username");
        password = base.getJSONValue("proyectoFinal", "password");
        expectedLoggedInTitle = base.getJSONValue("proyectoFinal", "expectedLoggedInTitle");
        employeeName = base.getJSONValue("proyectoFinal", "employeeName");
        newUsername = base.getJSONValue("proyectoFinal", "newUsername");
        newPassword = base.getJSONValue("proyectoFinal", "newPassword");
        urlToSearch = base.getJSONValue("proyectoFinal", "urlToSearch");

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
        logger.log(LogStatus.INFO, "Opening browser with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable("ACR"));
        logger.log(LogStatus.PASS, "Validation was successful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
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
        logger.log(LogStatus.INFO, "Opening browser with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
        logger.log(LogStatus.PASS, "Validation was successful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
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
        logger.log(LogStatus.INFO, "Opening browser with URL: " + GlobalVariables.QA_URL);

        // Step 2
        mainPage.filterByComputerName(expectedComputer);
        logger.log(LogStatus.INFO, "Filter Computer Name with value: " + expectedComputer );

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
        logger.log(LogStatus.PASS, "Validation was successful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void proyectoFinal() {
        // Extent report start test
        // PASS
        // FAIL
        // SKIP
        // INFO
        logger = extent.startTest(new Object() {}.getClass().getEnclosingMethod().getName());

        // Step 1 Open browser "OrangeHRM" web page
        base.launchBrowser(GlobalVariables.FINAL_URL);
        logger.log(LogStatus.INFO, "Opening browser with URL: " + GlobalVariables.FINAL_URL);

        // Step 2 & 3 Enter Username and Password and Click login
        proyectoFinal.login(username, password);
        logger.log(LogStatus.INFO, "Logging username with value: " + username);

        // Step 4 Validate user is logged successfully
        Assert.assertTrue(proyectoFinal.verifyLogin(expectedLoggedInTitle));
        logger.log(LogStatus.INFO, "Validating user is logged in");

        // Step 5 Click Admin module
        proyectoFinal.clickAdminModule();
        logger.log(LogStatus.INFO, "Clicking Admin module");

        // Step 6 Validate user is able to see Admin page
        Assert.assertTrue(proyectoFinal.validateAdminModuleVisible());
        logger.log(LogStatus.INFO, "Validating user is able to see Admin page");

        // Step 7 Click Add button
        proyectoFinal.clickAddButton();
        logger.log(LogStatus.INFO, "Clicking Add user button");

        // Step 8 Fill out the form to create the user with: User role: Admin Employee name: "Aaliyah Haq" or any available Status: Enabled, username and password
        proyectoFinal.submitAddUserForm(employeeName, newUsername, newPassword);
        logger.log(LogStatus.INFO, "Submitting create new user form");

        // Step 9 Click on Save button
        proyectoFinal.saveNewUser();
        logger.log(LogStatus.INFO, "Clicking Save button");

        // Step 10 Insert user recently created into Username textbox
        proyectoFinal.typeNewUsernameIntoSearch(urlToSearch, newUsername);
        logger.log(LogStatus.INFO, "Inserting new username into search textbox");

        // Step 11 Click search
        proyectoFinal.clickSearch();
        logger.log(LogStatus.INFO, "Clicking Search button");

        // Step 12 Validate user exist in the table result after click search
        Assert.assertTrue(proyectoFinal.validateUserExist(newUsername));
        logger.log(LogStatus.INFO, "Validating user exist in the table result after click search");

        // Step 13 Select user in the table result and click Delete
        proyectoFinal.deleteUser();
        logger.log(LogStatus.INFO, "Selecting user in the table result and clicking Delete");

        // Step 14 Click on OK button in modal window (Delete records?)
        proyectoFinal.clickOkDeleteModal();
        logger.log(LogStatus.INFO, "Clicking on OK button in modal window (Delete records?)");

        // Step 15 Validate user was deleted successfully
        Assert.assertTrue(proyectoFinal.validateUserDeleted());
        logger.log(LogStatus.INFO, "Validating user was deleted successfully");

        logger.log(LogStatus.PASS, "Validation was successful for test: " + new Object() {}.getClass().getEnclosingMethod().getName());
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
