import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AccountTest {


    @Test
    public void testThatAccountCanDeposit(){

        Account gtb = new Account("Faith", "1234567890", 0, "1234");

        gtb.deposit(500);

        assertEquals(500, gtb.checkBalance("1234567890"));

    }
    @Test
    public void testThatAccountCanWithdraw(){

        Account gtb = new Account("Faith", "1234567890", 0, "1234");

        gtb.deposit(1000);
        gtb.withdraw(100, "1234");

        assertEquals(900, gtb.checkBalance("1234567890"));

    }
    @Test
    public void testThatAccountCanCheckBalance(){

        Account gtb = new Account("Faith", "1234567890", 1000, "1234");

        gtb.deposit(1000);

        assertEquals(2000, gtb.checkBalance("1234567890"));
    }

    @Test
    public void testWithdrawWithWrongPinThrowsAnException(){

        Account gtb = new Account("Faith", "1234567890", 1000, "1234");

        assertThrows(InvalidPinException.class, () -> { gtb.withdraw(500, "0000"); });

    }
}
