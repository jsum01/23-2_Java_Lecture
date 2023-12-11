package javatask;

import java.util.ArrayList;

public class GetCircle {
    private ArrayList<Integer> x;
    private ArrayList<Integer> y;

    public GetCircle(ArrayList<Integer> x, ArrayList<Integer> y) { //배열로 전달했기 때문에 배열로 받는다(동적이기 떄문에 동적으로)
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        // 두 점 간의 거리 -> 반지름으로
        int x1 = x.get(0);
        int y1 = y.get(0);
        int x2 = x.get(1);
        int y2 = y.get(1);
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double printParameter() {
        double radius = getRadius();
        return 2 * Math.PI * radius;
    }
}

