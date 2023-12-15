package java231215;

public class TextBook extends Book {

    private String author; // 저자
    private String isbn; //


    public TextBook(int bookNum, String title, String publisher, int price, String pubDate, String telNum, String author, String isbn) {
        super(bookNum, title, publisher, price, pubDate, telNum);
        this.author= author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
