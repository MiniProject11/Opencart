import json
import APITestData
from Tests.RestAPITesting.test_LoginAPI import TestLoginAPI


class TestCustomer:

    def setup_method(self):
        self.login = TestLoginAPI()
        self.session = self.login.createSession()

    def test_setCustomer(self):
        firstname = "first"
        lastname = "last"
        email = "firstlast@gmail.com"
        telephone = "123456789"
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.SET_CUSTOMER_URL,
            params={'api_token': self.login.getAPIToken()},
            data={
                'firstname': firstname,
                'lastname': lastname,
                'email': email,
                'telephone': telephone
            }
        ).text

        self.response = json.loads(self.response)  # Deserialisation of JSON Data
        assert self.response["success"] == "You have successfully modified customers"

