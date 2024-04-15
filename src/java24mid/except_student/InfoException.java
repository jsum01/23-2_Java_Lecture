package java24mid.except_student;


public class InfoException extends Exception {

    /**
     * message: "형식에 맞지 않는 입력입니다
     */
    public InfoException() {
        super("형식에 맞지 않는 입력입니다.");
    }

    /**
     * 사용자 지정 에러 메세지를 출력합니다.
     * @param message 에러 메세지
     */
    public InfoException(String message) {
        super(message);
    }

}
