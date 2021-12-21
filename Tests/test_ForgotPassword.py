from Resources import TestData
from Pages.LoginPage import LoginPage
from Pages.ForgotPasswordPage import ForgotPasswordPage
from Resources import Locators
from Resources.BasicActions import BasicActions


class TestForgotPassword(BasicActions):
  def setup_method(self, method):
    self.setBrowser(TestData.GOOGLE_CHROME)
    self.driver.maximize_window()
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_tC001(self):
    loginPage = LoginPage(self.driver)
    loginPage.forgotPassword()
    forgotPasswordPage = ForgotPasswordPage(self.driver)
    forgotPasswordPage.setEmail("MayankJatav7898@GMail.Com")
    forgotPasswordPage.clickContinueButton()
    #self.assert_element_text(Locators.ALERT, "An email with a confirmation link has been sent your email address.")
    self.assert_element_text(Locators.ALERT, "An email with a confirmation link has been sent your email address")

