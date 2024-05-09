package java24mid.example.person;

// 지인 연락처 클래스 정의
class FriendContact extends Person {
    private String relationship;

    public FriendContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public void display() {
        System.out.println("Name: " + super.getName() + ", Phone Number: " + super.getPhoneNumber() + ", Relationship: " + relationship);
    }
}