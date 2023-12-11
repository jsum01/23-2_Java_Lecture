package java231204;

public class Actice01 {
    public static void main(String[] args) {
        SuperClass_Point p = new SuperClass_Point();
        p.setXY(100, 200);
        p.showXY();
        SubClass_ColorPoint cp = new SubClass_ColorPoint();
        cp.setColorXY(100, 200, "red");
        cp.showColorXY();
    }
}
