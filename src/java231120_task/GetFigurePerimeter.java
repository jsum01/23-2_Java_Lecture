package javatask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetFigurePerimeter {
    static Scanner sc = new Scanner(System.in);

    static int menu() {
        System.out.println("=-=-=-=-= Menu =-=-=-=-=");
        System.out.println("|         1. 원         |");
        System.out.println("|         2. 삼각형      |");
        System.out.println("|         3. 사각형      |");
        System.out.println("|         0. 종료       |");
        System.out.println("=-=-=-=-= =-=- =-=-=-=-=");
        System.out.println("다음 중 둘레를 구하고 싶은 도형을 선택하십시오.");

        try {
            return Integer.parseInt(sc.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
            return -1; // 잘못된 입력을 나타내는 값
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            choice = menu();
            Shape shape = null;

            switch (choice) {
                case 1:
                    shape = new Circle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                case 3:
                    shape = new Square();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    continue;
            }

            if (shape != null) {
                System.out.println("도형의 둘레: " + shape.calculatePerimeter());
            }

        } while (choice != 0);

        sc.close();
    }
}