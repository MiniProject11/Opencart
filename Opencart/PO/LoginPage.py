from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from PO.Basepage import BasePage
from Resources.ObjectRepository import Locators
from TESTDATA.Testdata import TestData
class LoginPage(BasePage):

    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get(TestData.site_url)

    def click_login(self):
        self.click(Locators.myaccount_by_css)
        self.click(Locators.login_by_linktext)

    def enter_username(self):
        self.driver.find_element(*Locators.username_by_id).clear()
        self.enter_text(Locators.username_by_id,TestData.username)

    def enter_password(self):
        self.driver.find_element(*Locators.password_by_id).clear()
        self.enter_text(Locators.password_by_id,TestData.password)

    def click_loginbutton(self):
        self.click(Locators.loginbutton_by_xpath)



