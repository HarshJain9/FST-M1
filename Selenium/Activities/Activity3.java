package activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/login-form");
        System.out.println("Page Title: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        driver.findElement(By.xpath("//input[@class = 'ui button']")).click();

        String message = driver.findElement(By.xpath("//input[@id='action-confirmation']")).getText();
        System.out.println("Confirmation Page: " + message);

        driver.close();
    }
}
