package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import base.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyLogoIsDisplayedAndClickable() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed at home page.");
        Assert.assertTrue(homePage.isLogoClickable(), "Logo is not clickable.");
    }
}
