import Exceptions.InsufficientFundsException;
import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {


    @Test
    void testThatInitialBalanceIsZero() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        assertEquals(0, bank.checkBalance(accNo, "1234"));

    }


    @Test
    void testThatBalanceIsZero_When500IsDepositedIntoAccount_BalanceIs500() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo,500 );

        assertEquals(500, bank.checkBalance(accNo, "1234"));

    }
    @Test
    void testThatIfInvalidPinIsEnteredBankThrowsException(){

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo,1000);

        assertThrows(InvalidPinException.class, () -> { bank.withdraw(accNo,500, "0000"); });


    }

    @Test
    void testThatBalanceDoesNotChange_WhenNegativeAmountIsDeposited() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, 500);
        bank.deposit(accNo, -200);

        assertEquals(500, bank.checkBalance(accNo, "1234"));
    }

    @Test
    void testThatBalanceIs300_When200IsWithdrawnFRom500() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, 500);

        bank.withdraw(accNo, 200, "1234");

        assertEquals(300, bank.checkBalance(accNo, "1234"));
    }

    @Test
    void testThatAccountIs500_When600IsWithdrawnAccountReturns500() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, 500);

        assertEquals(500, bank.checkBalance(accNo, "1234"));
        assertThrows(InsufficientFundsException.class, () -> bank.withdraw(accNo, 600, "1234"));
    }


    @Test
    void testThatAccountIs1000_WhenIDeposit0_AccountBalanceRemains1000() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, 1000);
        bank.deposit(accNo, 0);

        assertEquals(1000, bank.checkBalance(accNo, "1234"));

    }



    @Test
    void testThatWhenICheckBalance_AccountReturnsBalance() {

        BankAccount bank = new BankAccount();

        Account account = bank.registerCustomer("Faith", "07080100701", "1234");

        String accNo = account.getAccountNumber();

        bank.deposit(accNo, 1000);

        assertEquals(1000, bank.checkBalance(accNo, "1234"));


    }
//
//    @Test
//    void testThatIhaveAnAccount_WhenIUpdatePinFromOldToNeWPin_PinIsUpdatedSuccessfully() {
//
//         Account account = bank.registerCustomer("Faith", "07080100701", "1234");
//
//        String accNo = account.getAccountNumber();

//        newAccount.pin("5678");
//
//        assertEquals("5678", newAccount.getNewPin());
//
//    }

//    @Test
//    void testThatIhaveAnAccount_WhenIUpdatePinFromOldToNeWPin_TransactionIsRejected() {
//
//         Account account = bank.registerCustomer("Faith", "07080100701", "1234");
//
//        String accNo = account.getAccountNumber();

//        newAccount.withdraw(accNO, 500,"2468");
//
//        assertFalse(newAccount.withdraw("1234567890", 500, "1234"));
//
//    }

}