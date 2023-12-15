package javatask;

import java.util.Scanner;
/*
    과제 1
    - 클래스 3개(멤버 변수, 메소드 개념 활용)
    - 원, 사각형, 삼각형
    - 메인에서 메뉴를 통해 각 클래스에 접근하여 결과를 도출
 */
/*
    과제 2
    - 상속의 개념을 최대한 활용해서 리팩토링
    - 오버라이딩, 오버로딩의 개념을 최대한 활용
*/
public class GetFigure {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
        System.out.println("다음 중 둘레를 구하고 싶은 도형을 선택하십시오.");
        System.out.println("1. 원");
        System.out.println("2. 사각형");
        System.out.println("3. 삼각형");
        System.out.println("0. 종료");
        System.out.print(": ");

        choice = sc.nextInt();

        Shape shape = null;

        // 1. 인스턴스 생성
        // 2. 좌표 get
        // 3. 출력
        switch (choice) {
            case 1:
                GetCircle circle = new GetCircle();
                circle.getCoordinates(1);
                System.out.println("원의 둘레: " + circle.calculatePerameter());
                break;
            case 2:
                GetSquare square = new GetSquare();
                square.getCoordinates(2);
                System.out.println("사각형의 둘레: " + square.calculatePerameter());
                break;
            case 3:
                GetTriangle triangle = new GetTriangle();
                triangle.getCoordinates(3);
                System.out.println("삼각형의 둘레: " + triangle.calculatePerameter());
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("올바른 메뉴를 선택하세요.");
                continue;
        }
    } while (choice != 0);

    sc.close();
}
}
