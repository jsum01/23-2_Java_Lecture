package java24mid.review.interfaces;

public class Corporations implements ManufacturingCorIF {
    private String name = "";

    public Corporations() {};

    public Corporations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void booting() {
        System.out.println("시스템이 가동됩니다.");
    }

    public void shutdown() {
        System.out.println("시스템이 종료됩니다.");
    }
}
