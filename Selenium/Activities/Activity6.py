from selenium.webdriver.common.by import By
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    actions = ActionChains(driver)
    driver.get("https://www.training-support.net/selenium/input-events")

    print("Page title is: ", driver.title)

    actions.send_keys("H")
    actions.key_down(Keys.CONTROL)
    actions.send_keys("a")
    actions.send_keys("c")
    actions.send_keys("v")
    actions.key_up(Keys.CONTROL)
    actions.perform()

    #actions.send_keys("A").key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(Keys.CONTROL).perform()
