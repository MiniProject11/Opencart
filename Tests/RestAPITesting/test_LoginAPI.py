import APITestData
import requests
import json

class TestLoginAPI:

    def test_createSession(self):
        self.session = requests.Session()
        self.response =  self.session.post(
            APITestData.BASE_URL + APITestData.LOGIN_URL,
            data={'username': APITestData.USERNAME, 'key': APITestData.KEY},
            verify=False
        ).text

        self.response = json.loads(self.response)  # Deserialisation of JSON Data
        assert self.response["success"] == "Success: API session successfully started!"
        self.API_TOKEN = self.response["api_token"]
        return self.session

    def createSession(self):
        return self.test_createSession()

    def getAPIToken(self):
        return self.API_TOKEN
