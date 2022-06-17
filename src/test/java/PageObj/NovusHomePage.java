package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovusHomePage extends BasePage {

    public NovusHomePage(WebDriver driver) {
        super(driver);
    }

    public static final String ADD_BUTTON = "(//button[@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth'])[2]";
    public static final String CABBAGE = "//span[contains(@class, 'sx-1363104996 ProductTile__title')][contains(text(),'Капуста молода')]";
    public static final String CONTINUE_SHOPPING = "//button[text()='До покупок']";
    public static final String CHOOSE_CITY = "//div[@id='react-select-3-option-1']";
    public static final String ADDRESS_SEARCH = "//div[@class='RegionSelect css-2b097c-container']";
    public static final String DELIVERY = "//li[contains(text(),'Самовивіз')]";
    public static final String ADDRESS = "//span[contains(text(),'Оберіть адресу')]";
    public static final String ADD_FOR_CABBAGE = "(//button[@class='jsx-1927703298 QuantityBox__button QuantityBox__button_plus'])[3]";
    public static final String ONION = "//span[text()='Цибуля']";


    public WebElement addButton() {
        return getElementByXpath(ADD_BUTTON);
    }

    public WebElement cabbage() {
        return getElementByXpath(CABBAGE);
    }

    public WebElement addForCabbage() {
        return getElementByXpath(ADD_FOR_CABBAGE);
    }

    public WebElement continueShopping() {
        return getElementByXpath(CONTINUE_SHOPPING);
    }

    public WebElement chooseCityNumber2() {
        return getElementByXpath(CHOOSE_CITY);
    }

    public WebElement addressSearchField() {
        return getElementByXpath(ADDRESS_SEARCH);
    }

    public WebElement selfDelivery() {
        return getElementByXpath(DELIVERY);
    }

    public WebElement choseAddressBtn() {
        return getElementByXpath(ADDRESS);
    }

    public WebElement onion() {
        return getElementByXpath(ONION);
    }



}
