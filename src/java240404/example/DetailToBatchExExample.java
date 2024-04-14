package java240404.example;

public class DetailToBatchExExample {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
            System.out.println(e.getMessage());
        }
    }
}
