package com.tlcombs.mvp_example.ui.mvp;


import com.annimon.stream.Optional;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<V extends View> implements Presenter<V> {
    protected Optional<V> view = Optional.empty();
    protected CompositeDisposable disposables;

    @Override
    public void attachView(V view) {
        this.view = Optional.of(view);
    }

    @Override
    public void detachView() {
        this.view = Optional.empty();
        if(disposables != null && !disposables.isDisposed()) {
            disposables.dispose();
        }
    }
}
