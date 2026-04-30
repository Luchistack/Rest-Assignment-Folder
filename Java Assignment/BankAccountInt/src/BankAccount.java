import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class BankAccount implements BankService {


    private int balance;
    private String pin;
    private List<Account> accounts;


    public BankAccount(int balance, String pn) {
        this.balance = balance;
        this.pin = pin;
        accounts = new ArrayList<>();
    }

    @Override
    public void deposit(String accNO, int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(String accNo, int amount, String pin) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public int checkBalance(String accNO, String pin) {
        return balance;
    }

//    public void transfer(String accNo, String receieverAccNo, int amount, String pin){
//
//
//    }
//
//    public Account registerCustomer(String name, String accNo, String pin){
//
//
//    }
//
//    public void removeAccount(String accNo, String pin){
//
//    }
//    public Account findAccount(String accNo){
//

//    }

}

//
//
//private double balance;
//private String correctPin;
//
//public BankAccount(double balance, String correctPin) {
//    this.balance = balance;
//    this.correctPin = correctPin;
//}
//public double getBalance() {
//    return balance;
//}


