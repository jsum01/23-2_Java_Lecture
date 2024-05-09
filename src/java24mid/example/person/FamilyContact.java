package java24mid.example.person;

// 가족 연락처 클래스 정의
class FamilyContact extends Person {
    private String relation;

    public FamilyContact(String name, String phoneNumber, String relation) {
        super(name, phoneNumber);
        this.relation = relation;
    }

    public void display() {
        System.out.println("Name: " + super.getName() + ", Phone Number: " + super.getPhoneNumber() + ", Relation: " + relation);
    }
}