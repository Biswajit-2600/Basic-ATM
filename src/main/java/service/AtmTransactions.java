package service;

import interface_atm.AtmInterface;
import database.AccountDatabase;
import structure.Account;
import structure.Customer;
import structure.DebitCard;

import java.util.Map;
import java.util.Scanner;

public class AtmTransactions implements AtmInterface {

    //Singleton class method called to get the singleton object
    AccountDatabase data = AccountDatabase.getInstance();

    //Maps returned from AccountDatabase class stored in respective Maps
    Map<Integer, Account> accData = data.getAccountDataBase();
    Map<Integer, DebitCard> cardData = data.getDebitCardDataBase();
    Map<Integer, Customer> customerData = data.getCustomerDatabase();
    Scanner sc = new Scanner(System.in);


    @Override
    public int getLogin(int cardNum) {
        if (cardData.containsKey(cardNum)) {
            int databasePin = cardData.get(cardNum).getPin();
            int customerId = cardData.get(cardNum).getCustomerId();
            String customerName = customerData.get(customerId).getName();
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if (databasePin == enteredPin) {
                System.out.print("\n!! LOGIN SUCCESSFUL !!\n");
                System.out.println("\n!! WELCOME " + customerName + "!!\n");
                return cardNum;
            } else {
                System.out.print("\n!! WRONG PIN ENTERED !!\n");
                return 0;
            }
        } else {
            System.out.print("\n!! CARD NUMBER NOT FOUND !!\n");
            return 0;
        }
    }

    @Override
    public void displayBalance(int cardNum) {
        int cId = cardData.get(cardNum).getCustomerId();
        double balance = accData.get(cId).getBalance();
        System.out.println("\nYour current balance is: " + balance + "\n");
    }

    @Override
    public void withdraw(int cardNum) {
        int cId = cardData.get(cardNum).getCustomerId();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        double presentBalance = accData.get(cId).getBalance();
        if (withdrawAmount <= presentBalance) {
            accData.get(cId).setBalance(presentBalance - withdrawAmount);
            displayBalance(cardNum);
        }
        else
            System.out.println("\nInsufficient Balance in Account\n");
    }

    @Override
    public void deposit(int cardNum) {
        int cId = cardData.get(cardNum).getCustomerId();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        double presentBalance = accData.get(cId).getBalance();
        accData.get(cId).setBalance(presentBalance + depositAmount);
        displayBalance(cardNum);
    }

    @Override
    public void pinChange(int cardNum) {
        System.out.print("Enter new PIN: ");
        cardData.get(cardNum).setPin(sc.nextInt());
    }
}
