from Resources.ObjectRepository import Locators
from Resources.TestData import TestData
from Pages.Base import BasePage


class AddToCart(BasePage):
    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def add_to_cart(self):
        self.click(Locators.SEARCH_ADD_TO_CART)