package atm;

import java.util.HashMap;
import java.util.Map;

public class AccountDatabase {
    private static AccountDatabase obj;
    Map<Integer, Account> accDatabase;
    Map<Integer, DebitCard> cardDatabase;
    Map<Integer, Customer> customerDatabase;


    private AccountDatabase() {
        accDatabase=new HashMap<>();
        cardDatabase=new HashMap<>();
        customerDatabase=new HashMap<>();
    }

    public static AccountDatabase getInstance() {
        if(obj==null)
            obj=new AccountDatabase();
        return obj;
    }

    public Map<Integer, Account> getAccountDataBase() {
        return accDatabase;
    }

    public Map<Integer, DebitCard> getDebitCardDataBase() {
        return cardDatabase;
    }

    public Map<Integer, Customer> getCustomerDatabase() {
        return customerDatabase;
    }
}
