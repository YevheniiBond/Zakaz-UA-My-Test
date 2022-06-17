package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MansShoesItemPage extends BasePage {
    public MansShoesItemPage(WebDriver driver) {
        super(driver);
    }

    public  static final String  MANS_SHOES_BRANDS_LIST = "//li[@style='display: list-item;']";
    public static final  String  PAOUL_DANCE_BRAND = "//label[@id='lblbrand9']";
    public static final  String  SUPADANCE = "//label[@id='lblbrand11']";
    public static final  String  RAYROSE = "//label[@id='lblbrand10']";
    public static final  String  SHOES_SIZE = "//li[@class='sizelist'][@style='display: list-item;']";
    public static final  String  SIZE_125 = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblsize11')]";
    public static final  String  SIZE_115 = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblsize5')]";
    public static final  String  COLOR_LIST = "//li[@class='colorlist']";
    public static final  String  MAN_SHOES_BLACK = "//span[contains(@id,'color2')]";
    public static final  String  MAN_SHOES_SUPADANCE = "//span[text()='Supadance 8508-Black Patent/Suede']";
    public static final  String  CONFORM_SIZE = "//span[@id='valMsgSize']";
    public static final  String  FOOT_SIZE = "//div[@data-value='UK 10']";


    public WebElement mansShoesBrands(){
        return getElementByXpath(MANS_SHOES_BRANDS_LIST);
    }
    public WebElement paoulShoesBrand(){
        return getElementByXpath(PAOUL_DANCE_BRAND);
    }
    public WebElement supadanceShoesBrand(){
        return getElementByXpath(SUPADANCE);
    }
    public WebElement reyroseShoesBrand(){
        return getElementByXpath(RAYROSE);
    }
    public WebElement shoesSize(){
        return getElementByXpath(SHOES_SIZE);
    }
    public WebElement size125(){
        return getElementByXpath(SIZE_125);
    }
    public WebElement size115(){
        return getElementByXpath(SIZE_115);
    }
    public WebElement colorList(){
        return getElementByXpath(COLOR_LIST);
    }
    public WebElement manShoesBlack(){
        return getElementByXpath(MAN_SHOES_BLACK);
    }
    public WebElement shoesSupadance(){
        return getElementByXpath(MAN_SHOES_SUPADANCE);
    }
    public WebElement conformSize(){
        return getElementByXpath(CONFORM_SIZE);
    }
    public WebElement footSize(){
        return getElementByXpath(FOOT_SIZE);
    }

    public WebElement shoesModelNumber() { return getElementByXpath("//h1[@id='pname']");
    }

    public WebElement shoesPrice() { return getElementByXpath("//span[@class='price_first']");
    }

    public List<WebElement> listOfSize() {
        return getElementsByXpath("//span[@style='width: 42px;']");
    }

    public List<WebElement> getBtnsChecked() {
        return getElementsByXpath("//input[@checked]");
    }
}
