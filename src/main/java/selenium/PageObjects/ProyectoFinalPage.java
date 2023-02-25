package selenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.base.Base;

public class ProyectoFinalPage extends Base {

    public ProyectoFinalPage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    By txtUsername = By.name("username");
    By txtPassword = By.name("password");
    By btnLogin = By.xpath("//button[@type='submit']");
    By hdrTitleLoggedIn = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    By aorAdminModule = By.xpath("//li[1]//a[1]//span[1]");
    By hdrTitleAdminModule = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']");
    By btnAdd = By.xpath("//button[normalize-space()='Add']");
    By slcUserRole = By.xpath("//div[@class='oxd-select-wrapper'][1]");
    By optUserRoleAdmin = By.xpath("//div[@role='option' and @class='oxd-select-option']//span[contains(text(),\"Admin\")]");
    By txtEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By optEmployeeNameSuggestion;
    By slcUserStatus = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
    By optStatusEnabled = By.xpath("//div[@role='option' and @class='oxd-select-option']//span[contains(text(),\"Enabled\")]");
    By btnSave = By.xpath("//button[@type='submit'][normalize-space()='Save']");
    By txtNewUsername = By.xpath("(//input[contains(concat(' ',normalize-space(@class),' '),' oxd-input ')])[2]");
    By txtNewPassword = By.xpath("(//input[contains(concat(' ',normalize-space(@class),' '),' oxd-input ')])[3]");
    By txtConfirmPassword = By.xpath("(//input[contains(concat(' ',normalize-space(@class),' '),' oxd-input ')])[4]");
    By txtNewUsernameSearch;
    By btnSearch = By.xpath("//button[@type='submit'][normalize-space()='Search']");
    By divUserFound;
    By chkUsernameDelete = By.xpath("(//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"])[2]");
    By btnDeleteSelected = By.xpath("//button[normalize-space()='Delete Selected']");
    By btnDeleteConfirm = By.xpath("//button[normalize-space()='Yes, Delete']");
    By pghDeleteConfirmed = By.xpath("//p[contains(concat(' ',normalize-space(@class),' '),' oxd-text--toast-message ')][normalize-space() = 'Successfully Deleted']");
    /**
     * login
     */
    public void login(String username, String password) {
        verifyTitleContains("OrangeHRM");
        verifyVisibilityOfElement(txtUsername);
        type(username, txtUsername);
        verifyVisibilityOfElement(txtPassword);
        type(password, txtPassword);
        click(btnLogin);
    }

    /**
     * verifyLogin
     */
    public boolean verifyLogin(String expectedTitle) {
        return verifyVisibilityOfElementWithValue(hdrTitleLoggedIn);
    }

    /**
     * clickAdminModule
     */
    public void clickAdminModule() {
        click(aorAdminModule);
    }

    /**
     * validateAdminModuleVisible
     */
    public boolean validateAdminModuleVisible() {
        return verifyVisibilityOfElementWithValue(hdrTitleAdminModule);
    }

    /**
     * clickAddButton
     */
    public void clickAddButton() {
        click(btnAdd);
    }

    /**
     * submitAddUserForm
     */
    public void submitAddUserForm(String employeeName, String newUsername, String newPassword) {
        verifyVisibilityOfElement(slcUserRole);
        type(newUsername, txtNewUsername);
        optEmployeeNameSuggestion = By.xpath(String.format("(//div[@role='option'][contains(concat(' ',normalize-space(@class),' '),' oxd-autocomplete-option ')]//span[contains(text(),'%s')])[1]", employeeName));
        click(slcUserRole);
        click(optUserRoleAdmin);
        type(employeeName, txtEmployeeName);
        verifyVisibilityOfElement(optEmployeeNameSuggestion);
        click(optEmployeeNameSuggestion);
        click(slcUserStatus);
        click(optStatusEnabled);
        type(newPassword, txtNewPassword);
        type(newPassword, txtConfirmPassword);
    }

    /**
     * saveNewUser;
     */
    public void saveNewUser() {
        click(btnSave);
    }

    /**
     * typeNewUsernameIntoSearch
     */
    public void typeNewUsernameIntoSearch(String urlToSearch, String newUsername) {
        validateAdminModuleVisible();
        txtNewUsernameSearch = By.xpath("(//input[contains(concat(' ',normalize-space(@class),' '),' oxd-input ')])[2]");
        type(newUsername, txtNewUsernameSearch);
    }

    /**
     * clickSearch
     */
    public void clickSearch() {
        click(btnSearch);
    }

    /**
     * validateUserExist
     */
    public boolean validateUserExist(String newUsername) {
        divUserFound = By.xpath(String.format("//div[normalize-space()='%s']", newUsername));
        return verifyVisibilityOfElementWithValue(divUserFound);
    }

    /**
     * deleteUser
     */
    public void deleteUser() {
        click(chkUsernameDelete);
        verifyVisibilityOfElement(btnDeleteSelected);
        click(btnDeleteSelected);
    }

    /**
     * clickOkDeleteModal
     */
    public void clickOkDeleteModal() {
        verifyVisibilityOfElement(btnDeleteConfirm);
        click(btnDeleteConfirm);
    }

    /**
     * validateUserDeleted
     */
    public boolean validateUserDeleted() {
        return verifyVisibilityOfElementWithValue(pghDeleteConfirmed);
    }
}
