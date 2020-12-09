package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import com.bank.utility.Utility;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//div[@class='center']//button[@ng-class='btnClass1']")
    WebElement _addCustomerBtn;

    @FindBy(xpath = "//div[@class='form-group']//input[@placeholder='First Name']")
    WebElement _firstNameField;

    @FindBy(xpath = "//div[@class='form-group']//input[@placeholder='Last Name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//div[@class='form-group']//input[@placeholder='Post Code']")
    WebElement _postCodeField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement _addCustomerBtnFinal;

    // This method Clicks on Add To Customer Button
    public void clickOnAddCustomerButton() {
        Reporter.log("Clicks on Add Customer Button " + _addCustomerBtn.toString() + "<br>");
        log.info("Clicks on Add Customer Button " + _addCustomerBtn.toString());
        clickOnElement(_addCustomerBtn);
    }

    //This method clicks and send text to First Name Field
    public void enterFirstName() {
        Reporter.log("Click on Add First Name Field " + _firstNameField.toString() + "<br>");
        log.info("Click on Add First Name Field " + _firstNameField.toString());
        clickOnElement(_firstNameField);
        sendTextToElement(_firstNameField, "Alpha1");
    }

    //This method clicks and send text to Last Name Field
    public void enterLastName() {
        Reporter.log("Sends text to LastName Field " + _lastNameField.toString() + "<br>");
        log.info("Sends text to LastName Field " + _lastNameField.toString());
        clickOnElement(_lastNameField);
        sendTextToElement(_lastNameField, "Beta1");
    }

    //This method clicks and send text to Post Code Field
    public void enterPostCode() {
        Reporter.log("send text to PostCode Field " + _postCodeField.toString() + "<br>");
        log.info("Send text to PostCode Field " + _postCodeField.toString());
        clickOnElement(_postCodeField);
        sendTextToElement(_postCodeField, "AL1 6VB");
    }

    // This method clicks on Final Add Customer Button
    public void clickOnAddToCustomerFinalBtn() {
        Reporter.log("Clicks on Add to Customer Button" + _addCustomerBtnFinal + "<br>");
        log.info("Clicks on Add to Customer Button " + _addCustomerBtnFinal);

        clickOnElement(_addCustomerBtnFinal);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Customer added successfully"));
        alertDialog.accept();
    }
}
