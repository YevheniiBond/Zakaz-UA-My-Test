package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public void goToZakaz() {
        driver.get("https://zakaz.ua/uk/");
    }


    public void goToAshan() {
        driver.get("https://auchan.zakaz.ua/uk/");
    }

    public void goToBeeMarket() {
        driver.get("https://pchelka.zakaz.ua/uk/");
    }

    @AfterMethod

    public void afterTest() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
