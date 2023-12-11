package java231204;

public class SubClass_ColorPoint extends SuperClass_Point {
    String color;
    void setColorXY(int x, int y, String color) {
        setXY(x, y);
        this.color = color;
    }
    void showColorXY() {
        System.out.print(color);
        showXY();
    }
}
