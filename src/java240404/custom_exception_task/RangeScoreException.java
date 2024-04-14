package java240404.custom_exception_task;

public class RangeScoreException extends Exception{
    /**
     * 기본적인 예외처리
     */
    public RangeScoreException() {
        super("정상적인 점수의 범위가 아닙니다.");
    }

    /**
     * 점수가 범위를 벗어났을 경우 예외 메세지를 반환합니다.
     */
    public RangeScoreException(String message) {
        super(message);
    }
}
