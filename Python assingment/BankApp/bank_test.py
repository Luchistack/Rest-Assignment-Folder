from unittest import TestCase

from bank import Bank

class BankTest(TestCase):

    def setUp(self):

        self.bank = Bank("Moniepoint")
        self.account = self.bank.register_customer("faith", "123456", "1234")

    def test_that_bank_can_deposit(self):

        result = self.bank.deposit("123456", 1000)
        self.assertEqual(result, 1000)

    def test_that_bank_can_withdraw(self):
        self.bank.deposit("123456", 1000)
        result = self.bank.withdraw("123456", 500, "1234")
        self.assertEqual(result, 500)

    def test_that_bank_can_check_balance(self):

        self.bank.deposit("123456", 1000)
        self.assertEqual(1000, self.bank.check_balance("123456", "1234"))

    def test_that_bank_can_remove_account(self):

         self.bank.remove_account("123456")

         with self.assertRaises(ValueError):
            self.bank.find_account("123456")