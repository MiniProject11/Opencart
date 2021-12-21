import json
import APITestData
from Tests.RestAPITesting.test_LoginAPI import TestLoginAPI


class TestCart:

    def setup_method(self):
        self.login = TestLoginAPI()
        self.session = self.login.createSession()

    def test_addToCart(self):
        product_id = 10
        quantity = 1
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.ADD_TO_CART_URL,
            params={'api_token': self.login.getAPIToken()}, #self.login.getAPIToken()
            data={
                'product_id': product_id,
                'quantity': quantity
            }
        ).text

        self.response = json.loads(self.response)
        assert "success" in self.response

    def test_editProductQuantity(self):
        cart_id = 10
        quantity = 2
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.EDIT_CART_PRODUCT_QUANTITY_URL,
            params={'api_token': self.login.getAPIToken()},
            data={
                'key': cart_id,
                'quantity': quantity
            }
        ).text

        self.response = json.loads(self.response)
        assert self.response["success"] == "Success: You have modified your shopping cart!"

    def test_removeProductFromCart(self):
        cart_id = 10
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.REMOVE_CART_PRODUCT_URL,
            params={'api_token': self.login.getAPIToken()},
            data={
                'key': cart_id
            }
        ).text

        self.response = json.loads(self.response)
        assert self.response["success"] == "Success: You have modified your shopping cart!"

    def test_getCartContent(self):
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.DISPLAY_CART_PRODUCTS_URL,
            params={'api_token': self.login.getAPIToken()},
            data={}
        ).text

        self.response = json.loads(self.response)
        assert "products" in self.response