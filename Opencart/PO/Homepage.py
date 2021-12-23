from Resources.ObjectRepository import Locators
from PO.Basepage import BasePage
from Resources.ObjectRepository import Locators
from TESTDATA.Testdata import TestData
class HomePage(BasePage):
    def __init__(self,driver):
        super().__init__(driver)
        self.driver.get(TestData.site_url)

    def search(self):
        self.driver.find_element(*Locators.SEARCH_TEXTBOX).clear()
        self.enter_text(Locators.SEARCH_TEXTBOX, TestData.SEARCH_TERM)
        self.click(Locators.SEARCH_SUBMIT_BUTTON)
        #self.assert_element_text(Locators.SEARCHED_ELEMENT_NAME,TestData.SHOW_ELEMENT_NAME)

    def check_product_specification(self):
        self.click(Locators.product_path)
        self.assert_element_text(Locators.Description_path,"Description")

    def visiblity_Myaccount(self):
        #self.click(Locators.Myaccount_path)
        self.assert_element_title_text(Locators.Myaccount_path, "My Account")

    def image_download(self):
        with open('Logo.png', 'wb') as file:
            # identify image to be captured
            l =self.driver.find_element_by_xpath("/html/body/div[2]/div/div/div[1]/div[1]/ul[1]/li[1]/a/img")
            # write file
            file.write(l.screenshot_as_png)

    def count_product(self):
        productname=self.driver.find_element(*Locators.mac_path).text
        number=""
        for i in productname:
            if i=="(":
                while(i!=")"):
                    number+=str(i)
                break
        print(number)













