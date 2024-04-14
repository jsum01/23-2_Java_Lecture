package java24mid.review.interfaces;

public class Apple extends Corporations{

    public static void main(String[] args) {
        Corporations apple = new Corporations("Apple");

        System.out.println(String.format("제조사 %s", apple.getName()));
        apple.booting();
        apple.shutdown();
    }
}
