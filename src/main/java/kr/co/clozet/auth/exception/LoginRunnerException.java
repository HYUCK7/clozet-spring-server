package kr.co.clozet.auth.exception;

/**
 * packageName:kr.co.clozet.auth.exception
 * fileName        :LoginRunnerException.java
 * author          : sungsuhan
 * date            :2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24           sungsuhan      최초 생성
 **/
public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}
