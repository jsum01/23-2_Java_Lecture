package miniSungdong;

import java.time.LocalDateTime;

public class Customer extends Users {
    private int customer_type;

    public Customer(int id, String name, int age, LocalDateTime joined, int userType, int discount_rate, int customer_type) {
        super(id, name, age, joined, userType, discount_rate);
        this.customer_type = customer_type;
    }

    public int getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(int customer_type) {
        this.customer_type = customer_type;
    }
}
