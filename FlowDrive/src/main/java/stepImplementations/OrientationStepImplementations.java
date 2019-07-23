package stepImplementations;

import CommonFunctions.FunctionLibrary;
import org.junit.Assert;
import pageObjects.HomePage;

import java.io.IOException;

public class OrientationStepImplementations extends FunctionLibrary {

    HomePage homePage = new HomePage(driver);

    public void i_m_on_home_screen()  {

        Assert.assertEquals(true, HomePage.startJourney.isDisplayed());
    }

    public void i_rotate_my_phone_to_landscape_mode()  throws Exception  {

        driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
        Thread.sleep(5000);

    }

    public void i_should_still_be_able_to_use_app() throws IOException{

        String expectedOrientation = getproperty("allowedOrientation");
        Assert.assertEquals(expectedOrientation, driver.getOrientation());
    }
}
