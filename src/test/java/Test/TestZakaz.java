package Test;

import PageObj.HeaderView;
import PageObj.NovusHomePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestZakaz extends TestInit {
    @Test
    public  void orderFoodOnZakaz() {
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
       HeaderView headerView = new HeaderView(driver);
       NovusHomePage novusHomePage = new NovusHomePage(driver);
        goToZakaz();                                         //головна сторінка заказу

        headerView.clickOnUALanguage().click();              //зміна сайту на Українську мову
        headerView.onNovusBtn().click();                     //головна сторінка Новуса
        novusHomePage.choseAddressBtn().click();             //зміна адреси доставки
        novusHomePage.selfDelivery().click();                // вибір типу доставки
        novusHomePage.addressSearchField().click();          //клік на поле для вибору міста
        novusHomePage.chooseCityNumber2().click();           //вибір міста доставки Рівне
        novusHomePage.continueShopping().click();            //головна сторінка Новуса
        JavascriptExecutor js =  (JavascriptExecutor) driver;//скрол до потрібного товару
        js.executeScript("window.scrollBy(0,2000)");
        novusHomePage.onion().click();                      //вибір товару "капуста"
        novusHomePage.addButton().click();                    //додавання товару до кошика
        for (int i = 0; i < 11; i++){novusHomePage.addForCabbage().click();} //збільшення еквіваленту товару
        Assert.assertTrue(driver.getCurrentUrl().contains("https://novus.zakaz.ua/uk/"));
        afterTest();                                             //закрити браузер

}
}
