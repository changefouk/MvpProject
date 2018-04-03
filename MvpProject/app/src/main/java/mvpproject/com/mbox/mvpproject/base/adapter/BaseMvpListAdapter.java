package mvpproject.com.mbox.mvpproject.base.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import mvpproject.com.mbox.mvpproject.base.exception.MvpPresenterNotCreateException;

public abstract class BaseMvpListAdapter<VH extends BaseViewHolder, P extends BaseMvpListAdapterInterface.Presenter>
        extends RecyclerView.Adapter<VH>
        implements BaseMvpListAdapterInterface.Adater {

    private P presenter;

    public interface OnLoadMoreListener {
        void onLoadMore();
    }

    @SuppressWarnings("unchecked")
    public BaseMvpListAdapter() {
        presenter = createPresenter();
        presenter.setAdapter(this);
    }

    protected abstract P createPresenter();

    @Override
    public P getPresenter() {
        if (presenter != null) return presenter;
        throw new MvpPresenterNotCreateException();
    }

    @SuppressWarnings("unchecked")
    public List<BaseItem> getItems() {
        return getPresenter().getItems();
    }

    public BaseItem getitem(int pos) {
        return getPresenter().getItem(pos);
    }

    public boolean hasItems() {
        return getPresenter().hasItems();
    }

    public void setItems(List<BaseItem> items) {
        getPresenter().setItems(items);
    }

    public void additem(BaseItem item) {
        getPresenter().addItem(item);
    }

    public void removeItem(int index) {
        getPresenter().removeItem(index);
    }

    public void removeAllitems() {
        getPresenter().removeAllItems();
    }

}
