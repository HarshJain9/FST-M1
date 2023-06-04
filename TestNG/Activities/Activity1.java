package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.firefoxdriver().setup();

       driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void testcase(){
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        Assert.assertEquals(title, "Training Support" );
        driver.findElement(By.id("about-link")).click();
        System.out.println("New page title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About US");

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
