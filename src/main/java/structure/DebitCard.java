package structure;

public class DebitCard extends Customer {
    private int pin, customerId, cardNumber;
    private String expiryDate;

    //Setter Methods

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    //Getter Methods

    public int getPin() {
        return pin;
    }

    @Override
    public int getCustomerId() {
        return customerId;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
