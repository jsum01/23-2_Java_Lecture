package java24mid.example.object_practice;

public class ObjectTest3 {

    public static void main(String[] args) {
        Student std1 = new Student("김둘리", 90);
        System.out.println("std1 객체의 해시코드 값: " + std1.hashCode());

        Student std2 = new Student("박또치", 80);
        System.out.println("std2 객체의 해시코드 값: " + std2.hashCode());

        Student std3 = new Student("김둘리", 90);
        System.out.println("std3 객체의 해시코드 값: " + std3.hashCode());
    }
}
