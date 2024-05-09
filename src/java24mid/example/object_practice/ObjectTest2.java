package java24mid.example.object_practice;

public class ObjectTest2 {

    public static void main(String[] args) {
        //Student 타입의 객체만 저장
        Student[] stdList = new Student[2]; // Student 객체만 저장 가능
        stdList[0] = new Student("김둘리", 90);
        stdList[1] = new Student("박또치", 80);

        Object[] objList = new Object[2]; // 어떠한 객체든 저장 가능
        objList[0] = new Student("김둘리", 90);
        objList[1] = new Student("박또치", 80);
    }
}
