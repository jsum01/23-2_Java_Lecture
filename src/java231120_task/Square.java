package java231120_task;

class Square extends Shape {

    public Square() {
        super();
        getCoordinates(2);
    }

    @Override
    public double calculatePerimeter() {
        double sideX = Math.abs(x.get(1) - x.get(0));
        double sideY = Math.abs(y.get(1) - y.get(0));
        return 2 * (sideX + sideY);
    }
}