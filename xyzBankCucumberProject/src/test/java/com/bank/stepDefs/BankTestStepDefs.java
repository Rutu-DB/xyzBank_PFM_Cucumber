package com.bank.stepDefs;

import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankTestStepDefs {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Given("^I am on xyz bank homepage$")
    public void iAmOnXyzBankHomepage() {

    }

    @And("^I click on bank manager Login button$")
    public void iClickOnBankManagerLoginButton() {
        bankManagerLoginPage.clickOnBankManagerLoginBtn();
    }

    @When("^I add new customer account$")
    public void iAddNewCustomerAccount() {
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddToCustomerFinalBtn();

    }

    @Then("^I should add customer successfully$")
    public void iShouldAddCustomerSuccessfully() {
        addCustomerPage.verifyPopUpMessage();
    }

    @Given("^I have added a customer successfully$")
    public void iHaveAddedACustomerSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerLoginBtn();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddToCustomerFinalBtn();
        addCustomerPage.verifyPopUpMessage();
    }

    @And("^I click on open account button by navigating on Home page under Bank managers login$")
    public void iClickOnOpenAccountButtonByNavigatingOnHomePageUnderBankManagersLogin() throws InterruptedException {
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginBtn();
        openAccountPage.clickOnOpenAccountBtn();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrencyDropDown();
    }

    @When("^I click on process button$")
    public void iClickOnProcessButton() {
        openAccountPage.clickOnProcessBtn();
    }

    @Then("^I should be able to open account successfully$")
    public void iShouldBeAbleToOpenAccountSuccessfully() {
        openAccountPage.verifyPopUpMessage();
    }

    @And("^I click on customer login button by navigating on Home page$")
    public void iClickOnCustomerLoginButtonByNavigatingOnHomePage() {
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
    }

    @When("^I login using registered customer login details$")
    public void iLoginUsingRegisteredCustomerLoginDetails() throws InterruptedException {
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() {
        customersPage.isLogoutDisplayed();
    }

    @When("^I click on logout button$")
    public void iClickOnLogoutButton() {
        customersPage.verifyMessage();
    }

    @Then("^I should be able to logout successfully$")
    public void iShouldBeAbleToLogoutSuccessfully() {
        customersPage.isHomeButtonDisplayed();
    }

    @Given("^I have a valid bank account$")
    public void iHaveAValidBankAccount() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManagerLoginBtn();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddToCustomerFinalBtn();
        addCustomerPage.verifyPopUpMessage();
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginBtn();
        openAccountPage.clickOnOpenAccountBtn();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrencyDropDown();
        openAccountPage.clickOnProcessBtn();
        openAccountPage.verifyPopUpMessage();
    }

    @And("^I logged in using valid customer details$")
    public void iLoggedInUsingValidCustomerDetails() throws InterruptedException {
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();

    }

    @When("^I deposit \"([^\"]*)\" money by navigating on deposit tab$")
    public void iDepositMoneyByNavigatingOnDepositTab(String depositAmount) {
        accountPage.clickOnDepositTab();
        accountPage.depositMoney(depositAmount);
        accountPage.clickOnDepositFinalTab();
    }

    @Then("^I should be able to deposit money successfully$")
    public void iShouldBeAbleToDepositMoneySuccessfully() {
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getMessageToVerifyDeposit();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("^I withdraw \"([^\"]*)\" money$")
    public void iWithdrawMoney(String withdrawAmount) throws Throwable {
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickToWithdrawalBtn();
        accountPage.enterWithdrawalAmount(withdrawAmount);
        accountPage.clickOnWithdrawalFinalTab();
    }

    @Then("^I should be able to withdraw money successfully$")
    public void iShouldBeAbleToWithdrawMoneySuccessfully() {
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getTransactionMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
