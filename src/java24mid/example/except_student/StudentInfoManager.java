package java24mid.example.except_student;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentInfoManager {


    public static void main(String[] args) {

        final String NAME_REGEX = "^[a-zA-Z가-힣]*$";
        final String JUMIN_REGEX = "^[0-9]{6}-[0-9]{7}";

        System.out.println("====학생 정보를 입력하십시오.====");

        // 학생 객체 생성
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                // 이름 입력 검사
                System.out.println("이름을 입력하십시오.");
                String name = sc.nextLine();
                if (Pattern.matches(NAME_REGEX, name))
                    student.setName(name);
                else
                    throw new InfoException("이름 형식에 맞지 않습니다.");
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                // 주민번호 입력 검사
                System.out.println("주민등록번호를 입력하십시오.");
                String jumin = sc.nextLine();
                if (Pattern.matches(JUMIN_REGEX, jumin))
                    student.setJumin(jumin);
                else
                    throw new InfoException("주민번호 형식에 맞지 않습니다.");
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        }

        // 입력받은 정보 출력
        System.out.println("학생 정보:");
        System.out.println("이름: " + student.getName());
        System.out.println("주민등록번호: " + student.getJumin());
    }
}
