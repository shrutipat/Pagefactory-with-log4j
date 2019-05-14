package com.demo.nopcommerce.webpages;

import com.demo.nopcommerce.pageobject.ComputerPage;
import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.pageobject.LoginPage;
import com.demo.nopcommerce.pageobject.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends TestBase {

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(className = "ico-register")
    WebElement _registerLink;

    @FindBy(className = "wishlist-label")
    WebElement _shoppingCart;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computers;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    WebElement _electronics;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Apparel')]")
    WebElement _apparel;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
    WebElement _digitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
    WebElement _books;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
    WebElement _jewellery;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
    WebElement _giftCards;


    @Test
    public void userShouldNavigateToRegistrationPageSuccessfully() {
        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = new RegistrationPage();
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        String actualText = registrationPage.getRegisterText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();
        homePage.clickOnComputers();
        String actualText = computerPage.getComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnLoginLink();
        String text = loginPage.getWelcomeText();
        Assert.assertTrue(text.equals("Welcome, Please Sign In!"));
    }

}
