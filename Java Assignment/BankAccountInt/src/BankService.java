interface BankService {

    void deposit(String accNO, int amount);
    void withdraw(String accNo, int amount, String pin);
    int checkBalance(String accNO, String pin);
}
