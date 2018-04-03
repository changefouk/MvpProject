package mvpproject.com.mbox.mvpproject.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import mvpproject.com.mbox.mvpproject.base.exception.MvpPresenterNotCreateException;

public abstract class BaseMvpFragment<P extends BaseMvpInterface.Presenter>
        extends Fragment
        implements BaseMvpInterface.View {

    private P presenter;

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(this);
        if (savedInstanceState == null) {
        } else {
            onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindView(view);
        setupInstance();
        getPresenter().onViewCreate();
        if (savedInstanceState == null) {
            initialize();
        } else {
            restoreView(savedInstanceState);
        }
    }

    protected abstract void restoreView(Bundle savedInstanceState);

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onViewStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        getPresenter().onViewStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onViewDestroy();
        presenter.detachView();
    }

    @Override
    public BaseMvpInterface.Presenter getPresenter() {
        if (presenter != null) return presenter;
        throw new MvpPresenterNotCreateException();
    }

    protected abstract void initialize();

    protected abstract void setupInstance();

    protected abstract void bindView(View view);

    private void onRestoreInstanceState(Bundle savedInstanceState) {

    }

    protected abstract P createPresenter();
}
