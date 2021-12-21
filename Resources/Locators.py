from selenium.webdriver.common.by import By

#Login Page
EMAIL_TEXTBOX = (By.ID, "input-email")
PASSWORD_TEXTBOX = (By.ID, "input-password")
LOGIN_BUTTON = (By.CSS_SELECTOR, ".btn:nth-child(3)")
FORGOT_PASSWORD = (By.LINK_TEXT, "Forgotten Password")
ALERT = (By.CSS_SELECTOR, ".alert")

#Forgot Password Page
CONTINUE_BUTTON = (By.CSS_SELECTOR, ".btn-primary")

#Account PAge
EDIT_ACCOUNT_INFORMATION = (By.LINK_TEXT, "Edit your account information")
CHANGE_PASSWORD = (By.LINK_TEXT, "Change your password")
MODIFY_ADDRESS_BOOK = (By.LINK_TEXT, "Modify your address book entries")

#Account Information Page
FIRST_NAME_TEXTBOX = (By.ID, "input-firstname")
LAST_NAME_TEXTBOX = (By.ID, "input-lastname")
TELEPHONE_TEXTBOX = (By.ID, "input-telephone")
BACK_BUTTON = (By.CSS_SELECTOR, "btn-default")

#Change Password Page
CONFIRM_PASSWORD_TEXTBOX = (By.ID, "input-confirm")

#Address Book Page
NEW_ADDRESS_BUTTON = (By.LINK_TEXT, "New Address")
EDIT_BUTTON = (By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]/a[1]")

#Add Address Page
COMPANY_TEXTBOX = (By.ID, "input-company")
ADDRESS1_TEXTBOX = (By.ID, "input-address-1")
ADDRESS2_TEXTBOX = (By.ID, "input-address-2")
CITY_TEXTBOX = (By.ID, "input-city")
POSTCODE_TEXTBOX = (By.ID, "input-postcode")
COUNTRY_DROPDOWN_MENU = (By.ID, "input-country")
COUNTRY_OPTION_INDIA = (By.XPATH, "//option[. = 'India']")
STATE_DROPDOWN_MENU = (By.ID, "input-zone")
STATE_OPTION_ANDAMAN_AND_NICOBAR_ISLAND = (By.XPATH, "//option[. = 'Andaman and Nicobar Islands']")