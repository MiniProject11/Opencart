import unittest
from HTMLTestRunner import HTMLTestRunner
from selenium import webdriver
from Resources.ObjectRepository import Locators
from Resources.TestData import TestData
from Pages.AddToWishlist import AddToWishlist
from Pages.HomePage import HomePage
from Pages.MoveFromWishlistToCart import MoveFromWishlistToCart
from Pages.RemoveFromWishlist import RemoveFromWishlist


# Base Class for the tests
class TestOpencartWishlistFunctionalityBase(unittest.TestCase):

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
class TestOpencartWishlistFunctionality(TestOpencartWishlistFunctionalityBase):
    def setUp(self):
        super().setUp()

    def test_home_page_loaded_successfully(self):
        # instantiate an object of HomePage class. Remember when the constructor of HomePage class is called
        # it opens up the browser and navigates to Home Page of the site under test.
        self.homePage = HomePage(self.driver)
        # assert if the title of Home Page contains Amazon.in
        self.assertIn(TestData.HOME_PAGE_TITLE, self.homePage.driver.title)

    def test_added_to_wishlist_successfully(self):
        self.AddWishlist = AddToWishlist(self.driver)
        self.AddWishlist.add_to_wishlist()
        expected_title = "MacBook"
        self.assertIsNone(self.AddWishlist.assert_image_title(Locators.TITLE_IMAGE_IN_WISHLIST, expected_title))

    def test_move_item_from_wishlist_successful(self):
        self.MoveFromWishlist = MoveFromWishlistToCart(self.driver)
        self.MoveFromWishlist.move_from_wishlist_to_cart()
        self.assertIsNone(self.MoveFromWishlist.assert_success_element(Locators.SUCCESS_MOVED_TO_CART))

    def test_remove_item_from_wishlist_successful(self):
        self.RmFromWishlist = RemoveFromWishlist(self.driver)
        self.RmFromWishlist.remove_from_wishlist()
        self.assertIsNone(self.RmFromWishlist.assert_success_element(Locators.SUCCESS_REMOVE_FROM_WISHLIST))


if __name__ == '__main__':
    # specify path where the HTML reports for testcase execution are to be generated
    unittest.main(testRunner=HTMLTestRunner(output='C:\\Users\\saumya_purohit\\PycharmProjects\\Opencart\\Reports'))
