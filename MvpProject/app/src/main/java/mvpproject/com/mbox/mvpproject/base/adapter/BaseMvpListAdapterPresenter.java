package mvpproject.com.mbox.mvpproject.base.adapter;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import mvpproject.com.mbox.mvpproject.base.exception.MvpViewNotAttachedException;

public abstract class BaseMvpListAdapterPresenter<A extends BaseMvpListAdapterInterface.Adater>
        implements BaseMvpListAdapterInterface.Presenter<A> {

    private WeakReference<A> adapter;
    private List<BaseItem> items;

    public BaseMvpListAdapterPresenter() {
        this.items = new ArrayList<>();
    }

    @Override
    public void setAdapter(A adapter) {
        this.adapter = new WeakReference<>(adapter);
    }

    @Override
    public A getAdapter() {
        if (adapter != null) return adapter.get();
        throw new MvpViewNotAttachedException();
    }

    @Override
    public int getItemViewType(int pos) {
        return getPrivateItems().get(pos).getType();
    }

    @Override
    public int getItemCount() {
        return getPrivateItems().size();
    }

    @Override
    public BaseItem getItem(int pos) {
        return getPrivateItems().get(pos);
    }

    @Override
    public List<BaseItem> getItems() {
        return getPrivateItems();
    }

    @Override
    public boolean hasItems() {
        return getItemCount() > 0;
    }

    @Override
    public void setItems(List<BaseItem> items) {
        this.items = items;
        getAdapter().notifyDataSetChanged();
    }

    @Override
    public void addItem(BaseItem item) {
        getPrivateItems().add(item);
        getAdapter().notifyItemInserted(getItemCount() - 1);
    }

    @Override
    public void removeItem(int index) {
        getPrivateItems().remove(index);
        getAdapter().notifyitemRemoved(index);
    }

    @Override
    public void removeAllItems() {
        getPrivateItems().clear();
        getAdapter().notifyDataSetChanged();
    }

    private List<BaseItem> getPrivateItems() {
        if (items == null) return new ArrayList<>();
        return items;
    }
}
