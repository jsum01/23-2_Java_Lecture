package java231030;

public class Args {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println(args.length); // 인수의 개수를 출력

        for (String temp : args) {
            sum += Integer.parseInt(temp); // 각 인수를 정수로 변환하여 합계를 구함
        }
        System.out.println("합계: " + sum); // 합계를 출력
    }
}
