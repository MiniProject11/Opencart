from Resources.BasicActions import BasicActions
from Resources import TestData
from Resources import Locators


class AccountPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def open(self):
        self.open_page(TestData.BASE_URL+TestData.ACCOUNT_PAGE)

    def close(self):
        self.driver.close()

    def editAccountInformation(self):
        self.click(Locators.EDIT_ACCOUNT_INFORMATION)

    def changePassword(self):
        self.click(Locators.CHANGE_PASSWORD)

    def modifyAdrressBook(self):
        self.click(Locators.MODIFY_ADDRESS_BOOK)