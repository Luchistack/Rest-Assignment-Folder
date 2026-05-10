package Tests;
import DomainLayer.Account;
import DomainLayer.Bank;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {


    @Test
    void testThatInitialBalanceIsZero() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        assertEquals(BigDecimal.valueOf(0), bank.checkBalance(accNo, "1234"));

    }


    @Test
    void testThatBalanceIsZero_When500IsDepositedIntoAccount_BalanceIs500() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo,BigDecimal.valueOf(500) );

        assertEquals(BigDecimal.valueOf(500), bank.checkBalance(accNo, "1234"));

    }
    @Test
    void testThatIfInvalidPinIsEnteredBankThrowsException(){

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo,BigDecimal.valueOf(1000));

        assertThrows(InvalidPinException.class, () -> { bank.withdraw(accNo,BigDecimal.valueOf(500), "0000"); });


    }

    @Test
    void testThatBalanceDoesNotChange_WhenNegativeAmountIsDeposited() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");
        assertThrows(InvalidAmountException.class,() -> {account.deposit(BigDecimal.valueOf(-200));});

    }

    @Test
    void testThatBalanceIs300_When200IsWithdrawnFRom500() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, BigDecimal.valueOf(500));

        bank.withdraw(accNo, BigDecimal.valueOf(200), "1234");

        assertEquals(BigDecimal.valueOf(300), bank.checkBalance(accNo, "1234"));
    }

    @Test
    void testThatAccountIs500_When600IsWithdrawnAccountReturns500() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, BigDecimal.valueOf(500));

        assertEquals(BigDecimal.valueOf(500), bank.checkBalance(accNo, "1234"));
        assertThrows(InsufficientFundsException.class, () -> bank.withdraw(accNo, BigDecimal.valueOf(600), "1234"));
    }


    @Test
    void testThatAccountIs1000_WhenIDeposit0_AccountBalanceRemains1000() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, BigDecimal.valueOf(1000));

        assertThrows(InvalidAmountException.class, () -> account.deposit(BigDecimal.valueOf(0)));

    }



    @Test
    void testThatWhenICheckBalance_AccountReturnsBalance() {

        Bank bank = new Bank();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, BigDecimal.valueOf(1000));

        assertEquals(BigDecimal.valueOf(1000), bank.checkBalance(accNo, "1234"));


    }


}