import json
import APITestData
from Tests.RestAPITesting.test_LoginAPI import TestLoginAPI

class TestCurrency:

    def setup_method(self):
        self.login = TestLoginAPI()
        self.session = self.login.createSession()

    def test_changeCurrency(self):
        currency = "USD"
        self.login = TestLoginAPI()
        self.session = self.login.createSession()
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.CHANGE_CURRENCY_URL,
            params={'api_token':self.login.getAPIToken()},
            data={'currency':currency}
        ).text

        self.response = json.loads(self.response)  # Deserialisation of JSON Data
        assert self.response["success"] == "Success: Your currency has been changed!"
