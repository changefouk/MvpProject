package mvpproject.com.mbox.mvpproject.template.adapter.list;


import mvpproject.com.mbox.mvpproject.ui.base.adapter.loadmore.LoadmoreAdapterInterface;

/**
 * Created by TheKhaeng on 9/20/2016.
 */

public class CustomListAdapterInterface{


    public interface Adapter extends LoadmoreAdapterInterface.Adapter{
    }

    public interface Presenter extends  LoadmoreAdapterInterface.Presenter<Adapter>{
    }
}
