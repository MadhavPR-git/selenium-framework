package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException{
        LoginPage login = new LoginPage(driver);

        login.enterUsername("qa_testers@qabrains.com");
        Thread.sleep(4000);
        login.enterPassword("Password123");
        Thread.sleep(4000);
        login.clickLogin();
        Thread.sleep(10000);
        login.verifyLogin();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Practice"));
    }

}
