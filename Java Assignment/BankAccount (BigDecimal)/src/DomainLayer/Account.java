package DomainLayer;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

import java.math.BigDecimal;

public class Account {

    private String name;
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;
    private String phoneNumber;
    private String  accountNumber;

    public Account(String name, String phoneNumber, String accountNumber, String pin){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.valueOf(0);
        this.pin = pin;

    }


    public void deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
            balance = balance.add(amount);


    }

    public void withdraw(BigDecimal amount, String pin) {

        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid pin");
        }
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(("Enter a valid amount"));
        }
        if(amount.compareTo(balance) > 0){
            throw new InsufficientFundsException("Insufficient amount");
        }

        balance = balance.subtract(amount);
    }

    public BigDecimal checkBalance() {
        return balance;
    }

    public boolean validatePin(String pin){

        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid pin");
        }
        return true;
    }

    public void changePin(String oldPin, String newPin){


        if(this.pin.equals(oldPin)){
            this.pin = newPin;
        }else{
            throw new InvalidPinException("Invalid Pin");
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}
