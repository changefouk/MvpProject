package mvpproject.com.mbox.mvpproject.template.activity;


import mvpproject.com.mbox.mvpproject.ui.base.BaseMvpInterface;

/**
 * Created by TheKhaeng on 9/20/2016.
 */

public class CustomActivityInterface{


    public interface View extends BaseMvpInterface.View{
    }

    public interface Presenter extends BaseMvpInterface.Presenter<CustomActivityInterface.View>{
    }
}
