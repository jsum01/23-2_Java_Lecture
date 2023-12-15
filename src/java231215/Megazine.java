package java231215;

public class Megazine extends Book {

    private String issn;


    public Megazine(int bookNum, String title, String publisher, int price, String pubDate, String telNum, String issn) {
        super(bookNum, title, publisher, price, pubDate, telNum);
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
