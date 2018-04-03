package mvpproject.com.mbox.mvpproject.base.adapter.loadmore;

import java.util.List;

import mvpproject.com.mbox.mvpproject.base.adapter.BaseItem;
import mvpproject.com.mbox.mvpproject.base.adapter.BaseMvpListAdapterInterface;

public interface LoadmoreAdapterInterface {

    interface Adapter extends BaseMvpListAdapterInterface.Adater {
    }

    interface Presenter<A extends LoadmoreAdapterInterface.Adapter>
            extends BaseMvpListAdapterInterface.Presenter<A> {

        void setItems(List<BaseItem> items, boolean isNextItemAvaliable);

    }

}
