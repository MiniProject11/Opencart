from selenium.webdriver.common.by import By


class Locators:
    # --- Home Page Locators ---
    SEARCH_LOGIN_OPTION = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")

    # --- Login Page Locators ---
    SEARCH_USERNAME_TEXTBOX = (By.ID, "input-email")
    SEARCH_PASSWORD_TEXTBOX = (By.ID, "input-password")
    SEARCH_LOGIN_BUTTON = (By.XPATH, "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    LOGIN_SUCCESS_MESSAGE = (By.XPATH, "/html/body/div[2]/div/div/h2[1]")

    # --- Add to Cart Locators ---
    SEARCH_HOME_ICON = (By.XPATH, "/html/body/div[2]/ul/li[1]/a/i")
    TITLE_IMAGE_ON_HOME = (By.XPATH, "/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img")
    SEARCH_ADD_TO_CART = (By.XPATH, "/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")
    SEARCH_CART = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[4]/a/i")
    ADDED_TO_CART_SUCCESS_TEXT = (By.XPATH, "/html/body/div[2]/div[1]/i")
    TITLE_IMAGE_IN_CART = (By.XPATH, "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[1]/a/img")

    # --- Logout And Check Again ---
    CART_COUNT = (By.XPATH, '/html/body/div[2]/div/div/form/div/table/tbody/tr')
    SEARCH_MY_ACCOUNT_DROPDOWN = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[2]/a")
    SEARCH_LOGOUT_OPTION = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")
    SEARCH_CONTINUE_BUTTON = (By.XPATH, "/html/body/div[2]/div/div/div/div/a")
    SEARCH_LOGIN_OPTION = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
    TITLE_IMAGE_LOGOUT_CART = (By.XPATH, "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[1]/a/img")

    # --- Remove Item From Cart ---
    SEARCH_REMOVE_ITEM = (By.XPATH, "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[4]/div/span/button[2]")
    TITLE_IMAGE_AFTER_REMOVE = (By.XPATH, "/html/body/div[2]/div[2]/div/form/div/table/tbody/tr[2]/td[1]/a/img")
    REMOVE_SUCCESS_ELEMENT = (By.XPATH, "/html/body/div[2]/div/div/div/div/a")

    # --- Add to wishlist ---
    SEARCH_ADD_TO_WISHLIST = (By.XPATH, "/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[2]/i")
    SEARCH_MUST_LOGIN = (By.XPATH, "/html/body/div[2]/div[1]/a[1]")
    SEARCH_WISHLIST = (By.XPATH, "/html/body/nav/div/div[2]/ul/li[3]/a/i")
    TITLE_IMAGE_ON_HOME1 = (By.XPATH, "/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/a/img")
    TITLE_IMAGE_IN_WISHLIST = (By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[1]/a/img")

    # --- Move from wishlist to cart ---
    SEARCH_MOVE_TO_CART = (By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[6]/button/i")
    SUCCESS_MOVED_TO_CART = (By.XPATH, "/html/body/div[2]/div[1]/i")

    # --- Remove product from wishlist ---
    REMOVE_FROM_WISHLIST = (By.XPATH, "/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[6]/a/i")
    SUCCESS_REMOVE_FROM_WISHLIST = (By.XPATH, "/html/body/div[2]/div[1]/i")








