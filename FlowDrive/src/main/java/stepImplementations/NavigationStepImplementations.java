package stepImplementations;

import CommonFunctions.FunctionLibrary;
import Utilities.ExcelUtils;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.JourneyPage;
import pageObjects.UserPage;



public class NavigationStepImplementations extends FunctionLibrary {

    HomePage homePage = new HomePage(driver);
    JourneyPage journeyPage = new JourneyPage(driver);
    UserPage userPage = new UserPage(driver);

    static String journeyData;



    public void i_choose_journeys_option()  {
        HomePage.journeysTab.click();
    }

    public void i_should_see_recorded_data()  {


        Assert.assertEquals(true, JourneyPage.journeysTable.size());

    }

    public void i_m_on_Journeys_screen() {
        Assert.assertEquals(true, JourneyPage.journeysTable.size());

    }

    public void i_get_the_existing_record()  {
       journeyData =  JourneyPage.journeysTable.get(0).toString();
    }

    public void i_unistall_the_app()  {
      driver.removeApp("com.thefloow.flo");
    }

    public void i_re_install_the_app() throws Exception  {
      setUp();
    }

    public void i_enter_valid_username() throws Exception {

        String username =  ExcelUtils.getCellData(1,0);
        UserPage.username.sendKeys(username);
    }

    public void i_enter_password() throws Exception {
        String password =  ExcelUtils.getCellData(1,1);
        UserPage.username.sendKeys(password);
    }

    public void i_navigate_to_the_journeys_screen() {
      HomePage.journeysTab.click();
    }

    public void i_should_see_the_previously_recorded_data() {
      String actualJourneyData = JourneyPage.journeysTable.get(0).toString();
      Assert.assertEquals(journeyData, actualJourneyData);
    }
}
