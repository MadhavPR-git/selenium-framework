package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    By registrationLink = By.xpath("//li[@id='registration']");


    public void registraion(){
        driver.findElement(registrationLink).click();
    }
}
