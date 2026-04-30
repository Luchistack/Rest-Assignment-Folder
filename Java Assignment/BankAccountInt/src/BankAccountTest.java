import Exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {


    @Test
    void testThatInitialBalanceIsZero() {

        BankAccount newAccount = new BankAccount(0, "1234");

        assertEquals(0, newAccount.checkBalance("1234567890", "1234"));

    }


    @Test
    void testThatBalanceIsZero_When500IsDepositedIntoAccount_BalanceIs500() {

        BankAccount newAccount = new BankAccount(0, "1234");

        newAccount.deposit("1234567890",500 );

        assertEquals(500, newAccount.checkBalance("1234567890", "1234"));

    }
//    @Test
//    void testThatIfInvalidPinIsEnteredBankThrowsException(){
//
//        BankAccount newAccount = new BankAccount(1000, "1234");
//
//        newAccount.withdraw("1234567890",500, "0000");
//
//        assertThrows(InvalidPinException.class, () -> { newAccount.withdraw("1234567890",500, "0000"); });

//    }

//    @Test
//    void testThatBalanceDoesNotChange_WhenNegativeAmountIsDeposited() {
//
//        BankAccount newAccount = new BankAccount(BigDecimal.valueOf(500), "1234");
//
//        newAccount.deposit(BigDecimal.valueOf(-200));
//
//        assertEquals(BigDecimal.valueOf(500), newAccount.getBalance());
//    }
//
////    @Test
////    void testThatBalanceIs300_When200IsWithdrawnFRom500() {
////
////        BankAccount newAccount = new BankAccount(BigDecimal.valueOf(500), "1234");
////
////        newAccount.withdraw(BigDecimal.valueOf(200));
////
////        assertEquals(BigDecimal.valueOf(300), newAccount.getBalance());
////    }
////
////    @Test
////    void testThatAccountIs500_When600IsWithdrawnAccountReturns500() {
////
////        BankAccount newAccount = new BankAccount(BigDecimal.valueOf(500), "1234");
////
////        newAccount.withdraw(BigDecimal.valueOf(600));
////
////        assertEquals(BigDecimal.valueOf(500), newAccount.getBalance());
////    }
////
////
//////    @Test
//////    void testThatAccountIs1000_WhenIDeposit0_AccountBalanceRemains1000() {
//////
//////        BankAccount newAccount = new BankAccount(1000, "1234");
//////
//////        newAccount.deposit(0);
//////
//////        assertEquals(1000, newAccount.getBalance());
//////
//////    }
//////
//////    @Test
//////    void testThatAccountIs1000_WhenIWithdraw0_AccountBalanceRemains1000() {
//////
//////        BankAccount newAccount = new BankAccount(1000, "1234");
//////
//////        newAccount.withdraw(0);
//////
//////        assertEquals(1000, newAccount.getBalance());
//////
//////    }
//////
//////    @Test
//////    void testThatWhenICheckBalance_AccountReturnsBalance() {
//////
//////        BankAccount newAccount = new BankAccount(1000, "1234");
//////
//////        assertEquals(1000, newAccount.getBalance());
//////
//////
//////    }
//////
//////    @Test
//////    void testThatIhaveAnAccount_WhenIUpdatePinFromOldToNeWPin_PinIsUpdatedSuccessfully() {
//////
//////        BankAccount newAccount = new BankAccount(1000, "1234");
//////
//////        newAccount.setCorrectPin("5678");
//////
//////        assertEquals("5678", newAccount.getCorrectPin());
//////
//////    }
//////
//////    @Test
//////    void testThatIhaveAnAccount_WhenIUpdatePinFromOldToNeWPin_TransactionIsRejected() {
//////
//////        BankAccount newAccount = new BankAccount(1000, "5678");
//////
//////        newAccount.setCorrectPin("2468");
//////
//////        assertFalse(Boolean.parseBoolean("5678"), newAccount.getCorrectPin());
//////
//////    }

}