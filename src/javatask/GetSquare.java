package javatask;

public class GetSquare extends Shape {

    public GetSquare() {
        super();
    }

    @Override
    public double calculatePerameter() {
        return 2 * (Math.abs(x.get(0) - x.get(1)) + Math.abs(y.get(0) - y.get(1)));
    }
}

