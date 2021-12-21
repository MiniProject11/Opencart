from Resources import Locators
from Resources.BasicActions import BasicActions


class ForgotPasswordPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def setEmail(self, email):
        self.enter_text(Locators.EMAIL_TEXTBOX, email)

    def clickContinueButton(self):
        self.click(Locators.CONTINUE_BUTTON)