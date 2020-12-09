package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//div[@class='center']//button[@ng-class='btnClass2']")
    WebElement _openAccountBtn;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _customerNameDropDown;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement _currencyDropDown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;

    //This method clicks on Open Account Button
    public void clickOnOpenAccountBtn() {
        Reporter.log("Clicks on Open Account Button " + _openAccountBtn.toString() + "<br>");
        log.info("Clicks on Open Account Button " + _openAccountBtn.toString());
        clickOnElement(_openAccountBtn);
    }

    //This method selects Customer Name from DropDown
    public void selectCustomerName() {
        Reporter.log("Selects Customer Name from Drop Down " + _customerNameDropDown.toString() + "<br>");
        log.info("Selects Customer Name from Drop Down " + _customerNameDropDown.toString());
        clickOnElement(_customerNameDropDown);
        selectByIndexFromDropDown(_customerNameDropDown, 6);
    }

    //This method selects Currency from DropDown
    public void selectCurrencyDropDown() {
        Reporter.log("Selects Currency Drop Down " + _currencyDropDown.toString() + "<br>");
        log.info("Selects Currency Drop Down");
        selectByIndexFromDropDown(_currencyDropDown, 1);
    }

    // This method clicks on Process Button
    public void clickOnProcessBtn() {
        Reporter.log("Clicks on Process Button " + _processBtn.toString() + "<br>");
        log.info("Clicks on Process Button " + _processBtn.toString());
        clickOnElement(_processBtn);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Account created successfully"));
        alertDialog.accept();

    }
}