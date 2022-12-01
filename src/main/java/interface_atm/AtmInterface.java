package interface_atm;

/**
 * ATM Simulation Program
 * <p>
 * @author Gulshan Kumar Nayak and Biswajit Panda
 * @version 0.1.0
 */

public interface AtmInterface {

    /**
     * getLogin(args):-
     * Verifies the login details of the user, i.e., Debit card number and PIN
     * After verification, redirects the control to the menu() function
     * menu():- displays the various functionality choices available to the user
     * <p>
     * args:- int cardNum(Debit Card number)
     */
    int getLogin(int cardNum);

    /**
     * withdraw(args):-
     * Verifies whether sufficient funds are available
     * After verification, provides the functionality for withdrawing of funds
     * After withdraw of funds, updates the database
     * <p>
     * args:- int cardNum(Debit Card number)
     */
    void withdraw(int cardNum);

    /**
     * deposit(args):-
     * Provides the functionality for depositing of funds
     * After deposit of funds, updates the database
     * <p>
     * args:- int cardNum(Debit Card number)
     */
    void deposit(int cardNum);

    /**
     * pinChange(args):-
     * Provides the functionality for changing the PIN
     * After PIN change, updates the database
     * <p>
     * args:- int cardNum(Debit Card number)
     */
    void pinChange(int cardNum);

    /**
     * displayBalance(args):-
     * Displays the current balance
     * <p>
     * args:- int cardNum(Debit Card number)
     */
    void displayBalance(int cardNum);
}
