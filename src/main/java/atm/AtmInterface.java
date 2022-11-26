/**
 * ATM Simulation Program
 * <p>
 * @author:- Gulshan Kumar Nayak and Biswajit Panda
 * @version:- 0.1.0
 * <p>
 * FUNCTIONS:-
 * <p>
 * getLogin(args):-
 *      Verifies the login details of the user, i.e., Debit card number and PIN
 *      After verification, redirects the control to the menu() function
 *      menu():- displays the various functionality choices available to the user
 * <p>
 *      args:- int cardNum(Debit Card number)
 * <p>
 * withdraw(args):-
 *      Verifies whether sufficient funds are available
 *      After verification, provides the functionality for withdrawing of funds
 *      After withdraw of funds, updates the database
 * <p>
 *      args:- int cardNum(Debit Card number)
 * <p>
 * deposit(args):-
 *      Provides the functionality for depositing of funds
 *      After deposit of funds, updates the database
 * <p>
 *      args:- int cardNum(Debit Card number)
 * <p>
 * pinChange(args):-
 *      Provides the functionality for changing the PIN
 *      After PIN change, updates the database
 * <p>
 *      args:- int cardNum(Debit Card number)
 * <p>
 * displayBalance(args):-
 *      Displays the current balance
 * <p>
 *      args:- int cardNum(Debit Card number)
 */

package atm;

public interface AtmInterface {
    int getLogin(int cardNum);

    void withdraw(int cardNum);

    void deposit(int cardNum);

    void pinChange(int cardNum);

    void displayBalance(int cardNum);
}
