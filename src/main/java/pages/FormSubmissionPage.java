package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSubmissionPage {

    WebDriver driver;

    By formSubmissionLink = By.xpath("//li[@id='form-submission']");

    public FormSubmissionPage(WebDriver driver){
        this.driver = driver;
    }


    public void formSubmission(){
        driver.findElement(formSubmissionLink).click();
    }


}
