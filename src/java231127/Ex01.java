package java231127;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<Key1, String > tList = new HashMap<Key1, String>();
        tList.put(new Key1(1), "Ulsan");
        System.out.println(tList. get(new Key1(1))); // 이 상태로는 달라서 오버라이딩 해줘야 한다.
        Key1 temp = new Key1(2);
        tList.put(temp, "Busan");
        System.out.println(tList.get(temp));
    }
}
