package java24mid.example.person;

import java.util.HashMap;

class ContactManager {
    private HashMap<String, PersonIF> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    // 연락처 추가
    public void addContact(String name, String phoneNumber, String type, String additionalInfo) throws ContactException {
        if (contacts.containsKey(name)) {
            throw new ContactException("이름이 이미 존재합니다.");
        }

        switch (type.toLowerCase()) {
            case "회사":
                contacts.put(name, new CompanyContact(name, phoneNumber, additionalInfo));
                break;
            case "지인":
                contacts.put(name, new FriendContact(name, phoneNumber, additionalInfo));
                break;
            case "가족":
                contacts.put(name, new FamilyContact(name, phoneNumber, additionalInfo));
                break;
            default:
                throw new ContactException("유효하지 않은 연락처 유형입니다.");
        }
    }

    // 연락처 수정
    public void updateContact(String name, String phoneNumber, String type, String additionalInfo) throws ContactException {
        if (!contacts.containsKey(name)) {
            throw new ContactException("연락처를 찾을 수 없습니다.");
        }

        switch (type.toLowerCase()) {
            case "회사":
                contacts.put(name, new CompanyContact(name, phoneNumber, additionalInfo));
                break;
            case "지인":
                contacts.put(name, new FriendContact(name, phoneNumber, additionalInfo));
                break;
            case "가족":
                contacts.put(name, new FamilyContact(name, phoneNumber, additionalInfo));
                break;
            default:
                throw new ContactException("유효하지 않은 연락처 유형입니다.");
        }
    }

    // 연락처 조회
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 없습니다.");
            return;
        }
        for (String name : contacts.keySet()) {
            contacts.get(name).display();
        }
    }

    // 연락처 삭제
    public void deleteContact(String name) throws ContactException {
        if (!contacts.containsKey(name)) {
            throw new ContactException("연락처를 찾을 수 없습니다.");
        }
        contacts.remove(name);
        System.out.println("연락처가 성공적으로 삭제되었습니다.");
    }
}