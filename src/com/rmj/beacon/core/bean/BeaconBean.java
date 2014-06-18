package com.rmj.beacon.core.bean;

/**
 * Created by G11 on 2014/6/17.
 */
public class BeaconBean {
    String mMac;
    String mUUID;
    String mRSSI;
    String mDistance;
    int mPower;
    int mMajor;
    int mMinor;

    public String getMac() {
        return mMac;
    }

    public void setMac(String mac) {
        this.mMac = mac;
    }

    public String getUUID() {
        return mUUID;
    }

    public void setUUID(String UUID) {
        this.mUUID = UUID;
    }

    public String getRSSI() {
        return mRSSI;
    }

    public void setRSSI(String RSSI) {
        this.mRSSI = RSSI;
    }

    public String getDistance() {
        return mDistance;
    }

    public void setDistance(String distance) {
        this.mDistance = distance;
    }

    public int getPower() {
        return mPower;
    }

    public void setPower(int power) {
        this.mPower = power;
    }

    public int getMajor() {
        return mMajor;
    }

    public void setMajor(int major) {
        this.mMajor = major;
    }

    public int getMinor() {
        return mMinor;
    }

    public void setMinor(int minor) {
        this.mMinor = minor;
    }
}
