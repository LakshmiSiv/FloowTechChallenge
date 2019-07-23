package CommonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import Utilities.ExcelUtils;
import Utilities.FilePaths;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FunctionLibrary {
	
	public static AndroidDriver driver;
	

		public static String getproperty(String key) throws IOException{
			
			FileInputStream fis = new FileInputStream(new File(FilePaths.ConfigFile));
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
			
		}
		
		// Action commands:
		public static void type(WebElement element, String value){
			element.sendKeys(value);
		}
		
		// click button, link, checkbox,radio,popup
		
		public static void click(WebElement element){
			element.click();
		}
		
		// clear data from edit field
		public static void clear(WebElement element){
			element.clear();
		}
		

		// Implicit wait:
		public static  void implicitwait(int seconds){
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
		
		//Explicit wait:
		public static void waitUntilElementVisible(WebElement element, int seconds){
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.4.2");
		capabilities.setCapability("deviceName","emulator-5544");
		capabilities.setCapability("platformName","Android");

		capabilities.setCapability("appPackage", "com.thefloow.flo");
		capabilities.setCapability("appActivity","com.thefloow.flo/");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        ExcelUtils.setExcelFile(FilePaths.Path_TestData + FilePaths.File_TestData, "sheet1");
	}
			
		
	
}
