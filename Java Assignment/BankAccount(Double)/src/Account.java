import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

public class Account {

    private String name;
    private double balance;
    private String pin;
    private String phoneNumber;
    private String  accountNumber;

    public Account(String name, String phoneNumber, String accountNumber, String pin){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.pin = pin;

    }


    public void deposit(double amount) {
        if(amount <= 0) {
            return;
        }
            balance += amount;

    }

    public void withdraw(double amount) {

        if(amount <= 0){
            throw new InvalidAmountException(("Enter a valid amount"));
        }
        if(balance < amount){
            throw new InsufficientFundsException("Insufficient amount");
        }

        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void validatePin(String pin){

        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid pin");
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}
