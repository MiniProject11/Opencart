class SearchPage():
    def __init__(self,driver):
        self.driver=driver
        self.driver.get(TESTDATA.site_url)
    def search(self):

        element = self.driver.find_element(Resources.search_byname)
        actions = ActionChains(self.driver)
        actions.double_click(element).perform()
        '''if len(element) > 0:
            self.driver.find_element(LOCATORS.search_byname).click()
            self.driver.find_element(LOCATORS.search_byname).send_keys(TESTDATA.searchtext)
            else:
                print("No SEARCH BUTTON IS PRESENT")'''
        assert element.text==TESTDATA.searchtext



