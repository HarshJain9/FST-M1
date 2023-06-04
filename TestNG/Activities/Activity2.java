package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;

@BeforeClass
public void beforeClass(){
    WebDriverManager.firefoxdriver().setup();

    driver = new FirefoxDriver();

    driver.get("https://www.training-support.net/selenium/target-practice");
}

@Test
    public void testCase1(){
    System.out.println("Title of the page: " + driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "Target Practice" );
}
@Test
    public void testCase2(){
    WebElement blackButton = driver.findElement(By.className("ui black button"));
    Assert.assertTrue(blackButton.isDisplayed());
    Assert.assertEquals(blackButton.getText(), "black");
}

@Test(enabled = false)
    public void testCase3(){
    String str = driver.findElement(By.className("content")).getText();
    System.out.println("Heading of the Page");

    }
@Test
public void testCase4(){
    throw new SkipException("Skipped the test case");
}

@AfterClass
    public void afterClass(){
    driver.quit();
    }

}
