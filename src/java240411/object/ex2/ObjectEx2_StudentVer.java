package java240411.object.ex2;

public class ObjectEx2_StudentVer {

    public static void main(String[] args) {
        /* 1번은 오버라이딩 하나도 안 함 */
        StudentVer1 std10 = new StudentVer1("ulsan", 90);
        StudentVer1 std11 = new StudentVer1("ulsan", 90);
        StudentVer1 std12 = std10;
        System.out.println("hashCode(10): " + std10.hashCode());
        System.out.println("hashCode(11): " + std11.hashCode());
        System.out.println("hashCode(12): " + std12.hashCode());
        /* 2번은 equals만 오버라이딩 */
        StudentVer2 std20 = new StudentVer2("ulsan", 90);
        StudentVer2 std21 = new StudentVer2("ulsan", 90);
        StudentVer2 std22 = std20;
        if (std20 == std21)
            System.out.println("std20과 std21이 같은 객체입니다.");
        else
            System.out.println("std20과 std21이 다른 객체입니다.");
        if (std20.equals(std21))
            System.out.println("std20과 std21이 같은 객체입니다.");
        else
            System.out.println("std20과 std21이 다른 객체입니다.");


        /* 3번은 hashCode만 오버라이딩 */
        StudentVer3 std30 = new StudentVer3("ulsan", 90);
        StudentVer3 std31 = new StudentVer3("ulsan", 90);
        StudentVer3 std32 = std30;
        if (std30 == std31)
            System.out.println("std30과 std31이 같은 객체입니다.");
        else
            System.out.println("std30과 std31이 다른 객체입니다.");
        if (std30.equals(std30))
            System.out.println("std30과 std31이 같은 객체입니다.");
        else
            System.out.println("std30과 std31이 다른 객체입니다.");

        /* 4번은 equals, hashCode 둘 다 오버라이딩 */
        StudentVer4 std40 = new StudentVer4("ulsan", 90);
        StudentVer4 std41 = new StudentVer4("ulsan", 90);
        StudentVer4 std42 = std40;
        if (std40 == std41)
            System.out.println("std40과 std41이 같은 객체입니다.");
        else
            System.out.println("std40과 std41이 다른 객체입니다.");
        if (std40.equals(std40))
            System.out.println("std40과 std41이 같은 객체입니다.");
        else
            System.out.println("std40과 std41이 다른 객체입니다.");
    }

}
