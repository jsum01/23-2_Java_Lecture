package javatask;

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        getCoordinates(1);
        System.out.print("원의 반지름: ");
        radius = scanner.nextInt();
    }
    @Override
    public void getCoordinates(int XYnum) {
        System.out.print("원의 중심 좌표 x: ");
        x.add(scanner.nextInt());
        System.out.print("원의 중심 좌표 y: ");
        y.add(scanner.nextInt());
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
