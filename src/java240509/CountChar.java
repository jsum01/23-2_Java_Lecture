package java240509;

import java.util.Scanner;
/*
* 문자열 계산기
* 프로그램 동작
* 문자열 : (input) <- 알파벳만
* 출력 : input에 각각 알파벳이 몇개씩 존재하는지 출력
* */

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요");
        System.out.print(": ");
        String str = sc.nextLine(); // input
        String lower_str = str.toLowerCase();
        // counting : a to z
        int counting; // initialized
        for(int i = 97; i < 122; i++) {
            counting = 0;
            // a to z
            for (int j = 0; j < lower_str.length(); j++) {
                if(i == lower_str.charAt(j)) counting++;
            }
            if(counting > 0)
            System.out.println((char)i + ": " + counting);
        }
    }
}
