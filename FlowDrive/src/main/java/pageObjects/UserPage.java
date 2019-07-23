package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

    public AndroidDriver driver;

    @FindBy(id = "com.thefloow.flo:id/edit_text_first_name")
    public static WebElement fname;

    @FindBy(id = "com.thefloow.flo:id/edit_text_surname")
    public static WebElement lname;

    @FindBy(id = "com.thefloow.flo:id/edit_text_company_name")
    public static WebElement company;

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement email;

    @FindBy(id = "com.thefloow.flo:id/edit_text_postcode")
    public static WebElement postcode;

    @FindBy(id = "com.thefloow.flo:id/edit_text_date_of_birth")
    public static WebElement dateOfBirth;


    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement regpassword;

    @FindBy(id = "com.thefloow.flo:id/edit_text_confirm_password")
    public static WebElement confirmpassword;


    @FindBy(id = "com.thefloow.flo:id/button_register")
    public static WebElement submit;

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement username;

    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement password;

    public UserPage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
