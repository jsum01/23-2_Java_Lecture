package java240404.example;

/** Detail 먼저 에러처리하고 Batch에러를 처리한다. */
public class BatchExExample {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("불능...0으로 나눌 수 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("불능...정수 외 다른 형식을 입력하였습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("불능...값을 입력해야 합니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
            System.out.println(e.getMessage());
        }
    }
}
