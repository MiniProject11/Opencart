from Resources import TestData
from Pages.AccountPage import AccountPage
from Pages.AccountInformationPage import AccountInformationPage
from Pages.ChangePasswordPage import ChangePasswordPage
from Pages.AddressBookPage import AddressBookPage
from Pages.AddAddressPage import AddAddressPage
from Resources import Locators
from TestLogin import TestLogin
from Resources.BasicActions import BasicActions


class TestAccountInformation(BasicActions):

  def setup_method(self):
    self.setBrowser(TestData.GOOGLE_CHROME)
    self.driver.maximize_window()
    TestLogin.test_login(self)

  def teardown_method(self, method):
    self.driver.quit()

  def test_edit_account_information(self):
    accountPage = AccountPage(self.driver)
    accountPage.open()
    accountPage.editAccountInformation()
    accountInforamationPage = AccountInformationPage(self.driver)
    accountInforamationPage.setFirstName("Mayank")
    accountInforamationPage.setLastName("Jatav")
    accountInforamationPage.setEmail("MayankJatav7898@GMail.Com")
    accountInforamationPage.setTelephoneNumber("9876543219")
    accountInforamationPage.submit()
    self.assert_element_text(Locators.ALERT, "Success: Your account has been successfully updated.")

  def test_change_password(self):
    accountPage = AccountPage(self.driver)
    accountPage.open()
    accountPage.changePassword()
    changePasswordPage = ChangePasswordPage(self.driver)
    changePasswordPage.setPassword("ProjectMini@2511")
    changePasswordPage.setConfirmPassword("ProjectMini@2511")
    changePasswordPage.clickContinueButton()
    self.assert_element_text(Locators.ALERT, "Success: Your password has been successfully updated.")

  def test_add_address(self):
    accountPage = AccountPage(self.driver)
    accountPage.open()
    accountPage.modifyAdrressBook()
    addressBookPage = AddressBookPage(self.driver)
    addressBookPage.newAddress()
    addAddressPage = AddAddressPage(self.driver)
    addAddressPage.setFirstName("qwerty")
    addAddressPage.setLastName("asdfg")
    addAddressPage.setCompany("zxcvbnm")
    addAddressPage.setAddress1("qwerty")
    addAddressPage.setAddress2("asdfg")
    addAddressPage.setCity("zxcvbn")
    addAddressPage.setPostCode("12345678")
    addAddressPage.setCountry(Locators.COUNTRY_OPTION_INDIA)
    addAddressPage.setState(Locators.STATE_OPTION_ANDAMAN_AND_NICOBAR_ISLAND)
    addAddressPage.submit()
    self.assert_element_text(Locators.ALERT, "Your address has been successfully added")

  def test_edit_address(self):
    accountPage = AccountPage(self.driver)
    accountPage.open()
    accountPage.modifyAdrressBook()
    addressBookPage = AddressBookPage(self.driver)
    addressBookPage.editAddress(2)
    addAddressPage = AddAddressPage(self.driver)
    addAddressPage.setPostCode("12345678")
    addAddressPage.submit()
    self.assert_element_text(Locators.ALERT, "Your address has been successfully updated")

  def test_delete_address(self):
    accountPage = AccountPage(self.driver)
    accountPage.open()
    accountPage.modifyAdrressBook()
    addressBookPage = AddressBookPage(self.driver)
    addressBookPage.deleteAddress(2)
    addressBookPage.acceptAlert()
    self.assert_element_text(Locators.ALERT, "Your address has been successfully deleted")