package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderView extends BasePage {

    public HeaderView(WebDriver driver){
        super(driver);
    }

    public static final String  UKR_LANGUAGE = "//span[contains(text(), 'Ukr')]";
    public static final String NOVUS = "//a[@href='https://novus.zakaz.ua/uk/']";




    public WebElement onNovusBtn(){return driver.findElement(By.xpath(NOVUS));}
    public WebElement clickOnUALanguage(){return driver.findElement(By.xpath(UKR_LANGUAGE));}

}
