package java24mid.review.exception.score;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 점수 입력 */
        System.out.println("점수를 입력하세요. 단, 0~100 범위 내여야 합니다.\n: ");
        try{
            int score = sc.nextInt();
            if(score >= 0 && score <= 100) {
                System.out.println(String.format("%d점이 입력되었습니다", score));
            } else {
                throw new ScoreRangeException("0~100 사이의 점수가 입력되어야 합니다.");
            }
        } catch (ScoreRangeException e) {
            System.out.println(e.getMessage());
        }


    }
}
