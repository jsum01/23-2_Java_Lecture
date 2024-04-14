package java240328.stdgamer;

public class Student implements Gamer {
    String name;
    int score;

    Student(String n, int l) {
        name = n;
        score = l;
    }

    @Override
    public void doGame() {
        System.out.println(name + "(이)가 게임을 합니다.");
    }
}
