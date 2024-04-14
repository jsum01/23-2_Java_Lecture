package java240411.object.ex3;

public class Key {

    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return this.number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) { // Key 타입으로 바꿀 수 있다면
            Key k = (Key)obj;
            if(k.number == this.number)
                return true;
            else
                return false;
        }
        return false;
    }

}
