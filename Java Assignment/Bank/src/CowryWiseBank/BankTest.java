package CowryWiseBank;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class BankTest {

    @Test
    void testThatCustomerCanRegisterAccount(){

        Bank bank = new Bank("gtBank");

        Account account = bank.registerCustomer("Faith", "1234");

        assertNotNull(account);

    }
    @Test
    void testThatRegisteredAccountCanBeFound(){

        Bank bank = new Bank("`gtBank`");

        Account account = bank.registerCustomer("Faith", "1234");

        Account found = bank.findAccount("0209530714");

        assertEquals(account, found);

    }

    @Test
    void testThatDepositIncreasesBalance(){

        Bank bank = new Bank("`gtBank`");

        Account account = bank.registerCustomer("Faith", "12345");

        bank.deposit(account.getAccountNumber(), BigDecimal.valueOf(500), "1234");

        assertEquals(BigDecimal.valueOf(500), bank.checkBalance(getAccountNumber(), "1234"));

    }

    @Test
    void testThatWithdrawReducesBalance(){

        Bank bank = new Bank("`gtBank`");

        Account account = bank.registerCustomer("Faith", "12345");

        bank.deposit(account.getAccountNumber(), BigDecimal.valueOf(500), "1234");
        bank.withdraw(account.getAccountNumber(), BigDecimal.valueOf(200), "1234");

        assertEquals(BigDecimal.valueOf(300), bank.checkBalance(getAccountNumber(), "1234"));


    }

    @Test
    void testThatTransferIsSuccessful(){

        Bank bank = new Bank("gtBank");

        Account sender = bank.registerCustomer("Faith", "1234");
        Account receiver = bank.registerCustomer("John", "5678");

        bank.deposit(sender.getAccountNumber(), BigDecimal.valueOf(5000),  "1234");
        bank.transfer(sender.getAccountNumber(), receiver.getAccountNumber(), BigDecimal.valueOf(2000),  "1234");

        assertEquals(BigDecimal.valueOf(300),
                bank.checkBalance(sender.getAccountNumber(), "1234"));

        assertEquals(BigDecimal.valueOf(200),
                bank.checkBalance(receiver.getAccountNumber(), "5678"));

    }
    //    @Test
//    void testThatMultipleAccountsCanBeRegistered(){
//
//    }

//    @Test
//    void testThatFindAccountReturnsCorrectAccount(){
//
//
//    }
//    @Test
//    void testThatFindingNonExistentAccountThrowsExceptionOrReturnsNull(){
//
//
//    }
//    @Test
//    void testThatAccountCanBeRemoved(){
//
//
//    }
//    @Test
//    void testThatRemovedAccountCanNoLongerBeFound(){
//
//
//    }
//    @Test
//    void testThatRemovingWithWrongPinFails(){
//
//
//    }
//    @Test
//    void testThatDepositIsSuccessful(){
//
//    }
    //
//    @Test
//    void testThatDepositWithInvalidAmountThrowsException(){
//
//
//    }
//    @Test
//    void testThatWithdrawIsSuccessful(){
//
//
//    }
    //    @Test
//    void testThatWithdrawWithWrongPinThrowsException(){
//
//
//    }
//    @Test
//    void testThatWithdrawWithInsufficientFundsThrowsException(){
//
//
//    }
//    @Test
//    void testThatWithdrawFromNonExistentAccountFails(){
//
//
//    }
//    @Test
//    void testThatWithdrawWithInvalidAmountThrowsException(){
//
//
//    }
//    @Test
//    void testThatTransferReducesSenderBalance(){
//
//
//    }
//    @Test
//    void testThatTransferIncreasesReceiverBalance(){
//
//
//    }
//    @Test
//    void testThatTransferWithWrongPinThrowsException(){
//
//
//    }
//    @Test
//    void testThatTransferWithInsufficientFundsThrowsException(){
//
//
//    }
//
//    @Test
//    void testThatTransferFromNonExistentAccountFails(){
//
//
//    }
//    @Test
//    void testThatTransferWithInvalidAmountThrowsException(){
//
//
//    }
//    @Test
//    void testThatCheckBalanceReturnsCorrectBalance(){
//
//
//    }
//    @Test
//    void testThatCheckBalanceWithWrongPinThrowsException(){
//
//
//    }
//    @Test
//    void testThatCheckBalanceForNonExistentAccountFails(){
//
//
//    }
}
