package com.demo.nopcommerce.webpages;

import com.demo.nopcommerce.pageobject.ComputerPage;
import com.demo.nopcommerce.pageobject.DesktopPage;
import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    @Test
    public void userShouldNavigateToDesktopPageSuccessfully() {
        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();
        DesktopPage desktopPage = new DesktopPage();
        homePage.clickOnComputers();
        computerPage.clickOnDesktopImage();
        String actualText = desktopPage.getDesktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }

}
