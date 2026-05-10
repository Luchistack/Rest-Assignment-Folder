package Tests;
import DomainLayer.Account;
import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountTest {


    @Test
    public void testThatAccountCanDeposit(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(500));

        assertEquals(BigDecimal.valueOf(500), gtb.checkBalance());

    }
    @Test
    public void testThatAccountCanWithdraw(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(1000));
        gtb.withdraw(BigDecimal.valueOf(100), "1234");

        assertEquals(BigDecimal.valueOf(900), gtb.checkBalance());

    }
    @Test
    public void testThatAccountCanCheckBalance(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(1000));

        assertEquals(BigDecimal.valueOf(1000), gtb.checkBalance());
    }

    @Test
    public void testWithdrawWithWrongPinThrowsAnException(){

        Account gtb = new Account("Faith", "1234567890","07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(1000));

        assertThrows(InvalidPinException.class, () -> { gtb.withdraw(BigDecimal.valueOf(500), "0000"); });

    }

    @Test
    void withdrawMoreThanBalanceThrowsException(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(2000));

        assertThrows(InsufficientFundsException.class, () -> { gtb.withdraw(BigDecimal.valueOf(3000), "1234");
        });

    }
    @Test
    void testCheckBankBalanceWithWrongPinThrowsException(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        gtb.deposit(BigDecimal.valueOf(1000));

        assertThrows(InvalidPinException.class,() -> { gtb.validatePin("0000");
        });
    }
    @Test
    public void testChangePinWithWrongPinThrowsException(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        assertThrows(InvalidPinException.class, () -> { gtb.changePin("0000", "1111");
        });

    }
    @Test
    public void testDepositNegativeAmountThrowsException(){

        Account gtb = new Account("Faith", "1234567890", "07080100701", "1234");

        assertThrows(InvalidAmountException.class,() -> { gtb.deposit(BigDecimal.valueOf(-100));});
    }

}
