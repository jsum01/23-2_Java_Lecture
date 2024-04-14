package java_manage_user_program;

import java.time.LocalDateTime;

public class Supplier extends Users{
    private int supplier_type;

    public Supplier(int id, String name, int age, LocalDateTime joined, int userType, int discount_rate, int supplier_type) {
        super(id, name, age, joined, userType, discount_rate);
        this.supplier_type = supplier_type;
    }


    public int getSupplier_type() {
        return supplier_type;
    }

    public void setSupplier_type(int supplier_type) {
        this.supplier_type = supplier_type;
    }
}
