package java231204;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("'-'로 구분하여 전화번호를 작성하시오");
        String str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str, "-"); // 구분자까지 포함하기 떄문에 stk.countTokens() = 5 가 된다.

        String newstr = "";


        System.out.println(stk.countTokens());
        while (stk.hasMoreTokens()) {
//            System.out.println(stk.nextToken());
//            System.out.println(stk.countTokens());
            newstr += stk.nextToken();
            if(stk.hasMoreTokens()) // 뒤에 토큰이 더 남아 있다면
                newstr += "/"; // /를 붙인다.
        }
        System.out.println(newstr);

        sc.close();
    }
}
