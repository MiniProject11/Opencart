from selenium.webdriver.common.by import By
class Locators():
    #for search
    SEARCH_TEXTBOX=(By.NAME, "search")
    SEARCH_SUBMIT_BUTTON=(By.XPATH,"/html/body/header/div/div/div[2]/div/span/button/i")
    SEARCHED_ELEMENT_NAME=(By.XPATH,"/html/body/div[2]/div/div/h1")

    #for login'''
    myaccount_by_css=(By.CSS_SELECTOR, ".list-inline .dropdown-toggle")
    login_by_linktext=(By.LINK_TEXT, "Login")
    username_by_id=(By.ID, "input-email")
    password_by_id=(By.ID, "input-password")
    loginbutton_by_xpath=(By.XPATH,"/html/body/div[2]/div/div/div/div[2]/div/form/input")

    #Myaccount Details
    #homeicon path
    homeicon_by_css=(By.XPATH, "/html/body/div[2]/ul/li[1]/a/i")
    Myaccount_path=(By.XPATH, "/html/body/nav/div/div[2]/ul/li[2]/a")

    #product path
    product_path=(By.LINK_TEXT, "iPhone")
    Description_path=(By.XPATH, "/html/body/div[2]/div/div/div[1]/div[1]/ul[2]/li[1]/a")
    mac_path=(By.XPATH, "/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a")
    Productlist_path=(By.XPATH,"/html/body/div[1]/nav/div[2]/ul/li[1]/a")
    available_option_path=(By.XPATH, "/html/body/div[2]/div/div/div/div[2]/div[2]/h3")

    camera_path=(By.XPATH, "/html/body/div[2]/div/div/div[2]/div[4]/div/div[2]/h4/a")
