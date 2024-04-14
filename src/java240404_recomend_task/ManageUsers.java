package ManageUser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManageUsers {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Users> userList = new ArrayList<Users>();

    static Users user;

    static String search_name;

    static
    boolean found = false;

    static int menu() {
        System.out.println("================Menu================");
        System.out.println("1. 고객 등록");
        System.out.println("2. 고객 삭제");
        System.out.println("3. 특정 고객 정보 수정");
        System.out.println("4. 특정 고객 정보 검색");
        System.out.println("5. 소비자 고객 명단 출력");
        System.out.println("6. 납품자 고객 명단 출력");
        System.out.println("7. 전체 고객 명단 출력");
        System.out.println("0. 고객 관리 프로그램 종료");
        System.out.println("====================================");

        return Integer.parseInt(sc.nextLine());
    }

    // 고객 유형 체킹
    static String checkType(Users user) {
        if(user instanceof Customer)
            return ((((Customer)user).getCustomer_type() == 1) ? "소비자 유형: 개인" : "소비자 유형: 기업");
        else if(user instanceof Supplier)
            return ((((Supplier)user).getSupplier_type() == 1) ? "납품자 유형: 개인" : "납품자 유형: 기업");

        return null;
    }

    // 고객 개개인 정보 출격
    static void print(Users user) {
        System.out.println("| 아이디: " + user.getId() +
                " | 이름: " + user.getName() +
                " | 나이: " + user.getAge() +
                " | 가입일: " + user.getJoined() +
                " | 할인률: " + user.getDiscount_rate() +
                " | " + checkType(user) + " |");
    }

    // 전체 고객 리스트 출력
    static void list() {
        Users user;
        System.out.println("================전체 고객 리스트================");

        for(int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            System.out.print("| " + (i + 1) + " ");
            print(user);
        }
        System.out.println("============================================");
    }

    // =======================메뉴 선택으로 직접 사용되는 메소드=======================

    static void insert() {
        int id; // 고유 아이디
        String name; // 고객명
        int age; // 고객 나이
        int userType; // 고객 유형
        LocalDateTime joined; // 가입일
        int discount_rate; // 할인률
        int customer_type, suplier_type; // 자식 클래스 요소

        System.out.println("================고객등록================");
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
            System.out.println("소비자 유형(1. 개인 | 2. 기업) : ");
            customer_type = Integer.parseInt(sc.nextLine());
            userList.add(new Customer(id, name, age, joined, userType, discount_rate, customer_type));
        } else if (userType == 2) { // 고객 유형이 2라면 납품자 테이블에 삽입.
            discount_rate = 20;
            System.out.println("납품자 유형(1. 개인 | 2. 기업) : ");
            suplier_type = Integer.parseInt(sc.nextLine());
            userList.add(new Supplier(id, name, age, joined, userType, discount_rate, suplier_type));
        }
        System.out.println("고객 등록이 완료되었습니다.");
    }

    static void remove() {
        searchUser();
        System.out.println("해당 고객을 삭제하시겠습니까? 1. 예 | 2. 아니오");
        int answer = Integer.parseInt(sc.nextLine());
        if(answer == 1) {
            for(int i = 0; i < userList.size(); i++) {
                user = userList.get(i);
                if(search_name.contains(user.getName())) {
                    userList.remove(user);
                    System.out.println(user.getName() + " 님이 삭제되었습니다.");
                    break; // 불필요한 연산을 줄이기 위해
                }
            }
        }
        else {
            System.out.println("삭제를 취소합니다.");
        }
    }

    static void update() {
        searchUser();
        if(found) {
            int selected;

            do {
                System.out.println("해당 고객의 어떠한 정보를 변경하시겠습니까?");
                System.out.println("변경 가능 정보: 1. 이름 | 2. 나이 | 3. 고객유형 | 4. 할인률 | 0. 수정 종료");
                selected = Integer.parseInt(sc.nextLine());

                switch (selected) {
                    case 1: // name
                        System.out.println("변경할 이름을 입력해주십시오.");
                        String newName = sc.nextLine();
                        for (int i = 0; i < userList.size(); i++) {
                            user = userList.get(i);
                            if (search_name.contains(user.getName())) {
                                user.setName(newName);
                                System.out.println("수정이 완료되었습니다.");
                                break; // 불필요한 연산을 줄이기 위해
                            }
                        }
                        break;
                    case 2: // age
                        System.out.println("변경할 나이를 입력해주십시오.");
                        int newAge = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < userList.size(); i++) {
                            user = userList.get(i);
                            if (search_name.contains(user.getName())) {
                                user.setAge(newAge);
                                System.out.println("수정이 완료되었습니다.");
                                break; // 불필요한 연산을 줄이기 위해
                            }
                        }
                        break;
                    case 3: // userType
                        System.out.println("변경할 고개 유형을 입력해주십시오: 1. 개인 2. 기업");
                        int newUserType = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < userList.size(); i++) {
                            user = userList.get(i);
                            if (search_name.contains(user.getName())) {
                                user.setUserType(newUserType);
                                System.out.println("수정이 완료되었습니다.");
                                break; // 불필요한 연산을 줄이기 위해
                            }
                        }
                        break;
                    case 4: // discount_rate
                        System.out.println("변경할 이름을 입력해주십시오.");
                        int newDiscout_rate = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < userList.size(); i++) {
                            user = userList.get(i);
                            if (search_name.contains(user.getName())) {
                                user.setDiscount_rate(newDiscout_rate);
                                System.out.println("수정이 완료되었습니다.");
                                break; // 불필요한 연산을 줄이기 위해
                            }
                        }
                        break;
                    case 0:
                        System.out.println("수정을 종료합니다.");
                        return;
                    default:
                        System.out.println("올바른 번호를 입력해주십시오.");

                }
            } while (selected != 0);
        }
    }

    static void searchUser() {
        System.out.println("================고객 검색================");
        System.out.println("찾을 고객의 이름을 입력하십시오.");
        search_name = sc.nextLine();
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (search_name.equals(user.getName())) {
                print(user);
                found = true;
                break;
            }
        }
    }

    static void customerList(Users user) {
        System.out.println("===================소비자 리스트===================");
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if(user instanceof Customer) {
                print(user);
            }
        }
    }

    static void supplierList(Users user) {
        System.out.println("===================납품자 리스트===================");
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i); // ArrayList를 바로 타입캐스팅할 수 없기 때문에 user에 한 객체를 담고
            if(user instanceof Supplier) { // 그 객체가 Supplier라면
                print(user);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("고객 관리 프로그램 UM(User Manager)입니다. 환영합니다.");
        // 실질적 고객 관리 프로그램
        do {
            switch (menu()) {
                case 1: insert();
                    break; // 고객 등록(완)
                case 2: remove(); // 고객 삭제
                    break;
                case 3: update(); // 특정 고객 수정
                    break;
                case 4: searchUser();// 특정 고객 검색(완)
                    break;
                case 5: customerList(user); // 소비자 고객 리스트 출력(완)
                    break;
                case 6: supplierList(user); // 납품자 고객 리스트 출력(완)
                    break;
                case 7: list();// 고객 전체 출력(완)
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("해당되는 메뉴만을 선택해주십시오.");
            }
        } while (true);
    }
}
