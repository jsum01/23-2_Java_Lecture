package java24mid.example.person;

import java.util.Scanner;

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n연락처 관리 프로그램");
            System.out.println("1. 연락처 추가");
            System.out.println("2. 연락처 수정");
            System.out.println("3. 연락처 삭제");
            System.out.println("4. 모든 연락처 보기");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            try {
                switch (choice) {
                    case 1:
                        System.out.print("이름 입력: ");
                        String name = scanner.nextLine();
                        System.out.print("전화번호 입력: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("연락처 유형 입력 (회사/지인/가족): ");
                        String type = scanner.nextLine();
                        System.out.print("추가 정보 입력: ");
                        String additionalInfo = scanner.nextLine();
                        contactManager.addContact(name, phoneNumber, type, additionalInfo);
                        System.out.println("연락처가 성공적으로 추가되었습니다.");
                        break;
                    case 2:
                        System.out.print("수정할 연락처의 이름 입력: ");
                        String updateName = scanner.nextLine();
                        System.out.print("새 전화번호 입력: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("연락처 유형 입력 (회사/지인/가족): ");
                        String updateType = scanner.nextLine();
                        System.out.print("추가 정보 입력: ");
                        String updateAdditionalInfo = scanner.nextLine();
                        contactManager.updateContact(updateName, newPhoneNumber, updateType, updateAdditionalInfo);
                        System.out.println("연락처가 성공적으로 수정되었습니다.");
                        break;
                    case 3:
                        System.out.print("삭제할 연락처의 이름 입력: ");
                        String deleteName = scanner.nextLine();
                        contactManager.deleteContact(deleteName);
                        break;
                    case 4:
                        System.out.println("모든 연락처:");
                        contactManager.displayContacts();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("유효하지 않은 선택입니다. 1부터 5 사이의 숫자를 입력하세요.");
                }
            } catch (ContactException e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }
}