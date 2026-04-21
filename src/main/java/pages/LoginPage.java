package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.ElemUtils;

public class LoginPage {

    WebDriver driver;
    ElemUtils utils;


    By username = By.id("email");
    By password = By.id("password");
    By submit   = By.xpath("//button[@type='submit']");
    By loginSuccess = By.xpath("//h2[text()='Login Successful']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        utils = new ElemUtils(driver);
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);

    }

    public void enterPassword(String pass) {

        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
//        ((JavascriptExecutor) driver)
//                .executeScript("arguments[0].scrollIntoView(true);", submit);
        driver.findElement(submit).click();
//        utils.click(submit);
     }

     public void verifyLogin(){
        driver.findElement(loginSuccess);
     }

}
