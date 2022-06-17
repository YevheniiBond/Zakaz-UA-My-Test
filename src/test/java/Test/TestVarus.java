package Test;

import PageObj.NovusHomePage;
import PageObj.VarusHomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestVarus extends TestInit{
    @Test
    public void orderingFoodFromVarus(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        VarusHomePage varusHomePage = new VarusHomePage(driver);
        NovusHomePage novusHomePage = new NovusHomePage(driver);
        Actions action = new Actions(driver);
        goToZakaz();
        varusHomePage.goToVarus().click();
        action.moveToElement(varusHomePage.alcohol()).perform();
        varusHomePage.jimBeam().click();
        varusHomePage.yesButton().click();
        varusHomePage.whiteJimBeam1L().click();
        varusHomePage.addToCartBtn().click();
        novusHomePage.selfDelivery().click();
        novusHomePage.addressSearchField().click();
        novusHomePage.chooseCityNumber2().click();
        novusHomePage.continueShopping().click();

    }
}
