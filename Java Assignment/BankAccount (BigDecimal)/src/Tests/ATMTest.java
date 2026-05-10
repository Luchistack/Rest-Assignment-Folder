package Tests;

import DomainLayer.Account;
import DomainLayer.Bank;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;
import ServiceLayer.ATM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ATMTest {

    private Bank bank;
    private Account account;
    private ATM atm;


    @BeforeEach
    void setUp(){
         bank = new Bank();
         atm = new ATM(bank);

        account = bank.registerCustomer("Faith", "07080100701", "1234");
        account.deposit(BigDecimal.valueOf(1000));
    }

    @Test
    void testWithdrawSuccessful(){

        atm.withdraw(account.getAccountNumber(), BigDecimal.valueOf(500), "1234");

        assertEquals(BigDecimal.valueOf(500), account.checkBalance());
    }
    @Test
    void testWithdrawWithWrongPinThrowsException(){
        assertThrows(InvalidPinException.class, () -> atm.withdraw(account.getAccountNumber(), BigDecimal.valueOf(200), "0000"));
    }

    @Test
    void testWithdrawInsufficientFundsThrowsException(){

        assertThrows(InsufficientFundsException.class, () -> atm.withdraw(account.getAccountNumber(), BigDecimal.valueOf(2000), "1234"));

    }

    @Test
    void testDepositIsSuccessful(){

        atm.deposit(account.getAccountNumber(), BigDecimal.valueOf(2000));

        assertEquals(BigDecimal.valueOf(3000), account.checkBalance());
    }
    @Test
    void testTransferIsSuccessful(){

        Account receiverAccount = bank.registerCustomer("Jerry", "07073881814", "0000");

        atm.transfer(account.getAccountNumber(), receiverAccount.getAccountNumber(), BigDecimal.valueOf(400), "1234");

        assertEquals(BigDecimal.valueOf(600), account.checkBalance());
        assertEquals(BigDecimal.valueOf(400), receiverAccount.checkBalance());

    }
    @Test
    void testPinIsChangedSuccessfully(){

        atm.changePin(account.getAccountNumber(), "1234", "0000");

        assertThrows(InvalidPinException.class,()-> atm.checkBalance(account.getAccountNumber(), "1234"));

    }
}
