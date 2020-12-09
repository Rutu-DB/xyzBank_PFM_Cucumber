package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import com.bank.utility.Utility;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    @FindBy(xpath = "//div[@class='center']//button[@ng-class='btnClass3']")
    WebElement _customerBtn;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchField;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement _homePageBtn;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement _logoutBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement _expectedMessage;

    // This method clicks on Customer Button
    public void clickOnCustomerBtn() {
        Reporter.log("Click on Customer Button " + _customerBtn.toString() + "<br>");
        log.info("Click on Customer Button " + _customerBtn.toString());
        clickOnElement(_customerBtn);
    }
//This method searches on Customer Field

    public void searchCustomerFeild() {
        Reporter.log("Selects drop Down from Searches Customer Field " + _searchField + "<br>");
        log.info("Selects Drop Down from searches customer Field " + _searchField.toString());
        clickOnElement(_searchField);
        sendTextToElement(_searchField, "Alpha");
    }
    //Thsi method clickOnHomeButton

    public void clickonHomeButton() {
        clickOnElement(_homePageBtn);
    }

    //This method to verify logout btn
    public WebElement isLogoutDisplayed() {
        Reporter.log("verification of logout btn " + _logoutBtn + "<br>");
        log.info("Verification of Logout Button " + _logoutBtn.toString());
        return _logoutBtn;
    }
    public WebElement isHomeButtonDisplayed() {
        Reporter.log("verification of logout btn " + _homePageBtn + "<br>");
        log.info("Verification of Logout Button " + _homePageBtn.toString());
        return _homePageBtn;
    }

    public void verifyMessage() {
        log.info("Verifying Message name " + _expectedMessage);
        String actualMessage = "Your Name :";
        Assert.assertEquals(actualMessage, getTextFromElement(_expectedMessage));
    }


}