package ServiceLayer;
import java.math.BigDecimal;

public interface BankService {

    void deposit(String accountNumber, BigDecimal amount);
    void withdraw(String accountNumber, BigDecimal amount, String pin);
    BigDecimal checkBalance(String accountNumber, String pin);


}
