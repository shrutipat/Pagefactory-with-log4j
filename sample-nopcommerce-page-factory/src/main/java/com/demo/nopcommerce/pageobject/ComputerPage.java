package com.demo.nopcommerce.pageobject;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Util {
   /* By computersLink = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]");
    By computersText = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopImage = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
    By noteBookImage = By.xpath("//div[@class='page-body']//div[2]//div[1]//div[1]//a[1]//img[1]");
    By softwareImage = By.xpath("//div[@class='master-wrapper-content']//div[3]//div[1]//div[1]//a[1]//img[1]");*/

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computersLink;

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _computersText;

    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]")
    WebElement _desktopImage;

    @FindBy(xpath = "//div[@class='page-body']//div[2]//div[1]//div[1]//a[1]//img[1]")
    WebElement _noteBookImage;

    @FindBy(xpath = "//div[@class='master-wrapper-content']//div[3]//div[1]//div[1]//a[1]//img[1]")
    WebElement _softwareImage;

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    // mouse over on computers link
    public void mouseOverComputer() {
        log.info("Mouse over Computer");
        mouseOver(_computersLink);
        clickOnElement(_computersLink);
    }

    // get computer text
    public String getComputerText() {
        log.info("Get computer Test");
        return getTextFromElement(_computersText);
    }

    //click on desktop image
    public void clickOnDesktopImage() {
        log.info("click on Desktop image");
        clickOnElement(_desktopImage);
    }

    //click on notebook image
    public void clickOnNoteBookImage() {
        log.info("Click on Notebook Image");
        clickOnElement(_noteBookImage);
    }

    //click on software link
    public void clickOnSoftware() {
        log.info("click on software");
        clickOnElement(_softwareImage);
    }
}
