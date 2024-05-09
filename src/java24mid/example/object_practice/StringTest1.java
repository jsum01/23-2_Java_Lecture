package java24mid.example.object_practice;

public class StringTest1 {

    public static void main(String[] args) {

        String n1 = new String("엄둘리"); // 1
        String n2 = new String("엄둘리"); // 2
        // 1번 객체와 2번 객체는 메모리 공간에 각각 생성되고, n1과 n2는 각각의 주소를 담고 있기 때문에 비교하면 다르다고 뜨는 것이다.
        String n3 = "엄둘리"; // 3
        String n4 = "엄둘리"; // 4

        if (n1 == n2)
            System.out.println("n1과 n2의 주소는 같다");
        else
            System.out.println("n1과 n2의 주소는 다르다");

        if (n2 == n3)
            System.out.println("n2와 n3의 주소는 같다");
        System.out.println("n2와 n3의 주소는 다르다");

        if (n3 == n4)
            // 3번과 4번의 String(문자열) 객체를 생성하면 자바는 '리터럴 영역'이라는 별도의 메모리를 사용한다.
            // 따라서, 리터럴 형태의 새로운 문자열을 생성하려고 하면
            // JVM은 우선 리터럴만 모여 있는 메모리 공간에서 동일한 문자열 객체가 있는지 검색한다.
            // 만약 생성하려는 문자열이 전혀 새로운 문자열이라면 새로운 공간에 객체를 생성하지만,
            // 이미 존재하는 문자열이라면 기존 객체의 주소만 복사하여 재사용한다.
            System.out.println("n3와 n4의 주소는 같다");
        else
            System.out.println("n3와 n4의 주소는 다르다");

    }
}
