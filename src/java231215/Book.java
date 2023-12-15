package java231215;

public class Book {
    int bookNum;
    String title;
    String publisher;
    int price;
    String pubDate;
    String telNum;

    public Book(int bookNum, String title, String publisher, int price, String pubDate, String telNum) {
        super();
        bookNum = bookNum;
        title = title;
        publisher = publisher;
        price = price;
        pubDate = pubDate;
        telNum = telNum;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
