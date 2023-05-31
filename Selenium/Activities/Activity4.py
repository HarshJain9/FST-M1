# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://training-support.net/selenium/target-practice")

    print("Page title is: ", driver.title)

    third = driver.find_element(By.XPATH, "//h3[@id='third-header']")
    print("Third Header; ", third.text)

    fifth_header = driver.find_element(By.XPATH, "//h5")
    print("Fifth Header color: ", fifth_header.value_of_css_property("color"))

    violet = driver.find_element(By.CLASS_NAME, "violet")
    print("Class of Violet color: ", violet.get_attribute("class"))

    grey = driver.find_element(By.CLASS_NAME, "grey")
    print("Text of grey button: ", grey.text)

    driver.close()
