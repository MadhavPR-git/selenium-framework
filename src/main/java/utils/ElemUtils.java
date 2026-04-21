package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElemUtils {

    WebDriver driver;
    WebDriverWait wait;

    public ElemUtils(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void click(By locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

}