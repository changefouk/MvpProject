package mvpproject.com.mbox.mvpproject.base.exception;

public class MvpViewNotAttachedException extends RuntimeException {

    public MvpViewNotAttachedException() {
        super(" Please Call Presenter.attachView(MvpBaseView) before" +
                " requesting data to the View");
    }
}
