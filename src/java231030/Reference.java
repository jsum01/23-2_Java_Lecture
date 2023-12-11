package java231030;
import java.util.Scanner;

public class Reference {
    // 입력부
    public static void inputing(int[] data) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < data.length; i++) {
            System.out.print((i+1) + "번 점수 : ");
            data[i] = sc.nextInt(); // input : 배열에 값을 할당/수정하는 경우(배열에 변화가 생기는 경우-for)
        }

        sc.close();
        return;
    }
    //처리부
    public static int calSum(int[] data) {
        int sum = 0;
        for(int t : data)
            sum += t; // read : 배열에 있는 값을 사용하는 경우(for-each)

        return sum; //합계를 반환
    }
    //동작부
    public static void main(String[] args) {
        int[] score = new int[5];

        inputing(score);

        calSum(score);

        System.out.println("합계 : " + calSum(score) );
    }
}
