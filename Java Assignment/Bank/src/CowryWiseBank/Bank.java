package CowryWiseBank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {


    private  String bankName;
    private List<Account> accounts = new ArrayList<>();


public Bank (String bankName) {

    this.bankName = bankName;

}
    public Account registerCustomer(String name, String pin, String accountNumber){
        Account account = new Account(name, pin, accountNumber);
        accounts.add(account);
        return account;
    }
    public Account findAccount(String accountNumber){

        for(Account account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
    public void removeAccount(String accountNumber, String pin){

        Account account = findAccount(accountNumber);
        if(account != null && account.validatePin(pin)) {
            accounts.remove(account);
        }
    }

    public void deposit(String accountNumber, BigDecimal amount, String pin){
        Account account = findAccount(accountNumber);
            if(account == null) {
                throw new IllegalArgumentException("Account not found");
            }
                account.deposit(amount, pin);

        }


    public void withdraw(String accountNumber, BigDecimal amount, String pin){
        Account account = findAccount(accountNumber);
        if(account == null) {
            throw new IllegalArgumentException("Account not found");
        }
            account.withdraw(amount, pin);
    }
    public void transfer(String senderAccount, String receiverAccount, BigDecimal amount, String pin){

        Account sender = findAccount(senderAccount);
        Account receiver = findAccount(receiverAccount);

        if(sender == null || receiver == null) {
            throw new IllegalArgumentException("Account not found");
        }
            sender.withdraw(amount, pin);
            receiver.deposit(amount);

    }

    public BigDecimal checkBalance(String accountNumber, String pin){

        Account account = findAccount(accountNumber);
        if(account == null) {
            throw new IllegalArgumentException("Account not found");
        }
            return account.getBalance(pin);
    }


    }


