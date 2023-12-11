package java231127;

public class Key1 {

    public int number;

    public Key1(int number) {
        this.number = number;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Key1) {
            Key1 comKey = (Key1) obj;
            if (this.number == comKey.number) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return number;
    }
}
