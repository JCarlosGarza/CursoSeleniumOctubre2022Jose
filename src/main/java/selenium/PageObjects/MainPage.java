package selenium.PageObjects;

import selenium.base.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Base {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    By txtSearchBox = By.id("searchbox");
    By btnFilterByName = By.id("searchsubmit");
    By tblActualFirstRow = By.xpath("//tbody/tr[1]/td[1]");


    /**
     * filterByComputerName
     */
    public void filterByComputerName(String computer) {
        verifyTitleContains("Computers");
        verifyVisibilityOfElement(txtSearchBox);
        type(computer, txtSearchBox);
        takeScreenshot("typeInSearchBox");
        click(btnFilterByName);
        takeScreenshot("resultsAfterClick");
    }

    /**
     * verifyComputerTable
     */
    public boolean verifyComputerTable(String expectedComputer) {
        String actualComputer = getText(tblActualFirstRow);
        takeScreenshot("verifyComputer");
        if (expectedComputer.equals(actualComputer)) {
            return true;
        } else {
            return false;
        }
    }
}
