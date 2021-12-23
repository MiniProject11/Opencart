import inspect
import os
import sys
import unittest
#from HTMLTestRunner import HTMLTestRunner
from Resources.ObjectRepository import Locators
from TESTDATA.Testdata import TestData
from PO.Basepage import BasePage

from selenium import webdriver
import time
import pytest
from PO.LoginPage import LoginPage
from PO.Homepage import HomePage
from PO.MyaccountPage import MyaccountPage
from PO.ProductCategoryPage import ProductCategoryPage


class Test_Homepage_Functionality:
    '''def __init__(self):
        self.Loginobj = LoginPage(self.driver)
        self.HomeObj = HomePage(self.driver)
        self.Myaccobj = MyaccountPage(self.driver)
        self.Productobj=ProductCategoryPage(self.driver)'''

    def setup_method(self):
        self.driver = webdriver.Chrome(TestData.Chrome_executable_path)
        self.driver.implicitly_wait(10)
        self.driver.maximize_window()

    def teardown_method(self):
        self.driver.close()
        self.driver.quit()

    def test_Check_Homeicon(self):
        self.Loginobj = LoginPage(self.driver)
        self.Loginobj.click_login()
        self.Loginobj.enter_username()
        self.Loginobj.enter_password()
        self.Loginobj.click_loginbutton()
        self.Myaccobj = MyaccountPage(self.driver)
        self.Myaccobj.click_homeicon()
        self.Myaccobj.Homepage_is_visible(Locators.Productlist_path)

    def test_search(self):
        self.HomeObj = HomePage(self.driver)
        self.HomeObj.search()

    def test_Product_Specification(self):
        self.HomeObj = HomePage(self.driver)
        self.HomeObj.check_product_specification()

    def test_Visibility_myaccount(self):
        self.HomeObj = HomePage(self.driver)
        self.HomeObj.visiblity_Myaccount()

    def test_Count_Specific_Product(self):
        self.HomeObj = HomePage(self.driver)
        self.HomeObj.count_product()

    def test_Category_display(self):
        self.Productobj = ProductCategoryPage(self.driver)
        self.Productobj.Check_Category_list()

    def test_Availability_MultipleVariation(self):
        self.Productobj = ProductCategoryPage(self.driver)
        self.Productobj.click(Locators.camera_path)
        self.Productobj.availability_of_variation()


#if __name__=="__main__":
