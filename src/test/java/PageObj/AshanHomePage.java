package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AshanHomePage extends BasePage {


    public AshanHomePage(WebDriver driver) {
        super(driver);
    }
    public static final String FRUIT_AND_VERITABLE = "//li[@title='Фрукти та овочі']";
    public static final String MUSHROOMS = "//li[contains(@title,'Гриби')]";
    public static final String FRESH_MUSHROOMS ="//span[text()='Свіжі']";
    public static final String CHEAP ="//button[@class='jsx-569623626 ContentSorter__control'][contains(text(),'Дешеві')]";
    public static final String FIRST_WAVE_FRESH_MUSHROOM = "//img[@alt='Печериці Перша хвиля свіжі 650г']";
    public static final String ADD_TO_CART ="(//span[@class='jsx-44091497 AddButton__text'][contains(text(),'Додати до кошика')])[2]";
    public static final String PICK_UP = "//li[contains(text(),'Самовивіз')]";
    public static final String REGION_SELECT_SEARCH_FIELD ="//div[@class='RegionSelect__control css-yk16xz-control']";
    public static final String LVIV = "//div[@class='RegionSelect__option css-yt9ioa-option'][contains(text(),'Львів')]";
    public static final String RETURN_TO_SHOPPING = "//button[text()='До покупок']";

    public WebElement fruitAndVegetable(){
        return getElementByXpath(FRUIT_AND_VERITABLE);
    }

    public WebElement mushrooms(){
        return getElementByXpath(MUSHROOMS);
    }

    public WebElement freshMushrooms(){
       return getElementByXpath(FRESH_MUSHROOMS);
    }

    public WebElement cheap(){
        return getElementByXpath(CHEAP);
    }

    public WebElement firstWaveFreshMushroom(){
        return getElementByXpath(FIRST_WAVE_FRESH_MUSHROOM);
    }

    public WebElement addToCart(){
        return getElementByXpath(ADD_TO_CART);
    }

    public WebElement pickUp(){
        return getElementByXpath(PICK_UP);
    }

    public WebElement regionSearchField(){
        return getElementByXpath(REGION_SELECT_SEARCH_FIELD);
    }

    public WebElement cityLviv(){
        return getElementByXpath(LVIV);
    }
    public WebElement returnToShopping(){
        return getElementByXpath(RETURN_TO_SHOPPING);
    }
}



