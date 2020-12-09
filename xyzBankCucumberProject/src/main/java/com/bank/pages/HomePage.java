package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.bank.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement _homeButton;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginBtn;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginBtn;

    //This method clicks on Customer Login Button
    public void clickOnCustomerLoginBtn() {
        Reporter.log("Click on Customer Login Button " + _customerLoginBtn.toString() + "<br>");
        log.info("Click on Customer Login Button " + _customerLoginBtn.toString());
        clickOnElement(_customerLoginBtn);
    }

    public void clickOnHomeButton() throws InterruptedException {
        Reporter.log("Clicks on Home Button " + _homeButton.toString() + "<br>");
        log.info("Clicks on Home Button " + _homeButton.toString());
        waitFor(2);
        clickOnElement(_homeButton);
    }

    //This methid clicks on Bank Manager Login Button
    public void clickOnBankManagerLoginBtn() {
        Reporter.log("Click on Bank Manager Login Button " + _bankManagerLoginBtn.toString() + "<br>");
        log.info("Click on Bank Manager Login Button " + _bankManagerLoginBtn.toString() + "<br>");
        clickOnElement(_bankManagerLoginBtn);
    }
}
