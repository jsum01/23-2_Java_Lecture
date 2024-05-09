package java24mid.example.contact_management;

import java.util.HashMap;

class Contact implements ContactIF {

    private HashMap<String, String> contacts;

    public Contact() {
        this.contacts = new HashMap<String, String>();
    }

    @Override
    public void setContacts(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
    }


    @Override
    public HashMap<String,String> getContacts() {
        return contacts;
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("✅" + name + " 연락처가 삭제되었습니다.");
        } else {
            System.out.println("⚠️" + name + "이라는 연락처가 없습니다.");
        }
    }

    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("✅" + name + "의 전화번호: " + contacts.get(name));
        } else {
            System.out.println("⚠️" + name + "이라는 연락처가 없습니다.");
        }
    }
}
