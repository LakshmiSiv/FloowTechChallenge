package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JourneyPage {

    public AndroidDriver driver;


    @FindBy(id = "com.thefloow.flo:id/journey_group")
    public static List<WebElement> journeysTable;

    public JourneyPage (AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
