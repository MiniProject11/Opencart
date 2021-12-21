from Resources.BasicActions import BasicActions
from Resources import Locators


class AddAddressPage(BasicActions):

    def __init__(self, driver):
        self.driver = driver

    def setFirstName(self, name):
        self.clear_text(Locators.FIRST_NAME_TEXTBOX)
        self.enter_text(Locators.FIRST_NAME_TEXTBOX, name)

    def setLastName(self, name):
        self.clear_text(Locators.LAST_NAME_TEXTBOX)
        self.enter_text(Locators.LAST_NAME_TEXTBOX, name)

    def setCompany(self, company):
        self.clear_text(Locators.COMPANY_TEXTBOX)
        self.enter_text(Locators.COMPANY_TEXTBOX, company)

    def setAddress1(self, address):
        self.clear_text(Locators.ADDRESS1_TEXTBOX)
        self.enter_text(Locators.ADDRESS1_TEXTBOX, address)

    def setAddress2(self, address):
        self.clear_text(Locators.ADDRESS2_TEXTBOX)
        self.enter_text(Locators.ADDRESS2_TEXTBOX, address)

    def setCity(self, city):
        self.clear_text(Locators.CITY_TEXTBOX)
        self.enter_text(Locators.CITY_TEXTBOX, city)

    def setPostCode(self, postcode):
        self.clear_text(Locators.POSTCODE_TEXTBOX)
        self.enter_text(Locators.POSTCODE_TEXTBOX, postcode)

    def setCountry(self, country):
        self.click(Locators.COUNTRY_DROPDOWN_MENU)
        self.click(country)

    def setState(self, state):
        self.click(Locators.STATE_DROPDOWN_MENU)
        self.click(state)

    def submit(self):
        self.click(Locators.CONTINUE_BUTTON)