# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://training-support.net/selenium/login-form")

    print("Page title is: ", driver.title)

    driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")
    driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")

    driver.find_element(By.XPATH, "//button[@class='ui button']").click()

    message = driver.find_element(By.XPATH, "//div[@id='action-confirmation']")
    print("Login Message: ", message.text)

    driver.close()