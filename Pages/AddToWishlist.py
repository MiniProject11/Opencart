from Resources.ObjectRepository import Locators
from Resources.TestData import TestData
from Pages.Base import BasePage


class AddToWishlist(BasePage):
    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def add_to_wishlist(self):
        self.click(Locators.SEARCH_ADD_TO_WISHLIST)
        self.click(Locators.SEARCH_MUST_LOGIN)
        self.enter_text(Locators.SEARCH_USERNAME_TEXTBOX, TestData.username)
        self.enter_text(Locators.SEARCH_PASSWORD_TEXTBOX, TestData.password)
        self.click(Locators.SEARCH_LOGIN_BUTTON)
        self.click(Locators.SEARCH_WISHLIST)










