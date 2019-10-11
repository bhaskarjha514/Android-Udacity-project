package com.example.customadapterexample;

public class AndroidFlavor {
    private  String mVersionName;
    private String mVersionNumber;
    private int mImageResourceId;

    public AndroidFlavor(String vName, String vNumber, int imageResourceId) {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;
    }

    public String getVersionName() {
        return mVersionName;
    }

    public String getVersionNumber() {
        return mVersionNumber;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
