package mvpproject.com.mbox.mvpproject.template.adapter.list;


import mvpproject.com.mbox.mvpproject.ui.base.adapter.loadmore.LoadmoreAdapterPresenter;

public class CustomListAdapterPresenter extends LoadmoreAdapterPresenter<CustomListAdapterInterface.Adapter>
        implements CustomListAdapterInterface.Presenter{

    public static CustomListAdapterInterface.Presenter create(){
        return new CustomListAdapterPresenter();
    }
}
