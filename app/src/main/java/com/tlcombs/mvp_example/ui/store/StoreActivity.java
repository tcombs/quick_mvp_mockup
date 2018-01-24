package com.tlcombs.mvp_example.ui.store;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.tlcombs.mvp_example.R;
import com.tlcombs.mvp_example.data.StoreGenerator;
import com.tlcombs.mvp_example.databinding.ActivityStoreBinding;
import com.tlcombs.mvp_example.ui.mvp.BaseActivity;

public class StoreActivity extends BaseActivity<StoreContract.StoreView, StoreContract.StorePresenter> implements StoreContract.StoreView {

    private StoreContract.StorePresenter presenter;
    private ActivityStoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_store);
        this.presenter = new StorePresenterImpl(new StoreGenerator()); //Should be injected with Dagger
        this.binding.generateButton.setOnClickListener(view -> presenter.showRandomStore());
    }

    @Override
    protected StoreContract.StorePresenter getPresenter() {
        return this.presenter;
    }

    @Override
    public void showStoreData(StoreViewModel viewModel) {
        this.binding.setViewModel(viewModel);
        this.binding.notifyChange();
    }
}
