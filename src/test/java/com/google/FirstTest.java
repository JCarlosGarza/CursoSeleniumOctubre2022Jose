package com.google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void f() {
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeOpt);

        driver.get("https://www.google.com/");
    }
}
