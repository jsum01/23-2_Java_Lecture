package java_exception_practice;

public class ScoreRangeException extends Exception{

    public ScoreRangeException() {
        super("정상 범위가 아닙니다");
    }

    public ScoreRangeException(String message) {
        super(message);
    }
}
