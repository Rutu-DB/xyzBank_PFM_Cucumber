package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {

    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;

//    @BeforeMethod(groups = {"Sanity", "Regression"})
//    public void setUp() {
//        homePage = new HomePage();
//        openAccountPage = new OpenAccountPage();
//        bankManagerLoginPage = new BankManagerLoginPage();
//    }


    @Test(groups = {"Sanity", "Regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        CustomersPage customersPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        AccountPage accountPage = new AccountPage();
        bankManagerLoginPage.clickOnBankManagerLoginBtn();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddToCustomerFinalBtn();
        addCustomerPage.verifyPopUpMessage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        CustomersPage customersPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        AccountPage accountPage = new AccountPage();
        bankManagerShouldAddCustomerSuccessfully();
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginBtn();
        openAccountPage.clickOnOpenAccountBtn();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrencyDropDown();
        openAccountPage.clickOnProcessBtn();
        openAccountPage.verifyPopUpMessage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        CustomersPage customersPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        AccountPage accountPage = new AccountPage();
        bankManagerShouldAddCustomerSuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        customersPage.isLogoutDisplayed();
        customersPage.verifyMessage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        CustomersPage customersPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        AccountPage accountPage = new AccountPage();
        bankManagerShouldOpenAccountSuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickOnDepositTab();
        accountPage.depositMoney("1000");
        accountPage.clickOnDepositFinalTab();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getMessageToVerifyDeposit();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = {"Sanity", "Regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
        AddCustomerPage addCustomerPage = new AddCustomerPage();
        CustomersPage customersPage = new CustomersPage();
        HomePage homePage = new HomePage();
        OpenAccountPage openAccountPage = new OpenAccountPage();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage();
        AccountPage accountPage = new AccountPage();
        customerShouldDepositMoneySuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickToWithdrawalBtn();
        accountPage.enterWithdrawalAmount("200");
        accountPage.clickOnWithdrawalFinalTab();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getMessageToVerify();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    /*@AfterMethod(groups = {"Smoke","Sanity","Regression"})
    public void tearDown(){
        driver.quit();
    }*/


}
