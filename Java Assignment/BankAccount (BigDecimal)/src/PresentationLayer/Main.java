package PresentationLayer;
import DomainLayer.Account;
import DomainLayer.Bank;
import Exceptions.InvalidPinException;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);

        Bank gtb = new Bank();


        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";
        String RESET = "\u001B[0m";

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println(BLUE + "Hello and welcome To Moniepoint Bank App!" + RESET);
            System.out.println("-------------------------------------------");

            System.out.println(YELLOW + """
                    \n1. Register Account
                    2. Deposit
                    3. Withdraw
                    4. Transfer
                    5. Check Balance
                    6. Validate Pin
                    7. Exit
                    
                    """);

            System.out.println(GREEN + "Enter Transaction: " + RESET);
            int choice = collector.nextInt();
            collector.nextLine();
//
            switch (choice) {
                case 1 -> {

                    System.out.println(GREEN + "Enter Full Name: " + RESET);
                    String name = collector.nextLine();

                    System.out.println(YELLOW +"Enter phone Number: " + RESET);
                    String phone = collector.nextLine();

                    System.out.println(GREEN + "Create Pin " + RESET);
                    String pin = collector.nextLine();

                    Account account = gtb.registerCustomer(name, phone, pin);
                    System.out.println(WHITE + "Your account Number is: " + account.getAccountNumber() + RESET);

                }
                case 2 -> {
                    System.out.println("Enter Details to Deposit Below");

                    System.out.println(BLUE + "Enter Account Number: " + RESET);
                    String accountNumber = collector.nextLine();

                    System.out.println(GREEN + "Enter Amount to deposit: " + RESET);
                    BigDecimal amount = new BigDecimal(collector.nextLine());

                    gtb.deposit(accountNumber, amount);

                    System.out.println("Deposit of " + amount + " was successful");


                }
                case 3 -> {
                    System.out.println("Enter Details to Withdraw Below");

                    System.out.println("Enter Account Number: ");
                    String accountNumber = collector.nextLine();

                    System.out.println("Enter Amount to withdraw: ");
                    BigDecimal amount = new BigDecimal(collector.nextLine());

                    System.out.println("Enter Pin ");
                    String pin = collector.nextLine();

                    gtb.withdraw(accountNumber, amount, pin);

                    System.out.println("Withdrawal of " + amount + " was successful");
                    System.out.println("Current balance is " + gtb.checkBalance(accountNumber, pin));

                }
                case 4 -> {
                    System.out.println("Enter Details to Transfer Below");

                    System.out.println("Enter Account Number: ");
                    String accountNumber = collector.nextLine();

                    System.out.println("Enter Receiver Account Number: ");
                    String receiverAccNo = collector.nextLine();


                    System.out.println("Enter Amount to withdraw: ");
                    BigDecimal amount = new BigDecimal(collector.nextLine());
                    collector.nextLine();

                    System.out.println("Enter Pin ");
                    String pin = collector.nextLine();

                    gtb.transfer(accountNumber, receiverAccNo, amount, pin);


                    System.out.println("Transfer of " + amount + " to " + receiverAccNo + " is Successful");

                    System.out.println("Current balance is " + gtb.checkBalance(accountNumber, pin));



                }
                case 5 -> {
                    System.out.println("Enter details below to Check Account Balance");

                    System.out.println("Enter Account Number: ");
                    String accountNumber = collector.nextLine();

                    System.out.println("Enter Pin: ");
                    String pin = collector.nextLine();

                    System.out.println("Your current balance is: " + gtb.checkBalance(accountNumber, pin));


                }
                case 6 -> {
                    System.out.println("Enter details to validate pin");
                    System.out.println(BLUE + "Enter Account Number: " + RESET);
                    String accountNumber = collector.nextLine();

                    System.out.println(YELLOW + "Enter Pin: " + RESET);
                    String pin = collector.nextLine();

                    try{
                        gtb.validatePin(accountNumber, pin);
                        System.out.println("Pin Validated Successfully");
                    }
                    catch (InvalidPinException error){
                        System.out.println(error.getMessage());
                    }
                }
                case  7 -> {
                    System.out.println("Thank you for banking with us");
                    return;
                }



            }


        }

    }
}

