package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.bank.utility.Utility;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginBtn;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _yourNameDropDown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement _loginBtn;

    // This method clicks on Customer Login button
    public void clickOnCustomerLoginBtn() {
        Reporter.log("Clicks on Customer Login Button " + _customerLoginBtn.toString() + "<br>");
        log.info("Click on Customer Login Button " + _customerLoginBtn.toString());
        clickOnElement(_customerLoginBtn);
    }

    // This method selects name from DropDown
    public void selectYourNameDropDown() {
        Reporter.log("Selects from Drop Down " +  _yourNameDropDown.toString() + "<br>");
        selectByIndexFromDropDown(_yourNameDropDown, 0);
    }

    // This method clicks on Login Button
    public void clickOnLoginBtn() throws InterruptedException {
        Reporter.log("Clicks on Login Button " + _loginBtn.toString() + "<br>");
        //waitFor(10);
        clickOnElement(_loginBtn);
    }
}
