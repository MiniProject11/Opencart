from selenium.webdriver.common.by import By

from Resources.BasicActions import BasicActions
from Resources import TestData
from Resources import Locators


class AddressBookPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def newAddress(self):
        self.click(Locators.NEW_ADDRESS_BUTTON)

    def editAddress(self, position):
        self.click((By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr["+str(position)+"]/td[2]/a[1]"))

    def deleteAddress(self, position):
        self.click((By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr["+str(position)+"]/td[2]/a[2]"))

    def acceptAlert(self):
        self.driver.switch_to.alert.accept()