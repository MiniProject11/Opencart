from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.edge.options import Options as EdgeOptions
from selenium import webdriver
from Resources import TestData


class BasicActions:
    """This class is the parent class for all the pages in our application."""
    """It contains all common elements and functionalities available to all pages."""

    def setBrowser(self, browser, headless=False):
        if browser.lower() == TestData.GOOGLE_CHROME:
            options = Options()
            options.headless = headless
            self.driver = webdriver.Chrome(TestData.CHROME_DRIVER_PATH, chrome_options=options)
        elif browser.lower() == TestData.MOZILLA_FIREFOX:
            self.driver = webdriver.Firefox(TestData.FIREFOX_DRIVER_PATH)
        elif browser.lower() == TestData.MICROSOFT_EDGE:
            options = EdgeOptions()
            if headless:
                options.use_chromium = True
                options.add_argument("headless")
                options.add_argument("disable-gpu")
            self.driver = webdriver.Edge(TestData.EDGE_DRIVER_PATH, options=options)
        else:
            raise Exception("Wrong Browser Selected")

    def open_page(self, url):
        self.driver.get(url)

    # this function performs click on web element whose locator is passed to it.
    def click(self, by_locator):
        WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).click()

    # this function asserts comparison of a web element's text with passed in text.
    def assert_element_text(self, by_locator, element_text):
        web_element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        assert web_element.text == element_text

    # this function performs text entry of the passed in text, in a web element whose locator is passed to it.
    def enter_text(self, by_locator, text):
        return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).send_keys(text)

    def clear_text(self, by_locator):
        return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).clear()

    # this function checks if the web element whose locator has been passed to it, is enabled or not and returns
    # web element if it is enabled.
    def is_enabled(self, by_locator):
        return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))

    # this function checks if the web element whose locator has been passed to it, is visible or not and returns
    # true or false depending upon its visibility.
    def is_visible(self, by_locator):
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        return bool(element)

    # this function moves the mouse pointer over a web element whose locator has been passed to it.
    def hover_to(self, by_locator):
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        ActionChains(self.driver).move_to_element(element).perform()