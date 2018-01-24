package com.tlcombs.mvp_example.ui.store;

import com.tlcombs.mvp_example.ui.mvp.Presenter;
import com.tlcombs.mvp_example.ui.mvp.View;

class StoreContract {
    interface StoreView extends View {
        void showStoreData(StoreViewModel viewModel);
    }

    interface StorePresenter extends Presenter<StoreView> {
        void showRandomStore();
    }
}
