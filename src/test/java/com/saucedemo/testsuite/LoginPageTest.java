package com.saucedemo.testsuite;

import com.google.common.base.Verify;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    //  1. userShouldLoginSuccessfullyWithValid Credentials
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        Thread.sleep(500);
        //* Enter “standard_user” username
        loginPage.enterUsername("standard_user");
        //* Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the text “PRODUCTS”
        String expectedErrorMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getProductText(), expectedErrorMessage, "Message not displayed");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //* Enter “standard_user” username
        loginPage.enterUsername("standard_user");
        // * Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        // * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // * Verify that six products are displayed on page
        loginPage.inventoryDisplay();
    }


}
