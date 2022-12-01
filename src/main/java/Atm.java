import interface_atm.AtmInterface;
import database.AccountDatabase;
import service.AtmTransactions;
import structure.Account;
import structure.Customer;
import structure.DebitCard;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Atm {

    static AccountDatabase data = AccountDatabase.getInstance();

    //Object of the AtmTransactions class with reference of AtmInterface
    static AtmInterface objTransactions = new AtmTransactions();

    public static void main(String[] args) throws InputMismatchException {

        //Scanner object for input
        Scanner sc = new Scanner(System.in);

        //Hard coded values stored into the respective Maps to create a predefined Database.

        //Customer details
        Customer objCustomer = new Customer();
        objCustomer.setCustomerId(1234);
        objCustomer.setName("Tyrion Lannister");
        objCustomer.setDob("17-8-1990");
        objCustomer.setAddress("India");
        objCustomer.setAccDetails();
        data.getCustomerDatabase().put(1234, objCustomer);

        //Account details
        Account objAccount = objCustomer.getAccDetails();
        objAccount.setAccNumber(52361425);
        objAccount.setCustomerId(1234);
        objAccount.setAccType("Savings");
        objAccount.setIfsc("SBI11");
        objAccount.setBalance(200000);
        objAccount.setDebitCard();
        data.getAccountDataBase().put(1234, objAccount);

        //Debit Card details
        DebitCard objCard = objAccount.getDebitCard();
        objCard.setCardNumber(123456);
        objCard.setPin(5236);
        objCard.setCustomerId(1234);
        objCard.setExpiryDate("7/23");
        data.getDebitCardDataBase().put(123456, objCard);

        boolean end = false;
        while (!end) {
            try {
                System.out.print("0 - Exit\n1 - Login\nChoice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 0 -> exit(0);
                    case 1 -> {
                        System.out.print("Enter card number: ");
                        int cardNum = sc.nextInt();
                        if (objTransactions.getLogin(cardNum) != 0)
                            menu(cardNum);
                        end = true;
                    }
                    default -> System.out.println("\nInvalid Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice");
                sc.next();
            }
        }
        System.out.println("\nThank You for using this ATM.\n");
        sc.close();
        exit(0);
    }

    public static void menu(int cardNum) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);

        boolean end = false;
        while (!end) {
            try {
                System.out.print("""
                        0 - Exit
                        1 - View Balance
                        2 - Withdraw Funds
                        3 - Deposit Funds
                        5 - PIN Change
                        Choice:\s""");

                int selection = sc.nextInt();

                switch (selection) {
                    case 0 -> end = true;
                    case 1 -> objTransactions.displayBalance(cardNum);
                    case 2 -> objTransactions.withdraw(cardNum);
                    case 3 -> objTransactions.deposit(cardNum);
                    case 5 -> objTransactions.pinChange(cardNum);
                    default -> System.out.println("\nInvalid Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Choice.");
                sc.next();
            }
        }
    }
}
