package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomanDressItemsPage extends BasePage{
    public WomanDressItemsPage(WebDriver driver) {
        super(driver);}

    public  static final String BRANDS_LIST = "//li[@style='display: list-item;']";
    public static final  String FOR_ARMANDO_BRAND = "//span[@class='ng-scope']//label[@id='lblDbrand0']";
    public static final String FOR_ESPEN_BRAND = "//label[@id='lblDbrand5']";
    public static final String FOR_DSI_BRAND = "//label[@id='lblDbrand2']";
    public static final String SIZE_LIST = "//li[@class='Dsizelist'][@style='display: list-item;']";
    public static final String SIZE_S = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblDsize2')]";
    public static final String SIZE_XS = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblDsize1')]";
    public static final String SIZE_M = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblDsize3')]";
    public static final String COLOR_LIST ="//li[@class='Dancolorlist']";
    public static final String BLACK_AND_WHITE = "//span[contains(@id,'Dancolor3')]";
    public static final String BLACK = "//span[contains(@id,'Dancolor9')]";
    public static final String ANIMAL = "//span[contains(@id,'Dancolor1')]";
    public static final String BW_DRESS = "//span[text()='Espen Sheel Ballroom Skirt ES18L1-Print']";
    public static final String ADD_TO_CART = "//div[@class='ships_a']";
    public static final String LAST_SIZE_OPTION = "//span[@id='valMsgSize']";
    public static final String SMALL = "//div[text()='Small']";


    public WebElement brandList(){
        return getElementByXpath(BRANDS_LIST);
    }
    public WebElement forArmandoBrand(){
        return getElementByXpath(FOR_ARMANDO_BRAND);
    }
    public WebElement forEspenBrand(){
        return getElementByXpath(FOR_ESPEN_BRAND);
    }
    public WebElement forDSIBrand(){
        return getElementByXpath(FOR_DSI_BRAND);
    }
    public WebElement sizeList(){
        return getElementByXpath(SIZE_LIST);
    }
    public WebElement sizeS(){
        return getElementByXpath(SIZE_S);
    }
    public WebElement sizeXS(){
        return getElementByXpath(SIZE_XS);
    }
    public WebElement sizeM(){
        return getElementByXpath(SIZE_M);
    }
    public WebElement colorList(){
        return getElementByXpath(COLOR_LIST);
    }
    public WebElement colorBlackAndWhite(){
        return getElementByXpath(BLACK_AND_WHITE);
    }

    public WebElement colorBlack(){
        return getElementByXpath(BLACK);
    }
    public WebElement colorAnimal(){
        return getElementByXpath(ANIMAL);
    }
    public WebElement blackWhiteDress(){
        return getElementByXpath(BW_DRESS);
    }
    public WebElement addToCart(){
        return getElementByXpath(ADD_TO_CART);
    }
    public WebElement lastSizeOption(){
        return getElementByXpath(LAST_SIZE_OPTION);
    }
    public WebElement sizeSmall(){
        return getElementByXpath(SMALL);
    }

    public WebElement thePriceOfDress() {return getElementByXpath("//span[@class='price_first']");
    }

    public WebElement theName() { return getElementByXpath("//h1[@id='pname']");
    }
}
