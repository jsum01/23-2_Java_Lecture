package javatask;

import java.util.ArrayList;
import java.util.Scanner;

// 부모 클래스로 도형 클래스 정의
abstract class Shape {
    protected ArrayList<Integer> x;
    protected ArrayList<Integer> y;
    Scanner sc = new Scanner(System.in);

    public Shape() {
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
    }

    public void getCoordinates(int XYnum) {
        for(int i = 0; i < XYnum; i++) {
            System.out.print((i + 1) + "번째 좌표의 x좌표: ");
            x.add(sc.nextInt());
            System.out.print((i + 1) + "번째 좌표의 y좌표: ");
            y.add(sc.nextInt());
        }
    }

    // 각 도형의 둘레를 계산하는 메소드, 하위 클래스에서 오버라이딩할 것
    public double calculatePerameter() { // 추상 메서드로 사용하는 게 더 적절해 보임 <- 질문
        return 0.0;
    }
}
