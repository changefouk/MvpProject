package mvpproject.com.mbox.mvpproject.template;

import android.os.Bundle;

import mvpproject.com.mbox.mvpproject.base.BaseMvpActivity;

public class CustomActivity extends BaseMvpActivity<CustomActivityInterface.Presenter>
        implements CustomActivityInterface.View {


    @Override
    protected void initailize() {

    }

    @Override
    protected void setupView() {

    }

    @Override
    protected void setupInstance() {

    }

    @Override
    protected void bindView() {

    }

    @Override
    protected int getLayoutView() {
        return 0;
    }

    @Override
    protected CustomActivityInterface.Presenter createPresenter() {
        return CustomActivityPresenter.create();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
