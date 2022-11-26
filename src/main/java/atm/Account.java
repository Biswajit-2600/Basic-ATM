package atm;

public class Account {
    private int accNumber, customerId;
    private String accType, ifsc;
    private double balance;

    private DebitCard debitCard;

    //Setter Methods

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDebitCard() {
        debitCard = new DebitCard();
    }

    //Getter Methods

    public int getAccNumber() {
        return accNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAccType() {
        return accType;
    }

    public String getIfsc() {
        return ifsc;
    }

    public double getBalance() {
        return balance;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }
}
