from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://www.training-support.net/selenium/javascript-alerts")

    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "prompt").click()

    prompt_alert = driver.switch_to.alert

    print(prompt_alert.text)

    prompt_alert.send_keys("Python")

    prompt_alert.accept()
