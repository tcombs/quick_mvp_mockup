package com.tlcombs.mvp_example.ui.mvp;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<V extends View, P extends Presenter<V>> extends AppCompatActivity implements View {
    @Override
    protected void onStart() {
        super.onStart();
        Presenter<V> presenter = getPresenter();
        if(presenter == null) throw new IllegalStateException("Presenter must be created before onStart()");
        presenter.attachView(getMvpView());
    }

    @Override
    protected void onStop() {
        super.onStop();
        getPresenter().detachView();
    }

    protected abstract P getPresenter();

    @SuppressWarnings("unchecked cast")
    private V getMvpView() {
        return (V) this;
    }
}
