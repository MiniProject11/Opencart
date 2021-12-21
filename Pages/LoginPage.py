from selenium.webdriver.common.by import By
from Resources import TestData, Locators
from Resources.BasicActions import BasicActions


class LoginPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def open(self):
        self.open_page(TestData.BASE_URL+TestData.LOGIN_URL)

    def close(self):
        self.driver.close()

    def setEmail(self, email):
        self.enter_text(Locators.EMAIL_TEXTBOX, email)

    def setPassword(self, password):
        self.enter_text(Locators.PASSWORD_TEXTBOX, password)

    def forgotPassword(self):
        self.open_page(TestData.BASE_URL+TestData.FORGOT_PASSWORD)

    def submit(self):
        self.click(Locators.LOGIN_BUTTON)