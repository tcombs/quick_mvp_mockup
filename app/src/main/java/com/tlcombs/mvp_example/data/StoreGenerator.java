package com.tlcombs.mvp_example.data;

import com.mooveit.library.Fakeit;
import com.tlcombs.mvp_example.data.models.Store;

import java.util.Date;
import java.util.Locale;
import java.util.Random;

import io.reactivex.Single;

public class StoreGenerator {

    public StoreGenerator() {
        Fakeit.init();
    }

    //This could be async
    public Single<Store> generateRandomStore() {

       Store store = new Store(
               (int)(Math.random() * ( 5000 - 100 )),
               (int)(Math.random() * ( 500 - 100 )),
               Fakeit.bank().name(),
               new Date(),
               Fakeit.address().city(),
               Fakeit.address().state()
       );

       return Single.just(store);
    }
}
