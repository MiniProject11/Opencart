import unittest
from HTMLTestRunner import HTMLTestRunner
from selenium import webdriver
from Resources.ObjectRepository import Locators
from Resources.TestData import TestData
from Pages.AddToCart import AddToCart
from Pages.LogoutAndCheckAgain import LogoutAndCheckAgain
from Pages.RemoveItemFromCart import RemoveItemFromCart
from Pages.HomePage import HomePage


# Base Class for the tests
class TestOpencartCartFunctionalityBase(unittest.TestCase):

    def setUp(self):
        try:
            self.driver = webdriver.Chrome(TestData.CHROME_EXECUTABLE_PATH)
        except IOError:
            self.driver = webdriver.Chrome(TestData.EDGE_EXECUTABLE_PATH)
        # browser should be loaded in maximized window
        self.driver.maximize_window()

    def tearDown(self):
        # To do the cleanup after test has executed.
        self.driver.close()
        self.driver.quit()


# Test Class containing all tests
class TestOpencartCartFunctionality(TestOpencartCartFunctionalityBase):
    def setUp(self):
        super().setUp()

    def test_home_page_loaded_successfully(self):
        # instantiate an object of HomePage class. Remember when the constructor of HomePage class is called
        # it opens up the browser and navigates to Home Page of the site under test.
        self.homePage = HomePage(self.driver)
        # assert if the title of Home Page contains Amazon.in
        self.assertIn(TestData.HOME_PAGE_TITLE, self.homePage.driver.title)

    def test_add_to_cart_successful(self):
        self.AddCart = AddToCart(self.driver)
        self.AddCart.add_to_cart()
        message = " Success: You have added to Cart "
        self.assertIsNone(self.AddCart.assert_success_text(Locators.ADDED_TO_CART_SUCCESS_TEXT, message))

    def test_logout_and_check_cart_successful(self):
        self.LogoutCheck = LogoutAndCheckAgain(self.driver)
        self.LogoutCheck.logout_and_check_again()
        expected_title = "MacBook"
        self.assertIsNone(self.LogoutCheck.assert_image_title(Locators.TITLE_IMAGE_LOGOUT_CART, expected_title))

    def test_remove_item_from_cart_successful(self):
        self.RemoveItem = RemoveItemFromCart(self.driver)
        self.RemoveItem.remove_item_from_cart()
        self.assertIsNone(self.RemoveItem.assert_success_element(Locators.REMOVE_SUCCESS_ELEMENT))


if __name__ == '__main__':
    # specify path where the HTML reports for testcase execution are to be generated
    unittest.main(testRunner=HTMLTestRunner(output='../Reports'))
