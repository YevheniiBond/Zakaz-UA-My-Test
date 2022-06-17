package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusHomePage extends BasePage {

    public VarusHomePage(WebDriver driver) {
        super(driver);
    }

    public static final String GET_VARUS = "//a[@href='https://varus.zakaz.ua/uk/']";
    public static final String ALCOHOL = "//span[text()='Алкоголь']";
    public static final String JIM_BEAM = "//span[contains(text(),'TM Jim Beam')]";
    public static final String YES_BUTTON = "//button[text()='Так, мені 18+']";
    public static final String WHITE_JIM_1L = "//span[text()='Віскі Jim Beam White 40% 1л']";
    public static final String ADD_TO_CART_BTN = "(//span[text()='Додати до кошика'])[2]";


    public WebElement goToVarus() {
        return getElementByXpath(GET_VARUS);
    }

    public WebElement alcohol() {
        return getElementByXpath(ALCOHOL);
    }

    public WebElement jimBeam() {
        return getElementByXpath(JIM_BEAM);
    }

    public WebElement yesButton() {
        return getElementByXpath(YES_BUTTON);
    }

    public WebElement whiteJimBeam1L() {
        return getElementByXpath(WHITE_JIM_1L);
    }

    public WebElement addToCartBtn() {
        return getElementByXpath(ADD_TO_CART_BTN);
    }

}
