package java240328.stdgamer;

public class InterfaceExample {
    public static void main(String[] args) {
        Student s = new Student("엄지석", 90);
        Gamer t;
        t = s;

        s.doGame();
        System.out.println(s.name);
    }
}
