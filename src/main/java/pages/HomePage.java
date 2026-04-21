package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElemUtils;

public class HomePage {


    WebDriver driver;
    ElemUtils utils;

    By homeAnchor = By.xpath("//a[text()='Home']");


    public HomePage(WebDriver driver){
        this.driver = driver;
        utils = new ElemUtils(driver);
    }


}
