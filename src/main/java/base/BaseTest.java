package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

   public WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless=new");  // modern headless mode
//        options.addArguments("--window-size=1920,1080"); // important!
        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
        driver.get("https://practice.qabrains.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }
}
