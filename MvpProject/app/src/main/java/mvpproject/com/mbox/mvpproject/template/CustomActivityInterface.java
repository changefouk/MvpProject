package mvpproject.com.mbox.mvpproject.template;

import mvpproject.com.mbox.mvpproject.base.BaseMvpInterface;

public class CustomActivityInterface {

    public interface View extends BaseMvpInterface.View {

    }

    public interface Presenter extends BaseMvpInterface.Presenter<CustomActivityInterface.View> {
    }

}
