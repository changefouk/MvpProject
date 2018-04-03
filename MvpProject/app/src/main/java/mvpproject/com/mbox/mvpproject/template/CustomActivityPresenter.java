package mvpproject.com.mbox.mvpproject.template;

import mvpproject.com.mbox.mvpproject.base.BaseMvpPresenter;

public class CustomActivityPresenter extends BaseMvpPresenter<CustomActivityInterface.View>
        implements CustomActivityInterface.Presenter {

    public static CustomActivityInterface.Presenter create(){
        return new CustomActivityPresenter();
    }

}
