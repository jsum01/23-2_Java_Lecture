package java24mid.except_student;

import java.util.regex.Pattern;

public class Student implements RegexIF{

    private String name = "";
    private String jumin = "";


    /** 기본 생성자 */
    public Student() { }

    /**
     * 학생의 이름과 주민번호를 할당한 상태로 인스턴스를 생성합니다.
     * @param name
     * @param jumin
     */
    public Student(String name, String jumin) {
        this.name = name;
        this.jumin = jumin;
    }

    /** ----------------------name start--------------------- */
    public String getName() {
        return name;
    }
    public boolean setName(String name) {
        try {
            if (Pattern.matches(nameRegex, name)) {
                this.name = name;
                return true;
            }
            else {
                throw new InfoException("올바른 이름이 아닙니다.(한/영문만 가능)");
            }
        } catch (InfoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    /** ----------------------name end--------------------- */


    /** ----------------------jumin start--------------------- */
    public String getJumin() {
        return jumin;
    }

    /**
     * 주민등록번호를 전달받아 형식에 맞는지 예외처리를 합니다.
     *
     * 주민번호 세부 정규식
     * 29일인 달(윤년) : 앞 2자리 % 4 == 0
     * 28일인 달(평년) : 앞 2자리 % 4 != 0
     * 31일인 달 : 1, 3, 5, 7, 8, 10, 12
     * 30일인 달 : 4, 6, 9, 11
     *
     * @param jumin
     * @return
     */
    public boolean setJumin(String jumin) {
        try {
            if(jumin.length() == 14) {
                if (Pattern.matches(juminRegex, jumin)) {
                    this.jumin = jumin;
                    return true;
                } else {
                    throw new InfoException("올바르지 않은 주민등록번호 형식입니다.");
                }
            } else {
                System.out.println(jumin);
                throw new InfoException("주민등록번호 입력은 14글자여야 합니다.");
            }
        } catch (InfoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    };
    /** ----------------------jumin end--------------------- */
}
