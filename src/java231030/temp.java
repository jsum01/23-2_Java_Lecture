package java231030;
import java.util.Scanner;

public class temp {
    static Scanner sc = new Scanner(System.in); // Scanner를 전역적으로 선언

    public static int[] makeArray() {
        int su;
        int[] data;

        System.out.print("학생 수 : ");
        su = sc.nextInt();
        data = new int[su];

        return data;
    }

    public static void inputting(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print((i+1) + "범 점수 : ");
            data[i] = sc.nextInt();
        }
    }

    public static void printting(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println((data.length - i) + "등 점수 : " + data[i]);
        }
    }

    public static void main(String[] args) {
        int[] score;
        score = makeArray();

        inputting(score);

        printting(score);
    }
}
