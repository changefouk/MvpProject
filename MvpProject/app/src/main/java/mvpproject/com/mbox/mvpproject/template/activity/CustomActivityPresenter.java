package mvpproject.com.mbox.mvpproject.template.activity;


import mvpproject.com.mbox.mvpproject.ui.base.BaseMvpPresenter;

public class CustomActivityPresenter extends BaseMvpPresenter<CustomActivityInterface.View>
        implements CustomActivityInterface.Presenter{

    public static CustomActivityInterface.Presenter create(){
        return new CustomActivityPresenter();
    }

}
