package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTest extends BaseTest {

	@Test(enabled = false)
    public void homeTest(){

    	HomePage home = new HomePage(driver);
    	home.clickOnHomeAnchor();
    	Assert.assertEquals(home.homeHeadertext(), "QA Practice Site"); 
    }
}
