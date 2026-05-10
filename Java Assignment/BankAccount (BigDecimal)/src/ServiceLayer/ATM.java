package ServiceLayer;

import DomainLayer.Account;
import DomainLayer.Bank;
import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidPinException;

import java.math.BigDecimal;

public class ATM {
    private Bank bank;

    public ATM(Bank bank) {

        this.bank = bank;
    }

    public void withdraw(String accountNumber, BigDecimal amount, String pin) {

        Account account = bank.getAccount(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException("Account not found");
        }

        account.validatePin(pin);

        if (account.checkBalance().compareTo(amount) < 0) {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        account.withdraw(amount, pin);

    }

    public void deposit(String accountNumber, BigDecimal amount) {

        Account account = bank.getAccount(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException("Account not found");
        }
        account.deposit(amount);
        
    }
    
    public BigDecimal checkBalance(String accountNumber, String pin){

        Account account = bank.getAccount(accountNumber);


        if (account == null) {
            throw new AccountNotFoundException("Account not found");
        }

        account.validatePin(pin);

        return account.checkBalance();

    }
    public void transfer(String accountNumber, String receiverAccount, BigDecimal amount, String pin ){

        Account sender = bank.getAccount(accountNumber);
        Account receiver = bank.getAccount(receiverAccount);


        if (sender == null || receiver == null) {
            throw new AccountNotFoundException("Account not found");
        }
        sender.validatePin(pin);

        if (sender.checkBalance().compareTo(amount) < 0) {
            throw new InsufficientFundsException("Insufficient Funds");
        }

        sender.withdraw(amount, pin);
        receiver.deposit(amount);


    }

    public void changePin(String accountNumber, String oldPin, String newPin){

        Account account = bank.getAccount(accountNumber);

        if(account == null){
            throw new AccountNotFoundException("Account not found");
        }

        account.changePin(oldPin, newPin);

    }
}