package com.tlcombs.mvp_example.ui.store;

import com.tlcombs.mvp_example.data.StoreGenerator;
import com.tlcombs.mvp_example.data.models.Store;
import com.tlcombs.mvp_example.ui.mvp.BasePresenter;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

class StorePresenterImpl extends BasePresenter<StoreContract.StoreView> implements StoreContract.StorePresenter {
    private StoreGenerator storeGenerator;

    public StorePresenterImpl(StoreGenerator storeGenerator) {
        this.storeGenerator = storeGenerator;
    }

    @Override
    public void showRandomStore() {
        storeGenerator.generateRandomStore()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(store -> {
                   view.ifPresent(v -> {
                       v.showStoreData(createViewModel(store));
                   });
                });

    }

    private StoreViewModel createViewModel(Store store) {

        DateFormat dateFormat = new SimpleDateFormat("MM dd HH:mm:ss");
        return new StoreViewModel(
                Integer.toString(store.getStoreNumber()),
                store.getStoreName(),
                dateFormat.format(store.getCreatedAt())
        );
    }
}
