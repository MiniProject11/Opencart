from Resources import TestData
from Resources.BasicActions import BasicActions
from Pages.LoginPage import LoginPage


class TestLogin(BasicActions):
  def setup_method(self, method):
    self.setBrowser(TestData.GOOGLE_CHROME)
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_login(self):
    loginPage = LoginPage(self.driver)
    loginPage.open()
    loginPage.setEmail("MayankJatav7898@GMail.Com")
    loginPage.setPassword("ProjectMini@2511")
    loginPage.submit()