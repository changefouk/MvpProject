package mvpproject.com.mbox.mvpproject.template.fragment;


import mvpproject.com.mbox.mvpproject.ui.base.BaseMvpInterface;

/**
 * Created by TheKhaeng on 9/20/2016.
 */

public class CustomFragmentInterface{


    public interface View extends BaseMvpInterface.View{
    }

    public interface Presenter extends BaseMvpInterface.Presenter<CustomFragmentInterface.View>{
    }
}
