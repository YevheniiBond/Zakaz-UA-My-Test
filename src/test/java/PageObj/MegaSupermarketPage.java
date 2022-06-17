package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MegaSupermarketPage extends BasePage {
    public MegaSupermarketPage(WebDriver driver) {
        super(driver);


    }


    public List<WebElement> listOFProductCategory() {
        return getElementsByXpath("//span[@class='jsx-2586120802 CategoriesMenuListItem__title']");
    }

    public List<WebElement> listOfDishesKinds() {
        return getElementsByXpath("//div[@class='jsx-3762238971 CategoriesBox__listItem']");
    }

    public List<WebElement> listOfDishes() {
        return getElementsByXpath("//div[@class='jsx-1433147593 ProductsBox__listItem']"
        );
    }

    public WebElement moveToCart() {
        return getElementByXpath("//div[@class='jsx-1423358880 BigProductCardTopInfo__addToCartButtons']");
    }

    public WebElement dishName() {
        return getElementByXpath("//h1[@class='jsx-1423358880 BigProductCardTopInfo__title']");
    }

    public WebElement dishPrice() {
        return getElementByXpath("//span[@class='jsx-2436886603 Price__value_title']");
    }

    public List<WebElement> listOfMeat() {
        return getElementsByXpath("//span[@class='jsx-4277898529 CategoryCard__inner']");
    }

    public List<WebElement> clickSectionFish() {
        return getElementsByXpath("//span[@class='jsx-4277898529']");
    }


    public List<WebElement> itemFish() {
        return getElementsByXpath("//div[@class='jsx-1433147593 ProductsBox__listItem']");
    }
}
