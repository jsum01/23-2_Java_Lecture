package java231215;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LibManagerApp {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> bookList = new ArrayList<Book>(); // Book이라는 클래스를 활용한 동적 배열 생성

    static int menu() {
        System.out.println("=-=-= Menu =-=-=");
        System.out.println("|    1. 등록    |");
        System.out.println("|    2. 삭제    |");
        System.out.println("|    3. 검색    |");
        System.out.println("|    4. 수정    |");
        System.out.println("|    5. 대출    |");
        System.out.println("|    6. 반납    |");
        System.out.println("|    7. 목록    |");
        System.out.println("|    8. 종료    |");
        System.out.println("=-=-=-=-=-=-==-=");
        System.out.print("입력:");

        return Integer.parseInt(sc.nextLine()); // 입력 값을 정수로 변환하여 반환
    }

    // 삽입하는 메서드
    static void insert() {

        int bookNum, price;
        String title, publisher, pubDate, telNum, author, isbn, issn;

        author = isbn = issn = null; // 초기값을 Null로 설정

        System.out.println("1. 단행본");
        System.out.println("2. 잡지");
        System.out.println("선택: ");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("제목: ");
        title = sc.nextLine();
        if( choice == 1 ) {
            System.out.print("저자: ");
            author = sc.nextLine();
        }
        System.out.print("출판사: ");
        publisher = sc.nextLine();
        System.out.print("가격: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("출판일: ");
        pubDate = sc.nextLine();
        System.out.print("연락처: ");
        telNum = sc.nextLine();
        if (choice == 1) {
            System.out.print("isbn: ");
            isbn = sc.nextLine();
        } else {
            System.out.println("issn: ");
            issn = sc.nextLine();
        }

        Random rand = new Random();
        bookNum = rand.nextInt(1000);
        if(choice == 1) {
            bookList.add(new TextBook(bookNum, title, publisher, price, pubDate, telNum, author, isbn));
        } else {
            bookList.add(new Megazine(bookNum, title, publisher, price, pubDate, telNum, issn));
        }
        System.out.println("도서 등록이 완료되었습니다.");
    }

    // 책 정보 입력
    static void list() {
        Book item;

        for(int i = 0; i < bookList.size(); i++) {
            item = bookList.get(i);
            System.out.println( "번호: " + item.getBookNum() );
            System.out.println( "제목: " + item.getTitle() );
            if(item instanceof TextBook)
                System.out.println( ((TextBook) item).getAuthor() );
            else
                System.out.println();
            System.out.println( "출판사: " + item.getPublisher() );
            System.out.println( "가격: " + item.getPrice() );
            System.out.println( "출판일: " + item.getPubDate() );
            System.out.println( "연락처: " + item.getTelNum() );
            if(item instanceof TextBook)
                System.out.println( "국제표준 도서번호 " + ((TextBook) item).getIsbn() );
            else
                System.out.println( "국제표준 직렬번호 " + ((Megazine) item).getIssn() );
        }
    }

    // 책 검색 메소드
    static void findList(String title) {
        Book item;

        for(int i = 0; i < bookList.size(); i++) {
            item = bookList.get(i);
            if( item.getTitle().indexOf(title) == 0 ) { // 문자열에서 해당 글자가 들어있는지 안 들어있는지 확인하는 메서드: Indexof
                System.out.println( "번호: " + item.getBookNum() );
                System.out.println( "제목: " + item.getTitle() );
            }
            else {
                continue;
            }
        }
    }

    static void removeBook(int num) {
        Book item;

        for(int i = 0; i < bookList.size(); i++) {
            item = bookList.get(i);
            if (item.getBookNum() == num) // 책 번호가 같다면
                bookList.remove(i); // 삭제
            else
                System.out.println("찾으시는 책이 없습니다.");
        }

    }

    // 삭제
    static void remove() {
        String findTitle;

        System.out.println("삭제할 도서의 제목을 입력하십시오.");
        findTitle = sc.nextLine();

        findList(findTitle); // 책을 찾는 메소드
        System.out.println("삭제할 도서의 번호를 입력하십시오.");
        int bNum = Integer.parseInt(sc.nextLine());
        removeBook(bNum);
    }

    public static void main(String[] args) {

        System.out.println("도서 관리 프로그램을 사용해주셔서 감사합니다!");

        while(true) {
            switch (menu()) {
                case 1:
                    insert();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 0:
                    System.exit(0);
                default:
                    System.out.println("입력하신 메뉴는 없는 메뉴입니다.");
            }
        }
    }
}
