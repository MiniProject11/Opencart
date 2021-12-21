from Resources.ObjectRepository import Locators
from Resources.TestData import TestData
from Pages.Base import BasePage


class RemoveItemFromCart(BasePage):
    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def remove_item_from_cart(self):
        self.click(Locators.SEARCH_MY_ACCOUNT_DROPDOWN)
        self.click(Locators.SEARCH_LOGIN_OPTION)
        self.enter_text(Locators.SEARCH_USERNAME_TEXTBOX, TestData.username)
        self.enter_text(Locators.SEARCH_PASSWORD_TEXTBOX, TestData.password)
        self.click(Locators.SEARCH_LOGIN_BUTTON)
        self.click(Locators.SEARCH_CART)
        self.click(Locators.SEARCH_REMOVE_ITEM)
