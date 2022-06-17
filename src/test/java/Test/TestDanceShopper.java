package Test;

import PageObj.HomePageDanceShopper;
import PageObj.MansShoesItemPage;
import PageObj.WomanDressItemsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDanceShopper extends TestInit {


    @Test


    public void checkDressForDance(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        HomePageDanceShopper homePageDanceShopper = new HomePageDanceShopper(driver);
        WomanDressItemsPage womanDressItemsPage = new WomanDressItemsPage(driver);
        Actions action = new Actions(driver);

        driver.get("https://www.danceshopper.com/");
        homePageDanceShopper.goToWomanClothes().click();                   // Розділ для жінок
        homePageDanceShopper.ballroomSkirts().click();                     // Сукні для європейських танців
        action.moveToElement(womanDressItemsPage.brandList()).perform();   // Розділ з мультимедійною опцією для брендів 1/3
        womanDressItemsPage.forDSIBrand().click();                         // Вибір бренду DSI
        action.moveToElement(womanDressItemsPage.brandList()).perform();   // Додавання бренду 2/3
        womanDressItemsPage.forArmandoBrand().click();                     // Вибір бренду Armando
        action.moveToElement(womanDressItemsPage.brandList()).perform();   // Додавання бренду 3/3
        womanDressItemsPage.forEspenBrand().click();                       // Вибір бренду Espen
        action.moveToElement(womanDressItemsPage.sizeList()).perform();    // Розділ з мультимедійною опцією для розміру 1/3
        womanDressItemsPage.sizeM().click();                               // Розір М
        action.moveToElement(womanDressItemsPage.sizeList()).perform();    // Розділ з мультимедійною опцією для розміру 2/3
        womanDressItemsPage.sizeS().click();                               // Розмір S
        action.moveToElement(womanDressItemsPage.sizeList()).perform();    // Розділ з мультимедійною опцією для розміру 3/3
        womanDressItemsPage.sizeXS().click();                              // Розмір XS
        action.moveToElement(womanDressItemsPage.colorList()).perform();   // Розділ з мультимедійною опцією для кольору 1/3
        womanDressItemsPage.colorBlackAndWhite().click();                  // Чорно-білий прінт
        action.moveToElement(womanDressItemsPage.colorList()).perform();   // Розділ з мультимедійною опцією для розміру 2/3
        womanDressItemsPage.colorBlack().click();                          // Чорний
        action.moveToElement(womanDressItemsPage.colorList()).perform();   // Розділ з мультимедійною опцією для розміру 3/3
        womanDressItemsPage.colorAnimal().click();                         // Гепардовий прінт
        JavascriptExecutor js = (JavascriptExecutor) driver;               // Скрол з кординатами x,y до потрібного елементу
        js.executeScript("window.scrollTo(656,1979)");
        womanDressItemsPage.blackWhiteDress().click();                     // Чорно-біла сукня
        womanDressItemsPage.lastSizeOption().click();                      // Останнє уточнення по розміру
        womanDressItemsPage.sizeSmall().click();                           // Розмір-маленький


        Assert.assertTrue(womanDressItemsPage.thePriceOfDress().isDisplayed());
        Assert.assertTrue(womanDressItemsPage.theName().isDisplayed());
        Assert.assertTrue(womanDressItemsPage.addToCart().isDisplayed());
        womanDressItemsPage.addToCart().click();                           // Добавити в кошик
    }


@Test

   public void checkMansShoes(){
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    HomePageDanceShopper homePageDanceShopper = new HomePageDanceShopper(driver);
    MansShoesItemPage mansShoesItemPAge = new MansShoesItemPage(driver);
    WomanDressItemsPage womanDressItemsPage = new WomanDressItemsPage(driver);
    Actions action = new Actions(driver);


    driver.get("https://www.danceshopper.com/");                          // Головна сторінка сайту
    homePageDanceShopper.goToManClothes().click();                        // Розділ для чоловіків
    homePageDanceShopper.mansBallroomShoes().click();                     // Розділ чоловічого взуття для танців
    action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();  // Бренди взуття 1/3
    mansShoesItemPAge.reyroseShoesBrand().click();                        // Рей-Роуз бренд
    action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();  // Бренди взуття 2/3
    mansShoesItemPAge.supadanceShoesBrand().click();                      // Супаданс бренд
    action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();  // Бренди взуття 3/3
    mansShoesItemPAge.paoulShoesBrand().click();                          // Поул бренд
    action.moveToElement(mansShoesItemPAge.shoesSize()).perform();        // Розмір взуття 1/2
    mansShoesItemPAge.size115().click();                                  // 11,5
    action.moveToElement(mansShoesItemPAge.shoesSize()).perform();        // Розмір взуття 2/2
    mansShoesItemPAge.size125().click();                                  // 12,5
    action.moveToElement(mansShoesItemPAge.colorList()).perform();        // Колір
    mansShoesItemPAge.manShoesBlack().click();                            // Чорний
    mansShoesItemPAge.shoesSupadance().click();                           // Вибір товару - Супаданс бренд
    mansShoesItemPAge.conformSize().click();                              // Уточнення розміру
    mansShoesItemPAge.footSize().click();                                 // Підтвердження розміру

    Assert.assertTrue(mansShoesItemPAge.shoesModelNumber().isDisplayed());
    Assert.assertTrue(mansShoesItemPAge.shoesPrice().isDisplayed());
    womanDressItemsPage.addToCart().click();                              // Корзина


    }

}