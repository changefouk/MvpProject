package mvpproject.com.mbox.mvpproject.base.exception;

public class MvpNotSetLayoutException extends RuntimeException {

    public MvpNotSetLayoutException() {
        super("getLayoutView() not return 0");
    }

}
