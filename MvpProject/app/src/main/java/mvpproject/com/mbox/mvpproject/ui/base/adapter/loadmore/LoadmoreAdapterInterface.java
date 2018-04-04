package mvpproject.com.mbox.mvpproject.ui.base.adapter.loadmore;

import java.util.List;

import mvpproject.com.mbox.mvpproject.ui.base.adapter.BaseItem;
import mvpproject.com.mbox.mvpproject.ui.base.adapter.BaseMvpListAdapterInterface;


/**
 * Created by TheKhaeng on 12/18/2016.
 */

public interface LoadmoreAdapterInterface{

    interface Adapter extends BaseMvpListAdapterInterface.Adapter{
    }

    interface Presenter<A extends LoadmoreAdapterInterface.Adapter>
            extends BaseMvpListAdapterInterface.Presenter<A>{
        void setItems(List<BaseItem> items, boolean isNextItemAvailable);
    }
}

