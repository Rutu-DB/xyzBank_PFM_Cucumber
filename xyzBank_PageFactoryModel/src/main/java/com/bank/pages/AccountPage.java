package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[2][contains(text(),'Deposit')]")
    WebElement _depositClick;

    @FindBy(xpath = "//div[@class='form-group']/input")
            WebElement _depositAmount;

    @FindBy(xpath = "//form[@name='myForm']/button")
    WebElement _depositFinalClick;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement _getMessageDeposit;

    @FindBy(xpath = "//button[3][contains(text(),'Withdraw')]")
    WebElement _withdrawalBtn ;

    @FindBy(xpath = "//div[@class='form-group']/input")
    WebElement _withdrawalAmount;

    @FindBy(xpath = "\"//form[@name='myForm']/button\"")
    WebElement _withdrawalFinalClick;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement _getMessage;



    //This method will click to deposit Tab
    public void clickOnDepositTab() {
        Reporter.log("clicking on deposit" + _depositClick + "<br>");
        log.info("Click on Deposit " + _depositClick.toString() );
        clickOnElement(_depositClick);
    }

    //This method will deposit money
    public void depositMoney(String money) {
        Reporter.log("deposit money " + _depositAmount + "<br>");
        log.info("Deposit Money " + _depositAmount.toString());
        sendTextToElement(_depositAmount, money);
    }

    public void clickOnDepositFinalTab() {
        Reporter.log("clicking on deposit" + _depositFinalClick.toString() + "<br>");
        log.info("Click on deposit" + _depositFinalClick.toString());
        clickOnElement(_depositFinalClick);
    }

    public String getMessageToVerifyDeposit() {
        Reporter.log("get message to verify" + _getMessageDeposit + "<br>");
        log.info("Get Message to verify " + _getMessageDeposit.toString());
        return getTextFromElement(_getMessageDeposit);
    }


    //This method will click on withdrawal btn
    public void clickToWithdrawalBtn(){
        Reporter.log("clicking on Withdrawal btn"+_withdrawalBtn+"<br>");
        log.info("clicking on Withdrawal Button " + _withdrawalBtn.toString());
        clickOnElement(_withdrawalBtn);

    }
    //This method will withdrawal amount
    public void enterWithdrawalAmount(String withdrawal){
        Reporter.log("enter Withdrawal amount"+_withdrawalAmount+"<br>");
        log.info("Enter Withdrawal Amount " + _withdrawalAmount.toString());
        sendTextToElement(_withdrawalAmount,withdrawal);
    }
    public void clickOnWithdrawalFinalTab() {
        Reporter.log("clicking on Withdrawal" + _withdrawalFinalClick + "<br>");
        log.info("Clicking on Withdrawal " + _withdrawalFinalClick.toString());
        clickOnElement(_withdrawalFinalClick);
    }

    public String getMessageToVerify() {
        Reporter.log("get message to verify" + _getMessageDeposit + "<br>");
        log.info("Get message to verify " + _getMessageDeposit.toString());
        return getTextFromElement(_getMessageDeposit);
    }
}
