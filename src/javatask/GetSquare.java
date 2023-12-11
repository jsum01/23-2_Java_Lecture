package javatask;

import java.util.ArrayList;

public class GetSquare {
    private ArrayList<Integer> x;
    private ArrayList<Integer> y;

    public GetSquare(ArrayList<Integer> x, ArrayList<Integer> y) {
        this.x = x;
        this.y = y;
    }

    public void CatchException() {

    }

    public double printPerimeter() {
        // 각 변의 길이를 계산하여 둘레를 구함(일직선이 되는 경우를 예외처리 해야 함)
        double side1 = Math.sqrt(Math.pow(x.get(1) - x.get(0), 2) + Math.pow(y.get(1) - y.get(0), 2));
        double side2 = Math.sqrt(Math.pow(x.get(2) - x.get(1), 2) + Math.pow(y.get(2) - y.get(1), 2));
        double side3 = Math.sqrt(Math.pow(x.get(3) - x.get(2), 2) + Math.pow(y.get(3) - y.get(2), 2));
        double side4 = Math.sqrt(Math.pow(x.get(0) - x.get(3), 2) + Math.pow(y.get(0) - y.get(3), 2));

        return side1 + side2 + side3 + side4;
    }
}

