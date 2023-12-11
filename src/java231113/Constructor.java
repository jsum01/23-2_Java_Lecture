package java231113;

public class Constructor{
    private static Constructor instance = new Constructor();
    private String name;
    private int score;

    Constructor() {

    }

    public static Constructor getInstance() {
        return instance;
    }

    void print() {
        System.out.println(name);
        System.out.println(score);
    }

    void setName(String v) {
        name = v;
    }
    String getName() {
        return name;
    }
    void setScore(int v) {
        score = v;
    }
    int getScore() {
        return score;
    }

}
