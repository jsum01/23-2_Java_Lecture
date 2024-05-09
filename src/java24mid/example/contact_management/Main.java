package java24mid.example.contact_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------연락처 관리------------");
            System.out.println("1. 연락처 추가");
            System.out.println("2. 연락처 보기");
            System.out.println("3. 연락처 수정");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 연락처 찾기");
            System.out.println("0. 종료");
            System.out.println("--------------------------------");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("이름과 전화번호를 입력하세요.\n예시)홍길동/010-1111-2222");
                    try{
                        String[] input = sc.nextLine().split("/");
                        contact.setContacts(input[0], input[1]);
                    } catch (Exception e){

                    }
                    break;
                case 2:
                    contact.getContacts();
                    break;
                case 3:
                    System.out.print("수정할 연락처의 이름을 입력하세요: ");
                    String updateName = sc.nextLine();
                    contact.findContact(updateName);
                    System.out.print("수정할 전화번호를 입력하세요: ");
                    String updatePhoneNumber = sc.nextLine();
                    contact.setContacts(updateName, updatePhoneNumber);
                    break;
                case 4:
                    System.out.print("삭제할 연락처의 이름을 입력하세요: ");
                    String deleteName = sc.nextLine();
                    contact.deleteContact(deleteName);
                    break;
                case 5:
                    System.out.print("찾을 연락처의 이름을 입력하세요: ");
                    String findName = sc.nextLine();
                    contact.findContact(findName);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}