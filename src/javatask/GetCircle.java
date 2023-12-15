package javatask;

import java.util.Scanner;

class GetCircle extends Shape {
    private int radius;

    public GetCircle() {
        super();
    }

    @Override
    public void getCoordinates(int XYnum) {
        super.getCoordinates(1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름: ");
        radius = scanner.nextInt();
    }

    @Override
    public double calculatePerameter() {
        return 2 * Math.PI * radius;
    }
}