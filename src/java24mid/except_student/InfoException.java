package java24mid.except_student;


public class InfoException extends Exception {

    /**
     * 사용자 지정 에러 메세지를 출력합니다.
     * @param message 에러 메세지
     */
    public InfoException(String message) {
        super(message);
    }

}
