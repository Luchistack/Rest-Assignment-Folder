
from unittest import TestCase

from account import Account

class TestBankApp(TestCase):

    def setUp(self):

        self.account = Account("Faith", "12345678", 10000, "1234")

    def test_that_app_can_deposit(self):

        self.assertEqual(self.account.deposit(5000), 15000)

    def test_that_app_can_withdraw(self):

        self.assertEqual(self.account.withdraw(5000,"1234"), 10000)

    def test_that_you_can_check_balance(self):

        self.assertEqual(self.account.check_balance("1234"), 10000)


