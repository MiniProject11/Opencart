from PO.Basepage import BasePage
from Resources.ObjectRepository import Locators
from TESTDATA.Testdata import TestData

class ProductCategoryPage(BasePage):
    def __init__(self,driver):
        super().__init__(driver)
        self.driver.get(TestData.site_url)

    def Check_Category_list(self):
        val=self.is_visible(Locators.Productlist_path)
        print(val)

    def availability_of_variation(self):
        self.assert_element_Innertext(Locators.available_option_path,"Available Options")

    

