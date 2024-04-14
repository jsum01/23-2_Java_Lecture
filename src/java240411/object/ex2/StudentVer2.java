package java240411.object.ex2;

/* equals만 오버라이딩 */
public class StudentVer2 {

    private  String name;
    private final int score;

    public StudentVer2(String n, int s) { // 여기서는 다른 생성자처럼 필드변수명 통일 안 시키고 this 사용하지 않는 이유
        name = n; score = s;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        StudentVer2 std2 = (StudentVer2) obj; // ver4로 캐스팅
        return name.equals(std2.name) && score == std2.score; // 이름과 점수가 같으면 동일한 것으로
    }
}