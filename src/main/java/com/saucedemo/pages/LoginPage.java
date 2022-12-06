package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //* Enter “standard_user” username
    By usernameField = By.xpath("//input[@id='user-name']");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    //* Enter “secret_sauce” password
    By passwordField = By.xpath("//input[@id='password']");

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //* Click on ‘LOGIN’ button
    By clickOnLoginButton = By.xpath("//input[@id='login-button']");

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    //* Verify the text “PRODUCTS”
    By productsText = By.xpath("//span[contains(text(),'Products')]");

    public String getProductText() {
        return getTextFromElement(productsText);
    }

    By inventoryDisplayed = By.id("inventory_container");

    public void inventoryDisplay() {
        if (driver.findElement(inventoryDisplayed).isDisplayed() == true) {
            System.out.println("true");

        } else {
            System.out.println("no product displayed");
        }


    }
}
