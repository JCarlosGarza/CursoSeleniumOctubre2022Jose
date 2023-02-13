package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base {

    private WebDriver driver;

    /*
     * Constructor
     *
     */
    public Base(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Chrome Driver Connection
     * @return driver
     */
    public WebDriver chromeDriverConnection() {
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOpt);
        return driver;
    }

    /**
     * Launch Browser
     */
    public void launchBrowser(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    /**
     * Implicit wait
     */
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /**
     * Explicit Wait
     *
     */
    public void verifyVisibilityOfElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void verifyTitleContains(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * Type
     */
    public void type(String text, By element) {

        driver.findElement(element).sendKeys(text);
    }

    /**
     * click
     */
    public void click(By element) {
        try {
            driver.findElement(element).click();
        }
        catch(NoSuchElementException e) {
            e.getMessage();
        }
    }

    /**
     * Get Text
     */
    public String getText(By element) {
        return driver.findElement(element).getText();
    }

    /**
     * Close browser
     */
    public void closeBrowser() {
        driver.close();
    }

    /**
     *
     * @param jsonFileObj
     * @param jsonKey
     * @return
     */
    public String getJSONValue(String jsonFileObj, String jsonKey){
        try {

            // JSON Data
            InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
            JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

            // Get Data
            String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
            return jsonValue;

        } catch (FileNotFoundException e) {
            Assert.fail("JSON file is not found");
            return null;
        }
    }


    /**
     * Take Screenshot
     */
    public String takeScreenshot(String fileName){
        try {
            String pathFileName= GlobalVariables.PATH_SCREENSHOTS + fileName + ".png";
            Screenshot screenshot = new AShot().takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
            return pathFileName;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
