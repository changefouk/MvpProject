package mvpproject.com.mbox.mvpproject.template.fragment;


import mvpproject.com.mbox.mvpproject.ui.base.BaseMvpPresenter;

public class CustomFragmentPresenter extends BaseMvpPresenter<CustomFragmentInterface.View>
        implements CustomFragmentInterface.Presenter{

    public static CustomFragmentInterface.Presenter create(){
        return new CustomFragmentPresenter();
    }

}
