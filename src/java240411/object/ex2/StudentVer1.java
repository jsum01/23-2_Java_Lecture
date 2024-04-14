package java240411.object.ex2;

public class StudentVer1 {

    private  String name;
    private int score;

    public StudentVer1(String n, int s) { // 여기서는 다른 생성자처럼 필드변수명 통일 안 시키고 this 사용하지 않는 이유
        name = n; score = s;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
