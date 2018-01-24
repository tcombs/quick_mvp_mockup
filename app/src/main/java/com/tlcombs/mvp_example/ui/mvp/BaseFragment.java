package com.tlcombs.mvp_example.ui.mvp;

import android.support.v4.app.Fragment;

public abstract class BaseFragment<V extends View, P extends Presenter<V>> extends Fragment implements View {


    @Override
    public void onStart() {
        super.onStart();
        Presenter<V> presenter = getPresenter();
        if(presenter == null) throw new IllegalStateException("Presenter must be created before onStart()");
        presenter.attachView(getMvpView());
    }

    @Override
    public void onStop() {
        super.onStop();
        getPresenter().detachView();
    }

    abstract P getPresenter();

    @SuppressWarnings("unchecked cast")
    private V getMvpView() {
        return (V) this;
    }
}
