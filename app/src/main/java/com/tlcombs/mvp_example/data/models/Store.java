package com.tlcombs.mvp_example.data.models;

import java.util.Date;

public class Store {
    private int storeNumber;
    private int storeId;
    private String storeName;
    private Date createdAt;
    private String city;
    private String state;

    public Store(int storeNumber, int storeId, String storeName, Date createdAt, String city, String state) {
        this.storeNumber = storeNumber;
        this.storeId = storeId;
        this.storeName = storeName;
        this.createdAt = createdAt;
        this.city = city;
        this.state = state;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
