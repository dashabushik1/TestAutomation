package common;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {

    private static WebDriver driver = null;

    private CommonAction() {
    }

    ;

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "mac_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver"); // указываем драйвер и путь к нему
                    driver = new ChromeDriver();
                    break;
                default:
                    Assert.fail("Incorrent platform or browser name" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        }
        return driver;
    }
}
