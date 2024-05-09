package java24mid.example.person;

// 회사용 연락처 클래스 정의
class CompanyContact extends Person {
    private String company;

    public CompanyContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public void display() {
        System.out.println("Name: " + super.getName() + ", Phone Number: " + super.getPhoneNumber() + ", Company: " + company);
    }
}