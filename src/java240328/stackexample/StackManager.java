package java240328.stackexample;

import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringStack st = new StringStack();

        while (true) {
            System.out.println("도시 이름: ");
            String str = sc.nextLine();
            if(!st.push(str)) break; //공간이 없다면 중단
        }

        // 출력
        while (st.length() > 0) { // 데이터가 남아있다면
            System.out.println(st.pop()); // 꺼내서 출력
        }
    }
}
