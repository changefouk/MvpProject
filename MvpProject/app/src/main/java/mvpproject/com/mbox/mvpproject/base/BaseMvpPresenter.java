package mvpproject.com.mbox.mvpproject.base;

import java.lang.ref.WeakReference;

import mvpproject.com.mbox.mvpproject.base.exception.MvpViewNotAttachedException;

public abstract class BaseMvpPresenter<V extends BaseMvpInterface.View>
        implements BaseMvpInterface.Presenter<V> {

    private WeakReference<V> mMvpView;

    @Override
    public void attachView(V mvpView) {
        mMvpView = new WeakReference<>(mvpView);
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public V getView() {
        if (mMvpView != null) return mMvpView.get();
        throw new MvpViewNotAttachedException();
    }

    @Override
    public void onViewCreate() {

    }

    @Override
    public void onViewDestroy() {

    }

    @Override
    public void onViewStart() {

    }

    @Override
    public void onViewStop() {

    }
}
