package com.computers.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTests {

    @Test
    public void Test() {
        // Linear Scripting
        /*
         * Locator:
         * ID
         * Name
         * Link Text
         * Partial Link Text
         * Class name
         * Tag Name
         * CSS Path
         * Xpath (Absoluto y Relativo)
         */

        /* Assertion
         * 1- Hard assertion
         * 2- Soft assertion
         */

        /* Pausas y sincronizacion
         * Implicit wait: Es una sincronizacion del script con el DOM
         * Explicit wait: Es una sincronizacion del script con un elemento en particular
         */

        // Step 1: Launch browser
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOpt);

        driver.get("https://computer-database.gatling.io/computers");

        // Implicit wait
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Explicit
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox")));

        // Step 2: Insert text into searchbox
        driver.findElement(By.id("searchbox")).sendKeys("ACE");

        // Step 3: Click on "Filter by Name"
        driver.findElement(By.id("searchsubmit")).click();

        // Step 4: Validate the text in the results is displayed
        String actualComputerName = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(actualComputerName, "ACE");
    }
}
