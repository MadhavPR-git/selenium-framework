package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElemUtils;

public class HomePage {


    WebDriver driver;
    ElemUtils utils;

    By homeAnchor = By.xpath("//a[text()='Home']");
    By homeHeader = By.xpath("//*[@id='sidebar']/following-sibling::div[@id='main-body']/descendant::h1");

    public HomePage(WebDriver driver){
        this.driver = driver;
        utils = new ElemUtils(driver);
    }
    
    public void clickOnHomeAnchor() {
    	driver.findElement(homeAnchor).click();
    	
    }
    
    public String homeHeadertext() {
    	return driver.findElement(homeHeader).getText();
    }


}
