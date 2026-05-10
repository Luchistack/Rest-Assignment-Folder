package DomainLayer;
import Exceptions.InvalidAmountException;
import ServiceLayer.BankService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank implements BankService {

    private Map<String, Account> accounts = new HashMap<>();

    @Override
    public void deposit(String accountNumber, BigDecimal amount) {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }

        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }

        account.deposit(amount);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount, String pin) {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.validatePin(pin);

        account.withdraw(amount, pin);
    }

    @Override
    public BigDecimal checkBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);

        if(account == null){
            throw new IllegalArgumentException("Account not found");
        }
        account.validatePin(pin);
        return account.checkBalance();
    }

    public void transfer(String accountNumber, String receiverAccNo, BigDecimal amount, String pin){

        Account sender = findAccount(accountNumber);
        Account receiver = findAccount(receiverAccNo);

        if(sender == null || receiver == null){
            throw new IllegalArgumentException("Invalid Account Number");
        }

        sender.validatePin(pin);
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        sender.withdraw(amount, pin);
        receiver.deposit(amount);


    }
    public String generateAccountNumber(){

        return "10" + (new Random().nextInt(90000000));

    }
    public Account registerCustomer(String name, String phoneNumber, String pin){


        String accountNumber = generateAccountNumber();

        Account account = new Account(name, phoneNumber, accountNumber, pin);

        accounts.put(accountNumber, account);

        return account;
    }
    public Account getAccount(String accountNumber){

        return accounts.get(accountNumber);
    }

    public void removeAccount(String accountNumber, String pin){

        Account account = findAccount(accountNumber);

        if(account == null){
           throw new IllegalArgumentException("Account not found");
        }

        account.validatePin(pin);
        accounts.remove(accountNumber);

    }
    public Account findAccount(String accountNumber) {

                return accounts.get(accountNumber);

    }

    public void validatePin(String accountNumber, String pin){
        Account account = findAccount(accountNumber);

        if(account == null){
            throw new IllegalArgumentException("Account number is invalid");

        }
        account.validatePin(pin);
    }

}



