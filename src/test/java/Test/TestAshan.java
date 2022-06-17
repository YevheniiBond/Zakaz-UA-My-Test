package Test;

import PageObj.AshanHomePage;
import PageObj.HomePageBeeSupermarket;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAshan extends TestInit {
    @Test
    public void shoppingInAshan() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        AshanHomePage ashanHomePage = new AshanHomePage(driver);
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToAshan(); //перехід на головну сторінку Ашану
        action.moveToElement(ashanHomePage.fruitAndVegetable()).perform(); // розділ фрукти та овочі
        action.moveToElement(ashanHomePage.mushrooms()).perform(); // підрозділ гриби
        action.moveToElement(ashanHomePage.freshMushrooms()).perform(); //
        ashanHomePage.freshMushrooms().click();
        ashanHomePage.cheap().click();
        js.executeScript("window.scrollBy(0,300)");
        action.moveToElement(ashanHomePage.firstWaveFreshMushroom()).perform();
        ashanHomePage.firstWaveFreshMushroom().click();
        ashanHomePage.addToCart().click();
        ashanHomePage.pickUp().click();
        ashanHomePage.regionSearchField().click();
        ashanHomePage.cityLviv().click();
        ashanHomePage.returnToShopping().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://auchan.zakaz.ua/uk"));

        }

        @Test
    public void trainingTest(){
        driver.get("https://pchelka.zakaz.ua/uk/categories/meat-fish-poultry-pchelka/");

            HomePageBeeSupermarket homePageBeeSupermarket = new HomePageBeeSupermarket(driver);
            homePageBeeSupermarket.productItem().get(0).click();
            homePageBeeSupermarket.productChickenMeatItem().get(28).click();

            Assert.assertTrue(homePageBeeSupermarket.meatPrice().isDisplayed());
            Assert.assertTrue(homePageBeeSupermarket.addToCartBtn().isDisplayed());
        }
}
