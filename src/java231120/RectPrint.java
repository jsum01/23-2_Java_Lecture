package java231120;

import java.util.Scanner;

public class RectPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect[] r;
        r = new Rect[5];

        int width = sc.nextInt();
        int height = sc.nextInt();

        for(int i = 0; i < r.length; i++) {
            r[i] = new Rect(width, height);
        }

    }
}
