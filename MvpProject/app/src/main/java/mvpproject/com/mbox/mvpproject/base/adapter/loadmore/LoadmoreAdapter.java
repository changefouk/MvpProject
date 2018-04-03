package mvpproject.com.mbox.mvpproject.base.adapter.loadmore;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import java.util.List;

import mvpproject.com.mbox.mvpproject.base.adapter.BaseItem;
import mvpproject.com.mbox.mvpproject.base.adapter.BaseItemType;
import mvpproject.com.mbox.mvpproject.base.adapter.BaseMvpListAdapter;
import mvpproject.com.mbox.mvpproject.base.adapter.BaseViewHolder;
import mvpproject.com.mbox.mvpproject.base.adapter.progress.ProgressHolder;

public abstract class LoadmoreAdapter<VH extends BaseViewHolder, P extends LoadmoreAdapterInterface.Presenter>
        extends BaseMvpListAdapter<VH, P>
        implements LoadmoreAdapterInterface.Adapter {

    private OnLoadMoreListener loadMoreListener;

    public LoadmoreAdapter(OnLoadMoreListener loadMoreListener) {
        this.loadMoreListener = loadMoreListener;
    }

    public void setItems(List<BaseItem> items, boolean isNextItemAvaliable) {
        getPresenter().setItems(items, isNextItemAvaliable);
    }

    @SuppressWarnings("unchecked")
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == BaseItemType.TYPE_PROGRESS) {
            return (VH) new ProgressHolder(parent);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position, @NonNull List<Object> payloads) {
        if (getItemViewType(position) == BaseItemType.TYPE_PROGRESS) {
            if (loadMoreListener != null) {
                loadMoreListener.onLoadMore();
            }
        }
    }
}
