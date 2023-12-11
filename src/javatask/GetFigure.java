package javatask;

import java.util.ArrayList;
import java.util.Scanner;
/* 문제
- 클래스 3개(멤버 변수, 메소드 개념 활용)
    - 원
    - 사각형
    - 삼각형
- 메인에서 메뉴를 통해 각 클래스에 접근하여 결과를 도출
 */
public class GetFigure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메모리를 효율적으로 사용하기 위해 최대 크기 좌표 배열의 크기를 4로 지정하는 게 아니라 동적배열을 채택
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        while (true) {
            System.out.println("다음 중 둘레를 구하고 싶은 메뉴를 선택하시오.");
            System.out.println("===== Menu =====");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. 종료");
            System.out.println("===== ==== =====");
            System.out.print(": ");

            int choice = sc.nextInt();
            /*현재 문제점
            : 좌표가 일직선인 경우의 수도 계산하기 떄문에 온전히 사각형, 삼각형의 좌표를 구할 수 없다.
            예외처리 예정
            */
            switch (choice) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        System.out.println((i + 1) + "번째 점의 x좌표: ");
                        x.add(sc.nextInt());
                        System.out.println((i + 1) + "번째 점의 y좌표: ");
                        y.add(sc.nextInt());
                    }
                    GetCircle gc = new GetCircle(x, y);
                    System.out.println("둘레: " + gc.printParameter());
                    break;
                case 2:
                    for (int i = 0; i < 4; i++) {
                        System.out.println((i + 1) + "번째 점의 x좌표: ");
                        x.add(sc.nextInt());
                        System.out.println((i + 1) + "번째 점의 y좌표: ");
                        y.add(sc.nextInt());
                    }
                    GetSquare gs = new GetSquare(x, y);
                    System.out.println("둘레: " + gs.printPerimeter());
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + "번째 점의 x좌표: ");
                        x.add(sc.nextInt());
                        System.out.println((i + 1) + "번째 점의 y좌표: ");
                        y.add(sc.nextInt());
                    }
                    GetTriangle gt = new GetTriangle(x, y);
                    System.out.println("둘레: " + gt.printPerimeter());
                    break;
                case 4:
                    System.out.println("종료되었습니다.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }

            // 입력 받은 좌표 초기화
            x.clear();
            y.clear();
        }
    }
}
