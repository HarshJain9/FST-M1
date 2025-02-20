from telnetlib import EC

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)

    driver.get("https://www.training-support.net/selenium/tab-opener")

    print("Page title is: ", driver.title)

    print("Current window handle: ", driver.current_window_handle)

    driver.find_element(By.ID, "launcher").click()

    wait.until(EC.number_of_windows_to_be(2))

    print("All window handles: ", driver.window_handles)

    driver.switch_to.window(driver.window_handles[1])

    print("Current window handle: ", driver.current_window_handle)

    print("New Tab title: ", driver.title)

    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)

    driver.find_element(By.ID, "actionButton").click()
    # Wait for new tab/window to open
    wait.until(EC.number_of_windows_to_be(3))

    print("All window handles: ", driver.window_handles)

    driver.switch_to.window(driver.window_handles[2])

    # Print the handle of the currently active tab/window
    print("Current window handle: ", driver.current_window_handle)
    # Print the new tab/window title
    print("New Tab title: ", driver.title)
    # Print the new tab/window heading
    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)
