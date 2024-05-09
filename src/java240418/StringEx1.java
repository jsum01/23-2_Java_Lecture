package java240418;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringEx1 {
    public static void main(String[] args) {
        System.out.println("사용하는 기본 엔/디코딩 방식:" + Charset.defaultCharset());

        byte[] bt = {65, 66, 67, 68};
        String str = new String(bt);
        System.out.println(str);

        // 8 ABCD
        byte[] temp = "ABCD".getBytes();
        System.out.println("인코딩 ver");
        for(int i = 0; i< temp.length; i++){
            System.out.println("UTF-8 : " + temp[i] + " ");
        }
        System.out.println("원본 : " + new String(temp) + " ");
        System.out.println();

        // 16 ABCD
        byte[] temp1 = "ABCD".getBytes(StandardCharsets.UTF_16);
        System.out.println("인코딩 ver");
        for(int i = 0; i< temp1.length; i++) {
            System.out.println("UTF-16 : " + temp1[i] + " ");
        }
        System.out.println("원본 : " + new String(temp1));
        System.out.println("원본 UTF_16으로 디코딩 : " + new String(temp1, StandardCharsets.UTF_16));
        System.out.println();

        // 16 대한민국
        byte[] temp2 = "대한민국".getBytes(StandardCharsets.UTF_16);
        System.out.println("인코딩 ver");
        for(int i = 0; i< temp2.length; i++) {
            System.out.println("UTF-16 : " + temp2[i] + " ");
        }
        System.out.println("원본 : " + new String(temp2));
        System.out.println("원본 UTF_16으로 디코딩 : " + new String(temp2, StandardCharsets.UTF_16));
        System.out.println();

        byte[] euckr = "대한민국".getBytes(Charset.forName("EUC-KR"));
        for(int i = 0; i < euckr.length; i++) {
            System.out.println("EUC-KR : " + euckr[i]);
        }
        System.out.println("원본 : " + new String(euckr));
        System.out.println("원본을 utf-8로 변환 : " + new String(euckr, Charset.forName("UTF-8")));
        System.out.println();


    }
}
