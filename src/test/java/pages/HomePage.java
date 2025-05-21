package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    //Search Logo by XPATH
    private By logoLocator = By.xpath("//*[@id=\"container-bca776d573\"]/div[1]/div[2]/div[1]/div[1]/a/img");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogo() {
        return driver.findElement(logoLocator);
    }

    public boolean isLogoDisplayed() {
        return getLogo().isDisplayed();
    }

    public boolean isLogoClickable() {
        WebElement logo = getLogo();
        return logo.isEnabled();

    }
}
