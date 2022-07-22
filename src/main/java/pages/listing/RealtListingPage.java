package pages.listing;

import pages.base.BasePage;
import pages.realthome.RealtHomePage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing view-format']//div[@data-mode='3']");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));

        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards, 20);
        return this;
    }
}
