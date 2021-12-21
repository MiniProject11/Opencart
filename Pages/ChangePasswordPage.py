from Resources.BasicActions import BasicActions
from Resources import TestData
from Resources import Locators


class ChangePasswordPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def setPassword(self, password):
        self.enter_text(Locators.PASSWORD_TEXTBOX, password)

    def setConfirmPassword(self, password):
        self.enter_text(Locators.CONFIRM_PASSWORD_TEXTBOX, password)

    def clickContinueButton(self):
        self.click(Locators.CONTINUE_BUTTON)