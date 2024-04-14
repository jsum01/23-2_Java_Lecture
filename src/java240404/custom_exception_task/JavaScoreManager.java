package java240404.custom_exception_task;

import java.util.Scanner;

public class JavaScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int score = sc.nextInt();

            if(score >= 0 && score <= 100) {
                System.out.println("JavaScore: " + score);
            } else {
                throw new RangeScoreException("0 ~ 100 사이의 점수가 입력되어야 합니다.");
            }
        } catch (RangeScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
