package activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity19 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("Home page title: " + driver.getTitle());


        driver.findElement(By.id("confirm")).click();


        Alert confirmAlert = driver.switchTo().alert();


        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);


        confirmAlert.accept();

        driver.quit();
    }
}