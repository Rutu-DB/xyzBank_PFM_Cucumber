package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import com.bank.utility.Utility;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginBtn;

    @FindBy(xpath = "//div[@class='center']//button[@ng-class='btnClass2']")
    WebElement _openAccountBtn;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _customerNameField;


    @FindBy(xpath = "//select[@id='currency']")
    WebElement _currencyField;


    // This method clicks on Bank Manager Login Button
    public void clickOnBankManagerLoginBtn() {
        Reporter.log("Clicks on Managers Login Button " + _bankManagerLoginBtn.toString() + "<br>");
        log.info("Clicks on Managers Login Button " + _bankManagerLoginBtn.toString());
        clickOnElement(_bankManagerLoginBtn);
    }

    //This method clicks on Open Account Button
    public void clickOnOpenAccountBtn() {
        Reporter.log("Cicks on Open Account Button" + _openAccountBtn.toString() + "<br>");
        log.info("Clicks on Open Account Button " + _openAccountBtn.toString());
        clickOnElement(_openAccountBtn);
    }

    //This method clicks on Customer Field
    public void selectCustomerNameFromDropdown() {
        Reporter.log("Selects Customer Name from Dropdown " + _customerNameField.toString() + "<br>");
        log.info("Selects Customer Name from Dropdown " + _customerNameField.toString());
        clickOnElement(_customerNameField);
    }

    //This method selects "pounds" from currency field
    public void selectCurrencyDropdown() {
        Reporter.log("Select Pound from Currency Dropdown " + _currencyField.toString() + "<br>");
        log.info("Select pound from Currency Dropdown " + _customerNameField.toString());
        selectByIndexFromDropDown(_customerNameField, 1);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Customer added successfully"));
        alertDialog.accept();
    }

}
