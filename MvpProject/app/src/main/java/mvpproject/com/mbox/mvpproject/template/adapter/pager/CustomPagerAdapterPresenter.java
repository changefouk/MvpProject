package mvpproject.com.mbox.mvpproject.template.adapter.pager;


import java.lang.ref.WeakReference;

import mvpproject.com.mbox.mvpproject.ui.base.exception.MvpViewNotAttachedException;

public class CustomPagerAdapterPresenter
        implements CustomPagerAdapterInterface.Presenter{

    private WeakReference<CustomPagerAdapterInterface.Adapter> adapter;

    public static CustomPagerAdapterInterface.Presenter create(){
        return new CustomPagerAdapterPresenter();
    }


    @Override
    public void setAdapter( CustomPagerAdapterInterface.Adapter adapter ){
        this.adapter = new WeakReference<>( adapter );
    }

    @Override
    public CustomPagerAdapterInterface.Adapter getAdapter(){
        if( adapter != null ) return adapter.get();
        throw new MvpViewNotAttachedException();
    }

}
