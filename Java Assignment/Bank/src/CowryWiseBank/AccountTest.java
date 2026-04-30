package CowryWiseBank;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.*;
import static org.testng.Assert.assertThrows;

public class AccountTest {

    private final String correctPin = "1234";
    private Account account;

    @BeforeMethod
    void setUp() {
        account = new Account("Faith", correctPin, "0209530714");
    }

    @Test
    void testThatAccountIsEmptyFromStart() {
        assertEquals(BigDecimal.ZERO, account.getBalance());
    }

    @Test
    void testDeposit500_balanceIs500() {
        account.deposit(BigDecimal.valueOf(500), correctPin);
        assertEquals(BigDecimal.valueOf(500), account.getBalance());
    }

    @Test
    void testNegativeDepositDoesNotChangeBalance() {
        account.deposit(BigDecimal.valueOf(500), correctPin);
        account.deposit(BigDecimal.valueOf(-200), correctPin);

        assertEquals(BigDecimal.valueOf(500), account.getBalance());
    }

    @Test
    void testWithdraw200_balanceIsReduced() {
        account.deposit(BigDecimal.valueOf(500), correctPin);
        account.withdraw(BigDecimal.valueOf(200), correctPin);

        assertEquals(BigDecimal.valueOf(300), account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalanceThrowsException() {
        account.deposit(BigDecimal.valueOf(500), correctPin);

        assertThrows(InsufficientFundsException.class,
                () -> account.withdraw(BigDecimal.valueOf(600), correctPin));
    }

    @Test
    void testDepositZeroThrowsException() {
        assertThrows(InvalidAmountException.class,
                () -> account.deposit(BigDecimal.ZERO, correctPin));
    }

    @Test
    void testWithdrawZeroThrowsException() {
        account.deposit(BigDecimal.valueOf(1000), correctPin);

        assertThrows(InvalidAmountException.class,
                () -> account.withdraw(BigDecimal.ZERO, correctPin));
    }

    @Test
    void testBalanceWithCorrectPin() {
        account.deposit(BigDecimal.valueOf(1000), correctPin);

        assertEquals(BigDecimal.valueOf(1000),
                account.getBalance(correctPin));
    }

    @Test
    void testWrongPinThrowsException() {
        account.deposit(BigDecimal.valueOf(1000), correctPin);

        assertThrows(InvalidPinException.class,
                () -> account.getBalance("0000"));
    }

    @Test
    void testChangePinWorks() {
        account.changePin("1234", "5678");

        account.deposit(BigDecimal.valueOf(100), "5678");

        assertEquals(BigDecimal.valueOf(100), account.getBalance("5678"));
    }

    @Test
    void testWrongPinRejectsTransaction() {
        assertThrows(InvalidPinException.class,
                () -> account.deposit(BigDecimal.valueOf(500), "0000"));
    }
}