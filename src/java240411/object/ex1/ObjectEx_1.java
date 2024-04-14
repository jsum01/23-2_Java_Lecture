package java240411.object.ex1;

import java240411.object.ex1.Point;

public class ObjectEx_1 {

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);

        /* p1 */
        System.out.println(p1.hashCode()); // 821270929
        System.out.println(p1.toString()); // java240411.Point@30f39991
        System.out.println(p1.getClass().getName()); // java240411.Point
        /* p2 */
        System.out.println(p2.hashCode()); // 1160460865
        System.out.println(p2.toString()); // java240411.Point@452b3a41
        System.out.println(p2.getClass().getName()); // java240411.Point

        System.out.println("=========대입 전=========");
        if(p1 == p2) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
        if(p1.equals(p2)) {
            System.out.println("equals");
        } else {
            System.out.println("differ");
        }

        /* p2 = p1 */
        System.out.println("-------p2에 p1을 대입-------");
        p2 = p1;
        System.out.println("p1 hashCode: " + p1.hashCode()); // 같은 값이
        System.out.println("p2 hashCode: " + p2.hashCode()); // 출력된다
        System.out.println("p1 toString: " + p1.toString()); // 같은 값이
        System.out.println("p2 toString: " + p2.toString()); // 출력된다

        System.out.println("=========대입 후=========");
        if(p1 == p2) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
        if(p1.equals(p2)) {
            System.out.println("equals");
        } else {
            System.out.println("differ");
        }
    }
}
