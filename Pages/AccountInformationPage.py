from Resources.BasicActions import BasicActions
from Resources import TestData
from Resources import Locators


class AccountInformationPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def setFirstName(self, name):
        self.clear_text(Locators.FIRST_NAME_TEXTBOX)
        self.enter_text(Locators.FIRST_NAME_TEXTBOX, name)

    def setLastName(self, name):
        self.clear_text(Locators.LAST_NAME_TEXTBOX)
        self.enter_text(Locators.LAST_NAME_TEXTBOX, name)

    def setEmail(self, email):
        self.clear_text(Locators.EMAIL_TEXTBOX)
        self.enter_text(Locators.EMAIL_TEXTBOX, email)

    def setTelephoneNumber(self, number):
        self.clear_text(Locators.TELEPHONE_TEXTBOX)
        self.enter_text(Locators.TELEPHONE_TEXTBOX, number)

    def submit(self):
        self.click(Locators.CONTINUE_BUTTON)

    def back(self, name):
        self.click(Locators.BACK_BUTTON)