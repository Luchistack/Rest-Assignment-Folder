import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

public class Account {

    private String name;
    private int balance;
    private String pin;
    private String accNo;

    public Account(String name, String accNo, int balance, String pin){

        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        this.pin = pin;

    }


    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount, String pin) {
        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid pin");
        }
        if(amount < 0){
            throw new InvalidAmountException(("Enter a valid amount"));
        }
        if(balance < amount){
            throw new InsufficientFundsException("Insufficient amount");
        }
        balance -= amount;
    }

    public int checkBalance(String accNO) {
        return balance;
    }
}
