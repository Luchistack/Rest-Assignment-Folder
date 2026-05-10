class Account:
    def __init__(self,name, acc_no, balance, pin):
        self.name = name
        self.acc_no = acc_no
        self.balance = balance
        self.pin = pin

    def deposit(self, amount):

        if amount > 0:
            self.balance += amount
            return self.balance

        raise ValueError ("Invalid amount")


    def withdraw(self, amount, pin):

        if pin != self.pin:
            raise ValueError ("Invalid pin")

        if amount > self.balance:
            return ValueError ("Insufficient funds")

        self.balance -= amount

        return self.balance


    def check_balance(self, pin):

        if pin != self.pin:
            raise ValueError ("Invalid pin")

        return self.balance



























