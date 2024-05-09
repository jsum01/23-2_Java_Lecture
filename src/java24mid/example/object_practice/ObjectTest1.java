package java24mid.example.object_practice;

public class ObjectTest1 {

    public static void main(String[] args) {
        Student kim = new Student("김둘리", 90);
        System.out.println(kim.getClass()); // class java24mid.example.object_practice.Student

        String score = "박또치의 점수 : 90";
        System.out.println(score.getClass()); // class java.lang.String

        Object ob = new Object();
        ob.hashCode();
    }
}
