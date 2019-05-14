package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Util {

    /*By sortByDropDown = By.id("products-orderby");
    By desktopTextOnDesktopPage = By.xpath("//h1[contains(text(),'Desktops')]");
    By addToCartBtn = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");*/
    String zToA = "Name: Z to A";

    @FindBy(id = "products-orderby")
    WebElement _sortByDropDown;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement _desktopTextOnDesktopPage;

    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
    WebElement _addToCartBtn;

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _buildYourOwnText;

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    //click on sort by dropdown
    public void clickOnSortByDropDown() {
        log.info("Click on sort by drop down");
        clickOnElement(_sortByDropDown);
    }

    //click on select Z to A
    public void select_zToA() {
        log.info("select Z to A");
        select_By_Visible_Text(_sortByDropDown, zToA);
    }

    //scroll down desktop page
    public void scrollDownDesktopPage(int i) {
        log.info("scroll down desktop page");
        scrollUpDown(i);
    }

    //click on add to cart button
    public void clickOnAddToCartBtn() {
        log.info("click on add to cart button");
        clickOnElement(_addToCartBtn);
    }

    //get desktop text
    public String getDesktopText() {
        log.info("Get desktop text");
        return getTextFromElement(_desktopTextOnDesktopPage);
    }
}
