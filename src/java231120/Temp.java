package java231120;

import java.sql.SQLOutput;

public class Temp {

    static String schName = "Ulsan Collage";
    String name;
    String score;

    static {
        System.out.println("S T A T I C");
    }

    Temp() {
        System.out.println("저는 임시 생성자입니다.");
    }

    void printing() {
        System.out.println(name + ":" + score);
    }

//    메인
    /*
    public static void main(String[] args) {

    }
    */
}
