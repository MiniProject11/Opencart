from selenium import webdriver
import time
import unittest
class SearchTest(unittest.TestCase):
    @classmethod
    def SetUpClass(cls):
        cls.driver = webdriver.Chrome(executable_path="D:\sohini\chromedriver.exe")
        cls.driver.implicitly_wait(10)
        cls.driver.maximize_window()
    @classmethod
    def TeardownClass(cls):
        cls.driver.close()
        cls.driver.quit()
    def Search_validity(self):
        searchobj=SearchPage(self.driver)
        searchobj.search()
        time.sleep(8)

