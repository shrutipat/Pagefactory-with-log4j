package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Util {
/*
    By registerLink = By.xpath("//a[@class='ico-register']");
    By femaleGender = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirth = By.name("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.name("Password");
    By confirmPassword = By.name("ConfirmPassword");
    By company = By.id("Company");
    By newsLetter = By.id("Newsletter");
    By registerBtn = By.id("register-button");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");  */

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;
    @FindBy(id = "gender-female")
    WebElement _femaleGender;
    @FindBy(id = "FirstName")
    WebElement _firstName;
    @FindBy(id = "LastName")
    WebElement _lastName;
    @FindBy(name = "DateOFBirthDay")
    WebElement _dateOfBirth;
    @FindBy(name = "DateOfBirthMonth")
    WebElement _monthOfBirth;
    @FindBy(name = "DateOfBirthYear")
    WebElement _yearOfBirth;
    @FindBy(id = "Email")
    WebElement _email;
    @FindBy(name = "Password")
    WebElement _password;
    @FindBy(name = "ConfirmPassword")
    WebElement _confirmPassword;
    @FindBy(id = "Company")
    WebElement _company;
    @FindBy(id = "Newsletter")
    WebElement _newsLetter;
    @FindBy(id = "register-button")
    WebElement _registerBtn;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement _registerText;

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    public String randomEmail() {
        log.info("Random email generated");
        return ("myemail" + generateRandomNumber() + "@email.com");
    }

    // click on register link
    public void clickOnRegister() {
        log.info("Click on register");
        clickOnElement(_registerLink);
    }

    //click on female
    public void clickOnFemale() {
        log.info("Click on female");
        clickOnElement(_femaleGender);
    }

    //enter first name
    public void enterFirstName(String str) {
        log.info("Enter First Name");
        sendTextToElement(_firstName, str);
    }

    //enter last name
    public void enterLastName(String str) {
        log.info("Enter Last Name");
        sendTextToElement(_lastName, str);
    }

    //select date of birth
    public void selectDateOfBirth(int i) {
        log.info("Select Date of Birth");
        select_By_Index(_dateOfBirth, i);
    }

    //select month of birth
    public void selectMonthOfBirth(int i) {
        log.info("Select Month of Birth");
        select_By_Index(_monthOfBirth, i);
    }

    //select year of birth
    public void selectYearOfBirth(int i) {
        log.info("Select Year of Birth");
        select_By_Index(_yearOfBirth, i);
    }

    //Enter auto email
    public void enterAutoEmail() {
        log.info("Enter auto email");
        sendTextToElement(_email, randomEmail());
    }

    // Enter password
    public void enterPassword(String str) {
        log.info("Enter Password");
        sendTextToElement(_password, str);
    }

    // Enter confirm password
    public void enterConfirmPassword(String str) {
        log.info("Enter confirm password");
        sendTextToElement(_confirmPassword, str);
    }

    //Enter company name
    public void enterCompanyName(String str) {
        log.info("Enter company name");
        sendTextToElement(_company, str);
    }

    //Click Newsletter check box
    public void clickNewsLetter() {
        log.info("Click on Newsletter");
        clickOnElement(_newsLetter);
    }

    // Click on register button
    public void clickOnRegisterBtn() {
        log.info("Click on Register button");
        clickOnElement(_registerBtn);
    }

    //Get register text
    public String getRegisterText() {
        log.info("Click on Register Text");
        return getTextFromElement(_registerText);
    }

}
