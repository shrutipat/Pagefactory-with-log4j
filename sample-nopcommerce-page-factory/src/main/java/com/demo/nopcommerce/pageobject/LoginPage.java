package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {
/*
By email = By.id("Email");
By password = By.id("Password");
By loginBtn = By.xpath("//input[@value='Log in']");
By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");*/

    @FindBy(id = "Email")
    WebElement _email;

    @FindBy(id = "Password")
    WebElement _password;

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement _loginBtn;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    // enter email address
    public void enterEmail(String str) {
        log.info("Enter email address");
        sendTextToElement(_email, str);
    }

    //enter password
    public void enterPassword(String str) {
        log.info("Enter password");
        sendTextToElement(_password, str);
    }

    //click on login button
    public void clickLoginBtn() {
        log.info("Click on Login Button");
        clickOnElement(_loginBtn);
    }

    //get welcome text
    public String getWelcomeText() {
        log.info("Get welcome text");
        return getTextFromElement(_welcomeText);
    }

}
