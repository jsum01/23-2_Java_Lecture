package java24mid.example.shape_mamagement;

public interface FigureFeature {
    /**
     * 도형의 좌표를 구담는 메소드입니다.
     * @param x
     * @param y
     */
    void getCoordinate(float x, float y);

    /**
     * 도형의 면적을 구하는 메소드입니다.
     */
    void getArea();

    /**
     * 도형의 둘레를 구하는 메소드입니다.
     */
    void getRound();

    /**
     * 어떤 도형인이 알아내는 메소드입니다.
     */
    void getFigure();
}
