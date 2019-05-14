package com.demo.nopcommerce.webpages;

import com.demo.nopcommerce.pageobject.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends TestBase {

    static final Logger log = Logger.getLogger(com.demo.nopcommerce.webpages.TestSuit.class);

    //From home page user should navigate to registration page successfully
    @Test
    public void userShouldNavigateToRegistrationPageSuccessfully() {

        RegistrationPage registrationPage = new RegistrationPage();
        HomePage homePage = new HomePage();
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        String actualText = registrationPage.getRegisterText();
        Assert.assertEquals(actualText, expectedText);
        BasicConfigurator.configure();

    }

    // From home page user should navigate to computer page successfully
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();
        homePage.clickOnComputers();
        String actualText = computerPage.getComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    // From home page user should navigate to login page successfully
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnLoginLink();
        String text = loginPage.getWelcomeText();
        Assert.assertTrue(text.equals("Welcome, Please Sign In!"));
    }

    //Login should fail and error message should appear when login is invalid
    @Test
    public void loginShouldFailAndErrorMessageShouldAppearWhenLoginIsInvalid() {
        HomePage homePage = new HomePage();
        homePage.clickOnLoginLink();
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("abcd@abc.com");
        loginPage.enterPassword("password");
        loginPage.clickLoginBtn();
        WebElement text = driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]"));
        org.junit.Assert.assertTrue("No customer account found", text.isDisplayed());
    }

    // User should navigate to desktop page successfully
    @Test
    public void userShouldNavigateToDesktopPageSuccessfully() {
        HomePage homePage = new HomePage();
        homePage.clickOnComputers();
        ComputerPage computerPage = new ComputerPage();
        computerPage.clickOnDesktopImage();
        DesktopPage desktopPage = new DesktopPage();
        String actualText = desktopPage.getDesktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }

    // User should navigate to build your own page successfully
    @Test
    public void userShouldNavigateToBuildYourOwnPageSuccessfully() {
        HomePage homePage = new HomePage();
        homePage.clickOnComputers();
        ComputerPage computerPage = new ComputerPage();
        computerPage.clickOnDesktopImage();
        DesktopPage desktopPage = new DesktopPage();
        desktopPage.scrollUpDown(600);
        desktopPage.clickOnAddToCartBtn();
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();
        String actualText = buildYourOwnPage.getBuildYourOwnText();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText, expectedText);
    }

    // Desktop item should be added to basket successfully
    @Test
    public void desktopShouldAddToBasketSuccessfully() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnComputers();
        ComputerPage computerPage = new ComputerPage();
        computerPage.clickOnDesktopImage();
        DesktopPage desktopPage = new DesktopPage();
        desktopPage.scrollUpDown(600);
        desktopPage.clickOnAddToCartBtn();
        Thread.sleep(2000);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();
        buildYourOwnPage.scrollUpDown(500);
        Thread.sleep(3000);
        buildYourOwnPage.clickOnHdd320GB();
        buildYourOwnPage.scrollUpDown(200);
        buildYourOwnPage.clickOnAddtoCart();
        Thread.sleep(2000);
        Assert.assertTrue(buildYourOwnPage.checkIfItemIsAddedSuccessfully());
    }
}


