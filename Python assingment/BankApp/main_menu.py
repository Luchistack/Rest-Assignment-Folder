from account import Account

def menu():

    account = Account("Faith", "12345678", 0, "1234")


    while True:

        print("\n\tWELCOME TO MONIEPOINT BANKING APP")

        print("""

                 1. Deposit
                 2. Withdraw
                 3. Check Balance
                 4. Exit

            """)

        choice = int(input("Enter your choice: "))

        if choice == 1:
            amount = int(input("Enter the amount you want to deposit: "))
            print("Balance: ", account.deposit(amount))

        elif choice == 2:
            amount = int(input("Enter the amount you want to withdraw: "))
            pin = input("Enter your 4 digit pin: ")
            print("Balance: ", account.withdraw(amount, pin))

        elif choice == 3:
            pin = input("Enter your 4 digit pin: ")
            print("Balance: ", account.check_balance(pin))

        else:
            print("Thank you for banking with us")
            break

menu()

