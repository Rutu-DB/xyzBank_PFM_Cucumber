$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featureFile/BankTest.feature");
formatter.feature({
  "line": 1,
  "name": "xyz bank test",
  "description": "As a user I want to all bank functionality",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7515783300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that Bank manager should add customer successfully",
  "description": "",
  "id": "xyz-bank-test;verify-that-bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on xyz bank homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on bank manager Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I add new customer account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should add customer successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestStepDefs.iAmOnXyzBankHomepage()"
});
formatter.result({
  "duration": 92265200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iClickOnBankManagerLoginButton()"
});
formatter.result({
  "duration": 80027700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iAddNewCustomerAccount()"
});
formatter.result({
  "duration": 862217800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldAddCustomerSuccessfully()"
});
formatter.result({
  "duration": 7070700,
  "status": "passed"
});
formatter.after({
  "duration": 641511200,
  "status": "passed"
});
formatter.before({
  "duration": 6255692500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify that Bank manager should open account successfully",
  "description": "",
  "id": "xyz-bank-test;verify-that-bank-manager-should-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Sanity"
    },
    {
      "line": 9,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I have added a customer successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on open account button by navigating on Home page under Bank managers login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on process button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be able to open account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestStepDefs.iHaveAddedACustomerSuccessfully()"
});
formatter.result({
  "duration": 1069747400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iClickOnOpenAccountButtonByNavigatingOnHomePageUnderBankManagersLogin()"
});
formatter.result({
  "duration": 2682124900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iClickOnProcessButton()"
});
formatter.result({
  "duration": 47665900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldBeAbleToOpenAccountSuccessfully()"
});
formatter.result({
  "duration": 4954000,
  "status": "passed"
});
formatter.after({
  "duration": 635407500,
  "status": "passed"
});
formatter.before({
  "duration": 6555012500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify that customer should login and logout successfully",
  "description": "",
  "id": "xyz-bank-test;verify-that-customer-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I have added a customer successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I click on customer login button by navigating on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I login using registered customer login details",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I should be able to logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestStepDefs.iHaveAddedACustomerSuccessfully()"
});
formatter.result({
  "duration": 783869200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iClickOnCustomerLoginButtonByNavigatingOnHomePage()"
});
formatter.result({
  "duration": 101555300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iLoginUsingRegisteredCustomerLoginDetails()"
});
formatter.result({
  "duration": 590651400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldBeAbleToLoginSuccessfully()"
});
formatter.result({
  "duration": 16351400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 29869500,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldBeAbleToLogoutSuccessfully()"
});
formatter.result({
  "duration": 17993100,
  "status": "passed"
});
formatter.after({
  "duration": 631454900,
  "status": "passed"
});
formatter.before({
  "duration": 6823920000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "verify that customer should be able to deposit money successfully",
  "description": "",
  "id": "xyz-bank-test;verify-that-customer-should-be-able-to-deposit-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I have a valid bank account",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I logged in using valid customer details",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I deposit \"1000\" money by navigating on deposit tab",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should be able to deposit money successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestStepDefs.iHaveAValidBankAccount()"
});
formatter.result({
  "duration": 3784561100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iLoggedInUsingValidCustomerDetails()"
});
formatter.result({
  "duration": 478335800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 11
    }
  ],
  "location": "BankTestStepDefs.iDepositMoneyByNavigatingOnDepositTab(String)"
});
formatter.result({
  "duration": 499713800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldBeAbleToDepositMoneySuccessfully()"
});
formatter.result({
  "duration": 30520100,
  "status": "passed"
});
formatter.after({
  "duration": 619652700,
  "status": "passed"
});
formatter.before({
  "duration": 6561366500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify that customer should be able to withdraw money successfully",
  "description": "",
  "id": "xyz-bank-test;verify-that-customer-should-be-able-to-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I have a valid bank account",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I logged in using valid customer details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I deposit \"1000\" money by navigating on deposit tab",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I withdraw \"200\" money",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I should be able to withdraw money successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestStepDefs.iHaveAValidBankAccount()"
});
formatter.result({
  "duration": 3563549600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iLoggedInUsingValidCustomerDetails()"
});
formatter.result({
  "duration": 482070300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 11
    }
  ],
  "location": "BankTestStepDefs.iDepositMoneyByNavigatingOnDepositTab(String)"
});
formatter.result({
  "duration": 583718400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "BankTestStepDefs.iWithdrawMoney(String)"
});
formatter.result({
  "duration": 599236400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestStepDefs.iShouldBeAbleToWithdrawMoneySuccessfully()"
});
formatter.result({
  "duration": 34869300,
  "status": "passed"
});
formatter.after({
  "duration": 636013900,
  "status": "passed"
});
});