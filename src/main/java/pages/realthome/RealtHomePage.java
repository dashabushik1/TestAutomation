package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By twoRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By clickOpen = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRoom() {    // резиновый паттерн
        driver.findElement(countRooms).click();
        driver.findElement(twoRooms).click();
        return this;
    }

    public RealtHomePage clickToFind() {
        driver.findElement(clickOpen).click();
        return this;
    }
}
