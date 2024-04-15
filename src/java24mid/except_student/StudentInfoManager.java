package java24mid.except_student;

import java.util.Scanner;

public class StudentInfoManager extends Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====학생 정보를 입력하십시오.====");

        // 학생 객체 생성
        Student student = new Student();


        /** 이름 입력 및 검사*/
        while (true) {
            System.out.println("이름을 입력하십시오.");
            String name = sc.nextLine();
            if(student.setName(name)) break;
        };

        /** 주민등록번호 입력 및 검사*/
        while (true) {
            System.out.println("주민등록번호를 입력하십시오.");
            String jumin = sc.nextLine();
            if(student.setJumin(jumin)) break;
        };

        // 입력받은 정보 출력
        System.out.println("학생 정보:");
        System.out.println("이름: " + student.getName());
        System.out.println("주민등록번호: " + student.getJumin());
    }
}
