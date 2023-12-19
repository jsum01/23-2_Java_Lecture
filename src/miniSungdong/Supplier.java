package miniSungdong;

import java.time.LocalDateTime;

public class Supplier extends Users{
    private int suplier_type;

    public Supplier(int id, String name, int age, LocalDateTime joined, int userType, int discount_rate, int suplier_type) {
        super(id, name, age, joined, userType, discount_rate);
        this.suplier_type = suplier_type;
    }

    public int getsuplier_type() {
        return suplier_type;
    }

    public void setsuplier_type(int suplier_type) {
        this.suplier_type = suplier_type;
    }
}
