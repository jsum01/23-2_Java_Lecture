package javatask;

import java.util.ArrayList;
import java.util.Scanner;

// 부모 클래스로 도형 클래스 정의
class Shape {
    protected ArrayList<Integer> x;
    protected ArrayList<Integer> y;
    protected Scanner scanner;

    public Shape() {
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void getCoordinates(int XYnum) {
        for (int i = 0; i < XYnum; i++) { // 예외처리가 질문 필요
            System.out.print((i + 1) + "번째 좌표의 x좌표: ");
            x.add(scanner.nextInt());
            System.out.print((i + 1) + "번째 좌표의 y좌표: ");
            y.add(scanner.nextInt());
        }
    }

    public double calculatePerimeter() {
        return 0.0;
    }


    // getter setter를 활용한 코드로 변경해보기
}