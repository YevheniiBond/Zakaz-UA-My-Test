package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageBeeSupermarket extends BasePage {

    public HomePageBeeSupermarket(WebDriver driver) {
        super(driver);
    }

    public static final String SING_IN = "//button[@data-marker='Sign in'][@class='jsx-3517655969 AccountNavigationDrop__infoMenuLink']";
    public static final String ENTER_BUTTON = "//li[@id='react-tabs-0']";
    public static final String REGISTRATION_BUTTON = "//li[@id='react-tabs-2']";
    public static final String ALREADY_HAVE_BUTTON = "//span[@class='jsx-401581773'][text()='У мене вже є акаунт']";
    public static final String MAIL_OR_PHONE_FIELD = "//input[@name='login']";
    public static final String PASSWORD_FIELD = "//input[@name='password']";
    public static final String PASSWORD_EYES_CLOSED_BTN = "//button[@class='jsx-3839457635 InputPassword__icon btn btn-not-accented icon-eye-close']";
    public static final String DONE = "//button[@type='submit']";
    public static final String ACCOUNT_BUTTON = "//span[text()='Акаунт']";
    public static final String SAUSAGE = "//span[@class='jsx-4277898529 CategoryCard__label']";



    public WebElement enterOnBeeSupermarket() {
        return getElementByXpath(SING_IN);
    }

    public WebElement enterButton() {
        return getElementByXpath(ENTER_BUTTON);
    }

    public WebElement registrationButton() {
        return getElementByXpath(REGISTRATION_BUTTON);
    }

    public WebElement alreadyHaveButton() {
        return getElementByXpath(ALREADY_HAVE_BUTTON);
    }

    public WebElement mailOrPhoneField() {
        return getElementByXpath(MAIL_OR_PHONE_FIELD);
    }

    public WebElement passwordField() {
        return getElementByXpath(PASSWORD_FIELD);
    }

    public WebElement passwordEyesClosedBtn() {
        return getElementByXpath(PASSWORD_EYES_CLOSED_BTN);
    }

    public WebElement doneWithRegistration() {
        return getElementByXpath(DONE);
    }

    public WebElement accountButton() {
        return getElementByXpath(ACCOUNT_BUTTON);
    }

    public List<WebElement> productItem() {
        return getElementsByXpath("//span[@class='jsx-4277898529 CategoryCard__label']");
    }

    public List<WebElement> productChickenMeatItem() {
        return getElementsByXpath("//div[@class='jsx-1433147593 ProductsBox__listItem']");
    }

    public WebElement meatPrice() {
        return getElementByXpath("//span[@class='jsx-2436886603 Price__value_title']");
    }

    public WebElement addToCartBtn() {
        return getElementByXpath("//div[@class='jsx-1423358880 BigProductCardTopInfo__addToCartButtons']");
    }


    // public WebElement sausageType(){return getElementByXpath(SAUSAGE);}

}
