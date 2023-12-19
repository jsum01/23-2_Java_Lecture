package miniSungdong;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManageUsers {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Users> userList = new ArrayList<Users>();

    static int menu() {
        System.out.println("==========Menu==========");
        System.out.println("1. 고객 등록");
        System.out.println("2. 고객 삭제");
        System.out.println("3. 특정 고객 정보 확인");
        System.out.println("4. 전체 고객 명단 출력(최대 10개)");
        System.out.println("0. 고객 관리 프로그램 종료");
        System.out.println("========================");

        return Integer.parseInt(sc.nextLine());
    }

    static void insert() {
        int id; // 고유 아이디
        String name; // 고객명
        int age; // 고객 나이
        int userType; // 고객 유형
        LocalDateTime joined; // 가입일
        int discount_rate; // 할인률
        int customer_type, suplier_type; // 자식 클래스 요소

        System.out.println("==========고객등록==========");
        System.out.println("> 고객유형(1. Customer | 2. Supplier) :  ");
        userType = Integer.parseInt(sc.nextLine());

        System.out.println("> 이름: ");
        name = sc.nextLine();
        System.out.println(name);

        System.out.println("> 나이: ");
        age = Integer.parseInt(sc.nextLine());

        // 자동 할당 값들
        Random rand = new Random();
        id = rand.nextInt(1000);

        joined = LocalDateTime.now();

        if (userType == 1) { // 고객 유형이 1이라면 소비자 테이블에,
            discount_rate = 10;
            System.out.println("소비자 유형(1. 개인 | 2. 회사) : ");
            customer_type = Integer.parseInt(sc.nextLine());
            userList.add(new Customer(id, name, age, joined, userType, discount_rate, customer_type));
        } else if (userType == 2) { // 고객 유형이 2라면 납품자 테이블에 삽입.
            discount_rate = 20;
            System.out.println("납품자 유형(1. 개인 | 2. 회사) : ");
            suplier_type = Integer.parseInt(sc.nextLine());
            userList.add(new Supplier(id, name, age, joined, userType, discount_rate, suplier_type));
        }
        System.out.println("고객 등록이 완료되었습니다.");
    }

    static void remove() {

    }

    static void printUser() {

    }

    static void printList() {
        Users item;
        System.out.println("1. 소비자 리스트 2. 납품자 리스트 어느 리스트를 확인하시겠습니까?");
        int selectUsertype = Integer.parseInt(sc.nextLine());

        if (selectUsertype == 1) {
            String listType = "소비자 리스트";
            System.out.println("===================" + listType + "===================");
            for (int i = 0; i < userList.size(); i++) {
                item = userList.get(i);
                if(item instanceof Customer) {
                    Customer customer = (Customer) item;
                    System.out.println("| 아이디: " + customer.getId() + " | 이름: " + customer.getName() + " | 나이: " + customer.getAge() + " | 가입일: " + customer.getJoined() + " | 할인률: " + customer.getDiscount_rate() + " |");
                }
            }
        } else if (selectUsertype == 2) {
            String listType = "납품자 리스트";
            System.out.println("===================" + listType + "===================");
            for (int i = 0; i < userList.size(); i++) {
                item = userList.get(i);
                if(item instanceof Supplier) {
                    Supplier supplier = (Supplier) item;
                    System.out.println("| " + supplier.getId() + " | " + supplier.getName() + " | " + supplier.getAge() + " | " + supplier.getJoined() + " | " + supplier.getDiscount_rate() + " |");
                }
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("고객 관리 프로그램 UM(User Manager)입니다. 환영합니다.");
        // 실질적 고객 관리 프로그램
        do {
            switch (menu()) {
                case 1: insert();
                    break;// 고객 등록
                case 2: remove();
                    break;// 고객 삭제
                case 3: printUser();// 특정 고객 정보 확인
                    break;
                case 4: printList();// 전체 고객 명단 출력(최대 10개)
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("해당되는 메뉴만을 선택해주십시오.");
            }
        } while (true);
    }
}
