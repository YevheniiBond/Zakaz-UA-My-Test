package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageDanceShopper extends BasePage{

    public HomePageDanceShopper(WebDriver driver) {
        super(driver);}

        public static final String WOMEN = "//li[contains(text(),'Women')]";
        public static final String DANCE_WEAR_BALLROOM_SKIRTS = "//div[@class='item']//a[contains(text(),'Ballroom Skirt')]";
        public static final String MEN = "//ul[contains(@class,'navs')]//li[contains(text(),'Men')]";
        public static final String MENS_BALLROOM_SHOES = "//div[@class='item']//a[text()='Ballroom Dance Shoes']";

        public WebElement ballroomSkirts(){
            return getElementByXpath(DANCE_WEAR_BALLROOM_SKIRTS);
        }
        public WebElement goToWomanClothes() {
            return getElementByXpath(WOMEN);
        }
        public WebElement goToManClothes(){
            return getElementByXpath(MEN);
        }
        public WebElement mansBallroomShoes(){
            return getElementByXpath(MENS_BALLROOM_SHOES);
        }
}