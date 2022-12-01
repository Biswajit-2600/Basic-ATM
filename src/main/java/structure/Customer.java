package structure;

public class Customer {
    private int customerId;
    private String name, dob, address;
    private Account accDetails;

    //Setter Methods

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccDetails() {
        accDetails = new Account();
    }

    //Getter Methods

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public Account getAccDetails() {
        return accDetails;
    }
}
