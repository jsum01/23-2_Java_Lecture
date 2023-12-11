package java231113;

public class Printing {

    public static void main(String[] args) {
        Constructor ct = Constructor.getInstance();
        ct.setScore(97);
        ct.setName("Jiseok");
        System.out.println(ct.getScore());
        ct.print();
    }
}

