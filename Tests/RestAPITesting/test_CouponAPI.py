import json
import APITestData
from Tests.RestAPITesting.test_LoginAPI import TestLoginAPI


class TestCoupon:

    def setup_method(self):
        self.login = TestLoginAPI()
        self.session = self.login.createSession()

    def test_applyCoupon(self):
        coupon_code = "2222"
        self.response = self.session.post(
            APITestData.BASE_URL + APITestData.APPLY_COUPON_URL,
            params={'api_token': self.login.getAPIToken()},
            data={
                'coupon': coupon_code
            }
        ).text

        self.response = json.loads(self.response)
        assert "success" in self.response