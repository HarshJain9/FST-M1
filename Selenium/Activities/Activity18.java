package activites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/selects");

        System.out.println("Title of the Page: " + driver.getTitle());

        WebElement selectElement = driver.findElement(By.id("multi-select"));

        Select multiselect = new Select(selectElement);

        multiselect.selectByVisibleText("Javascript");

        for (int i = 4; i < 6; i++) {
            multiselect.selectByIndex(i);
        }
        multiselect.selectByValue("node");
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        multiSelect.deselectByIndex(5);

        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        driver.quit();

    }}
