package java240411.object.ex2;

/* hashCode와 equals 오버라이딩*/
import java.util.Objects;

public class StudentVer4 {

    private  String name;
    private int score;

    public StudentVer4(String n, int s) { // 여기서는 다른 생성자처럼 필드변수명 통일 안 시키고 this 사용하지 않는 이유
        name = n; score = s;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // hash와 hashCode?
    }
    @Override
    public boolean equals(Object obj) {
        StudentVer4 std4 = (StudentVer4) obj; // ver4로 캐스팅
        return name.equals(std4.name) && score == std4.score; // 이름과 점수가 같으면 동일한 것으로
    }
}