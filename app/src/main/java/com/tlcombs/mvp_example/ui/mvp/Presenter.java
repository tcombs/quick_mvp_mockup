package com.tlcombs.mvp_example.ui.mvp;

public interface Presenter<V extends View> {
    void attachView(V view);
    void detachView();
}
