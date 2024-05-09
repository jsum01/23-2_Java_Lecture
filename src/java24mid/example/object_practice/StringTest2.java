package java24mid.example.object_practice;

public class StringTest2 {

    public static void main(String[] args) {
        String std = "고길동";
        System.out.println(std.hashCode());
        std = std + "소프트웨어 개발 전공";
        System.out.println(std.hashCode());
    }
}
