package mvpproject.com.mbox.mvpproject.base.exception;

public class MvpPresenterNotCreateException extends RuntimeException {

    public MvpPresenterNotCreateException() {

        super("Please Call createPresenter() before" +
                " request data to the Presenter");
    }

}
