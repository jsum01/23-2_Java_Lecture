package java24mid.example.object_practice;

import java.util.Objects;

public class Student { // compile -> exrends java.lang.Object <- 자동으로 생성
    private String name;
    private int score;

    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean equals(Object stdObj) {
        Student std = (Student) stdObj;
        return this.name == std.name && this.score == std.score;
    }

    public int hashCode() {
        return Objects.hash(name, score);
    }

    public String toString() {
        return "학생의 이름(name)은:" + name + ", 점수(score)는: " + score + "입니다.";
    }
}

