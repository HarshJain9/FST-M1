from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://training-support.net/selenium/dynamic-controls")

    wait = WebDriverWait(driver, 10)

    # Print the title of the page
    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.ID, "dynamicCheckbox")

    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")

    checkbox_toggle.click()
    print("Checkbox hidden")

    wait.until(expected_conditions.invisibility_of_element(checkbox))

    checkbox_toggle.click()
    print("Checkbox visible")

    checkbox.click()
    print("Checkbox selected")
