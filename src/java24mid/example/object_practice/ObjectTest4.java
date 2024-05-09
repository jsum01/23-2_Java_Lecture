package java24mid.example.object_practice;

public class ObjectTest4 {

    public static void main(String[] args) {
        int score1 = 80;
        int score2 = 80;
        System.out.println("[[ 값 비교(==) ]]");
        if (score1 == score2)
            System.out.println("score1과 score2의 값은 같다");
        else
            System.out.println("score1과 score2의 값은 다르다.");


        Student std1 = new Student("엄둘리", 90);
        Student std2 = new Student("엄둘리",90);
        System.out.println("[[ 참조변수 값 비교 ]]");
        if(std1 == std2)
            System.out.println("같다");
        else
            System.out.println("다르다"); // 참조변수의 값이 다르기 떄문애 "다르다"로 표시된다.

        System.out.println("[[ 객체의 내용 비교]]");
        if(std1.equals(std2))
            System.out.println("같다"); // 2. 하지만 Student 클래스에서 equals를 오버라이딩해준다면 같아질 수 있다(내용이 일치하다면)
        else
            System.out.println("다르다"); // 1. 다른 인스턴스이기 때문에 다르다.

    }
}
