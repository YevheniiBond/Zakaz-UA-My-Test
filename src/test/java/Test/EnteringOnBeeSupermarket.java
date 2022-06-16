package Test;

import PageObj.HomePageBeeSupermarket;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnteringOnBeeSupermarket extends TestInit{

    @Test
    public void enteringOnBeeSupermarket(){
        HomePageBeeSupermarket homePageBeeSupermarket = new HomePageBeeSupermarket(driver);

        goToZakaz();
        goToBeeMarket();
        homePageBeeSupermarket.enterOnBeeSupermarket().click();
        homePageBeeSupermarket.enterButton().click();
        homePageBeeSupermarket.registrationButton().click();
        homePageBeeSupermarket.alreadyHaveButton().click();

        Assert.assertTrue(homePageBeeSupermarket.mailOrPhoneField().isDisplayed());
        homePageBeeSupermarket.mailOrPhoneField().click();
        homePageBeeSupermarket.mailOrPhoneField().sendKeys("+380665631180");

        homePageBeeSupermarket.passwordField().click();
        homePageBeeSupermarket.passwordField().sendKeys("11223344");
        homePageBeeSupermarket.passwordEyesClosedBtn().click();

        Assert.assertTrue(homePageBeeSupermarket.doneWithRegistration().isDisplayed());
        homePageBeeSupermarket.doneWithRegistration().click();




    }
}
