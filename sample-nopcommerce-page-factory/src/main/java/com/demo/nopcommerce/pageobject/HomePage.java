package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {
    // save Homepage locators
   /* By loginLink = By.linkText("Log in");
    By registerLink = By.className("ico-register");
    By wishList = By.className("wishlist-label");
    By shoppingCart = By.className("cart-label");
    By computers = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]");
    By electronics = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Electronics')]");
    By apparel = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Apparel')]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]");
    By books = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]");
    By jewellery = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Jewelry')]");
    By giftCards = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]");*/

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(className = "ico-register")
    WebElement _registerLink;

    @FindBy(className = "wishlist-label")
    WebElement _wishList;

    @FindBy(className = "cart-label")
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

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    //click on Login Link
    public void clickOnLoginLink() {
        log.info("Click on Login Link");
        clickOnElement(_loginLink);
    }

    //click on register link
    public void clickOnRegisterLink() {
        log.info("Click on Register Link");
        clickOnElement(_registerLink);
    }

    //click on wish list link
    public void clickOnWishList() {
        log.info("Click on WishList Link");
        clickOnElement(_wishList);
    }

    //click on shopping cart
    public void clickOnShoppingCart() {
        log.info("Click on Login Link");
        clickOnElement(_shoppingCart);
    }

    //click on computers
    public void clickOnComputers() {
        log.info("Click on Computer Link");
        clickOnElement(_computers);
    }

    //click on electronics
    public void clickOnElectronics() {
        log.info("Click on electronics Link");
        clickOnElement(_electronics);
    }

    //click on apparel
    public void clickOnApparel() {
        log.info("Click on Apparel Link");
        clickOnElement(_apparel);
    }

    //click on digital downloads
    public void clickOnDigitalDownloads() {
        log.info("Click on Digital Download Link");
        clickOnElement(_digitalDownloads);
    }

    //click on books
    public void clickOnBooks() {
        log.info("Click on Books Link");
        clickOnElement(_books);
    }

    //click on jewellery
    public void clickOnJewellery() {
        log.info("Click on Jewellery Link");
        clickOnElement(_jewellery);
    }

    //click on gift cards
    public void clickOnGiftCards() {
        log.info("Click on Gift Cards Link");
        clickOnElement(_giftCards);
    }
}
