package java240411.object.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class ObjectEx3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer, String> telList = new HashMap<Integer, String>();
        telList.put(1, "010-1234-5678");
        telList.put(2, "010-2222-3333");

        /* id 입력 */
        System.out.print("아이디(정수): ");
        int num1 = sc.nextInt();

        System.out.println("|------------ 해당되는 전화전호 ------------|");
        System.out.println(telList.get(num1));


        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");

        HashMap<Key, String> friendList = new HashMap<Key, String>();

        friendList.put(new Key(1), "010-1111-1111"); // (1)
        friendList.put(new Key(2), "010-1111-1111"); // (2)
        /* id 입력 */
        System.out.print("아이디(정수): ");
        Key  num2 = new Key(sc.nextInt()); // (3)

        System.out.println("|------------ 해당되는 친구의 전화전호 ------------|");
        System.out.println(friendList.get(num2));
        /**
         * get(num2)는 (3) 에서 생성된 인스턴스이기 때문에 (1), (2) 부분과 값만 같다면
         * 동일한 hashCode라고 인식할 수 있도록 Key.java 에서
         * hashCode()와 equals()를 오버라이딩 해줘야 합니다.
         *
         * 이렇게 오버라이딩 된 객체들을 통해
         * HashMap 내부에서 Key값을 찾아갈 때 hashCode와 equals가 이용됩니다.
         */
    }
}
