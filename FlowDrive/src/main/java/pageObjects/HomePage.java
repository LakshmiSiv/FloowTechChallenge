package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public AndroidDriver driver;

    @FindBy(id = "com.thefloow.flo:id/tab_journeys")
    public static WebElement journeysTab;

    @FindBy(id = "com.thefloow.flo:id/img_start_journey")
    public static WebElement startJourney;

    public HomePage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
