package Test;

import PageObj.MegaSupermarketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExersicesForListOfElements extends TestInit {
    @Test

    public void listOfElementOnEKO(){
        MegaSupermarketPage megaSupermarketPage = new MegaSupermarketPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://megamarket.zakaz.ua/uk/");
        megaSupermarketPage.listOFProductCategory().get(5).click();
        megaSupermarketPage.listOfDishesKinds().get(2).click();
        megaSupermarketPage.listOfDishes().get(28).click();

        Assert.assertTrue(megaSupermarketPage.dishName().isDisplayed());
        Assert.assertTrue(megaSupermarketPage.dishPrice().isDisplayed());
        megaSupermarketPage.moveToCart().click();
    }
}
