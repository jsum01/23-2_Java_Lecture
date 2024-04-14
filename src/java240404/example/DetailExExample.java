package java240404.example;

public class DetailExExample {
    public static void main(String[] args) {
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("불능...0으로 나눌 수 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("불능...정수 외 다른 형식을 입력하였습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("불능...값을 입력해야 합니다.");
        }

    }
}
