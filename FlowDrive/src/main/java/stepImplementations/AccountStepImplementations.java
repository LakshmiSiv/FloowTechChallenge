package stepImplementations;

import CommonFunctions.FunctionLibrary;
import Utilities.ExcelUtils;
import com.github.javafaker.Faker;
import cucumber.api.DataTable;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.UserPage;

import java.util.List;

public class AccountStepImplementations extends FunctionLibrary {

    UserPage userPage = new UserPage(driver);
    HomePage homePage = new HomePage(driver);

    Faker faker = new Faker();


    public void i_launch_app()  {
        Assert.assertEquals(true, UserPage.email.isDisplayed());

    }

    public void i_provide_data(DataTable userData) {

        List<List<String>> regData = userData.raw();
        UserPage.fname.sendKeys(regData.get(1).get(1));
        UserPage.lname.sendKeys(regData.get(1).get(2));
        UserPage.email.sendKeys(regData.get(1).get(3));
        UserPage.dateOfBirth.sendKeys(regData.get(1).get(4));
        UserPage.regpassword.sendKeys(regData.get(1).get(7));
        UserPage.confirmpassword.sendKeys(regData.get(1).get(8));
        UserPage.company.sendKeys(regData.get(1).get(5));
        UserPage.postcode.sendKeys(regData.get(1).get(6));
    }

    public void i_should_register()  {
        UserPage.submit.click();
    }


    public void i_enter_valid_username() throws Exception {

        String username =  ExcelUtils.getCellData(1,0);
        UserPage.username.sendKeys(username);
    }

    public void i_enter_password() throws Exception {
        String password =  ExcelUtils.getCellData(1,1);
        UserPage.username.sendKeys(password);
    }

    public void i_should_login()  {
        Assert.assertEquals(true, HomePage.startJourney.isDisplayed());
    }

    public void i_gets_redirected_to_home_screen()  {
        Assert.assertEquals(true, HomePage.startJourney.isDisplayed());

    }


}
