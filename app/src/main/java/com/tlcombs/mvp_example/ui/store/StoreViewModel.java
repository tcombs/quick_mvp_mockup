package com.tlcombs.mvp_example.ui.store;

//Immutable...or as much as possible
//Doesn't contain any logic
public final class StoreViewModel {
    public final String storeNumber;
    public final String storeName;
    public final String openDate;


    public StoreViewModel(String storeNumber, String storeName, String openDate) {
        this.storeNumber = storeNumber;
        this.storeName = storeName;
        this.openDate = openDate;
    }
}
