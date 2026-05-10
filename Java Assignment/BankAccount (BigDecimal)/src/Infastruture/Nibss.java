package Infastruture;
import DomainLayer.Account;
import Exceptions.AccountNotFoundException;
import Exceptions.InvalidAmountException;

import java.math.BigDecimal;

public class Nibss {

    public void validateAccount(Account account){
        if(account == null){
            throw  new AccountNotFoundException("Account not found");
        }
    }
    public void validateAmount(BigDecimal amount){

        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new InvalidAmountException("Invalid Amount");
        }
    }
    public void validatePin(Account account, String pin){

        validateAccount(account);
        account.validatePin(pin);
    }
}
