package CowryWiseBank;

import java.math.BigDecimal;

public class Account {

    private String name;
    private String pin;
    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(String name, String pin, String accountNUmber){
        this.name = name;
        this.pin = pin;
        this.accountNumber = accountNUmber;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public BigDecimal getBalance(String pin){
        validatePin(pin);
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(BigDecimal amount, String pin){
        validatePin(pin);
        validateAmount(amount);

        balance = balance.add(amount);
    }
    public void withdraw(BigDecimal amount, String pin) {
        validatePin(pin);
        validateAmount(amount);

        if (amount.compareTo(balance) > 0) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        balance = balance.subtract(amount);
    }

    public void changePin(String oldPin, String newPin) {
        validatePin(oldPin);

        if (newPin == null || newPin.length() != 4) {
            throw new InvalidPinException("Invalid new pin");
        }

        this.pin = newPin;
    }

    private void validatePin(String inputPin) {
        if (!this.pin.equals(inputPin)) {
            throw new InvalidPinException("Invalid PIN");
        }
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
    }
}