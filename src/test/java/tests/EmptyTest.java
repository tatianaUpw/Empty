package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tatiana on 1/18/2016.
 */
public class EmptyTest {

    @Test
    public void Test()
    {
        WebDriver dr = new FirefoxDriver();
        dr.navigate().to("https://www.google.com/");
        Assert.assertTrue(dr.getTitle().contains("Google"));
        dr.close();
    }
}
