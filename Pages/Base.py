from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains


class BasePage:
    """This class is the parent class for all the pages in our application."""
    """It contains all common elements and functionalities available to all pages."""

    # this function is called every time a new object of the base class is created.
    def __init__(self, driver):
        self.driver = driver

    # this function performs click on web element whose locator is passed to it.
    def click(self, by_locator):
        WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).click()

    # this function asserts comparison of a web element's text with passed in text.
    def assert_element_text(self, by_locator, element_text):
        web_element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        assert web_element.get_attribute('innerHTML') == element_text

    def assert_image_title(self, by_locator1, expected_title):
        expected_img_nm = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator1))
        assert expected_img_nm.get_attribute('title') == expected_title

    def assert_success_text(self, by_locator, success_text):
        if WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)):
            original_txt = success_text
        assert original_txt == success_text

    def assert_success_element(self, by_locator):
        assert WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))

    def not_equal_assert_image_title(self, by_locator1, by_locator2):
        expected_img_nm = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator1))
        img_nm = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator2))
        assert expected_img_nm.get_attribute('title') != img_nm.get_attribute('title')

    def equal_assert_image_title(self, by_locator1, by_locator2):
        expected_img_nm = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator1))
        img_nm = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator2))
        assert expected_img_nm.get_attribute('title') == img_nm.get_attribute('title')

    # this function performs text entry of the passed in text, in a web element whose locator is passed to it.
    def enter_text(self, by_locator, text):
        return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).send_keys(text)

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