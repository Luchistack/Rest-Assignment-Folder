from account import Account


class Bank:
    def __init__(self, name):

        self.name = name
        self.accounts = []

    def register_customer(self, name, acc_no, pin):

        for account in self.accounts:
            if account.acc_no == acc_no:
                raise ValueError ("Account already registered")

        new_account = Account(name, acc_no,0, pin)
        self.accounts.append(new_account)
        return new_account


    def find_account(self, acc_no):

        for account in self.accounts:
            if account.acc_no == acc_no:
                return account

        raise ValueError("Account not registered")

    def deposit(self, acc_no, amount):

        account = self.find_account(acc_no)
        return account.deposit(amount)

    def withdraw(self,acc_no, amount, pin):

        account = self.find_account(acc_no)
        return account.withdraw(amount, pin)

    def transfer(self,sender_acc_no, receiver_acc_no, amount, pin):

       sender = self.find_account(sender_acc_no)
       receiver = self.find_account(receiver_acc_no)

       sender.withdraw(amount, pin)
       receiver.deposit(amount)

       return "Transfer successful"

    def check_balance(self, acc_no, pin):

        account = self.find_account(acc_no)
        return account.check_balance(pin)

    def remove_account(self, acc_no):

        account = self.find_account(acc_no)
        self.accounts.remove(account)
        return "Account removed"