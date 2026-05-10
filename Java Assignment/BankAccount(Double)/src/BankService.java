interface BankService {

    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount, String pin);
    double checkBalance(String accountNumber, String pin);


}
