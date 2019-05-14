package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnPage extends Util {
    /*String buildYourOwn = "Build your own computer";
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By productIsAddedText = By.xpath("//p[@class='content']");
    By hdd_320GB = By.xpath("//input[@id='product_attribute_3_6']");
    By addToCartBtn = By.xpath("//input[@id='add-to-cart-button-1']");*/

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _buildYourOwnText;

    @FindBy(xpath = "//p[@class='content']")
    WebElement _productIsAddedText;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement _hdd_320GB;

    @FindBy(xpath = "//input[@id='add-to-cart-button-1']")
    WebElement _addToCartBtn;

    private static final Logger log = LogManager.getLogger(BuildYourOwnPage.class.getName());

    //Get build you own page text
    public String getBuildYourOwnText() {
        log.info("Click on Login Link");
        return getTextFromElement(_buildYourOwnText);
    }

    //Click on hdd320GB
    public void clickOnHdd320GB() {
        log.info("Click on Hdd 320GB");
        clickOnElement(_hdd_320GB);
    }

    //Click on add to cart button
    public void clickOnAddtoCart() {
        log.info("click on Add to Cart");
        clickOnElement(_addToCartBtn);
    }

    //check if item is added successfully in the basket
    public boolean checkIfItemIsAddedSuccessfully() {
        log.info("check if item is added successfully");
        return _productIsAddedText.isDisplayed();
    }
}
