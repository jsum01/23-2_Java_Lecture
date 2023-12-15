package javatask;

public class GetTriangle extends Shape {

    public GetTriangle() {
        super();
    }

    @Override
    public double calculatePerameter() {
        double side1 = Math.sqrt(Math.pow(x.get(1) - x.get(0), 2) + Math.pow(y.get(1) - y.get(0), 2));
        double side2 = Math.sqrt(Math.pow(x.get(2) - x.get(1), 2) + Math.pow(y.get(2) - y.get(1), 2));
        double side3 = Math.sqrt(Math.pow(x.get(0) - x.get(2), 2) + Math.pow(y.get(0) - y.get(2), 2));
        return side1 + side2 + side3;
    }
}
