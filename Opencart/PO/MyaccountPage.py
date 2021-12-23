from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from PO.Basepage import BasePage
from Resources.ObjectRepository import Locators
from TESTDATA.Testdata import TestData
class MyaccountPage(BasePage):
    def __init__(self,driver):
        super().__init__(driver)
        self.driver.get(TestData.site_url)

    def home_icon_validity(self):
        self.hover_to(Locators.homeicon_by_css)

    def click_homeicon(self):
        self.click(Locators.homeicon_by_css)
