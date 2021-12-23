class config():
    def setup(self, browser):
        if browser.lower() == TestData.GOOGLE_CHROME:
            self.driver = webdriver.Chrome(TestData.CHROME_DRIVER_PATH)
        elif browser.lower() == TestData.MOZILLA_FIREFOX:
            self.driver = self.driver = webdriver.Chrome(TestData.FIREFOX_DRIVER_PATH)
        elif browser.lower() == TestData.MICROSOFT_EDGE:
            self.driver = self.driver = webdriver.Chrome(TestData.EDGE_DRIVER_PATH)