package java231204;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IO_Buffer_Ex01 {
    public static void main(String[] args) throws IOException {
        // 숫자를 나열
        // 정수값으로 변환하여 배열에 저장

        // 1. Scanner 사용
        Scanner sc = new Scanner(System.in);

        String str;
        int[] data;
        data = new int[5];
        /*for (int i = 0; i < 5; i++) {
            data[i] = sc.nextInt();
        }
        for (int temp : data) {
            System.out.print(temp + " " );
        }
        System.out.println();

        sc.close();*/


        // 2. BufferedRead 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // input
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // output

        str = br.readLine();
        StringTokenizer stk = new StringTokenizer(str);
        data = new int[stk.countTokens()]; // 토큰의 개수만큼 입력받을 수 있는 배열이 생성되게 된다.

        for(int i = 0; i < stk.countTokens(); i++) {
            data[i] = Integer.parseInt(stk.nextToken());
        }

        for(int temp: data) {
//            System.out.print(temp + " ");
            bw.write(temp + " "); // 버퍼에 작성 -> bw.write(temp)로 하면 안 되고, temp + " "를 해야 출력이 제대로 되는 이유를 알아보자.
        }
//        System.out.println();
        bw.flush(); // 화면에 출력
        bw.close(); // 종료

        /*
        11 22 33 44 55를 입력했을 때, 예상 출력값은
        11 22 33 44 55이다. 하지만, 실제 출력값은
        11 22 33 0 0이다.
        왜 그럴까?
        nextToken으로 빼내오면 버퍼 개수가 5개에서 4개로 4개에서 3개로 줄어들기 때문에 3개가 입력되는 순간 멈추는 것이다.
        */

    }
}
