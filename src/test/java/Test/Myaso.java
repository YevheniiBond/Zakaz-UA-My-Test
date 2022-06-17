package Test;

import PageObj.HomePageBeeSupermarket;
import PageObj.MegaSupermarketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myaso extends TestInit {
    @Test
    public void myaso() {
        MegaSupermarketPage megaSupermarketPage = new MegaSupermarketPage(driver);
        driver.get("https://megamarket.zakaz.ua/uk/categories/meat-fish-poultry-megamarket/");
        megaSupermarketPage.listOfMeat().get(3).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("meat"));
    }

    @Test

    public void CheckSectionFish() {
        MegaSupermarketPage megaSupermarketPage = new MegaSupermarketPage(driver);
        driver.get("https://megamarket.zakaz.ua/uk/categories/meat-fish-poultry-megamarket/");
        megaSupermarketPage.clickSectionFish().get(7).click();
        megaSupermarketPage.itemFish().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("oseledets-norven"));
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