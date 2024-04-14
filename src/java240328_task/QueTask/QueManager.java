package java240328_task.QueTask;

import java.util.Scanner;

public class QueManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringQue stringQueue = new StringQue();
        IntegerQue integerQueue = new IntegerQue();
        DoubleQue doubleQueue = new DoubleQue();

        String input;
        do {
            System.out.println("값 입력 (정수, 실수, 문자열 중 하나 입력, 종료하려면 'exit' 입력): ");
            input = sc.nextLine();
            switch (input.toLowerCase()) {
                case "exit":
                    break;
                case "정수":
                    System.out.println("정수 입력: ");
                    int intValue = Integer.parseInt(sc.nextLine());
                    integerQueue.offer(intValue);
                    break;
                case "실수":
                    System.out.println("실수 입력: ");
                    double doubleValue = Double.parseDouble(sc.nextLine());
                    doubleQueue.offer(doubleValue);
                    break;
                case "문자열":
                    System.out.println("문자열 입력: ");
                    String stringValue = sc.nextLine();
                    stringQueue.offer(stringValue);
                    break;
                default:
                    System.out.println("올바른 입력이 아닙니다.");
            }
        }
        while (!input.toLowerCase().equals("exit"));

        System.out.println("정수 큐의 크기: " + integerQueue.size());
        System.out.println("실수 큐의 크기: " + doubleQueue.size());
        System.out.println("문자열 큐의 크기: " + stringQueue.size());

        System.out.println("정수 큐 출력:");
        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.poll());
        }

        System.out.println("실수 큐 출력:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.poll());
        }

        System.out.println("문자열 큐 출력:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
