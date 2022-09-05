package com.example.padraomvc.model;

//Cumpre o papel de um Database ou uma API
public class MyModel {

    String appName;
    int appDownloads;
    int appRating;


    public MyModel(String appName, int appDownloads, int appRating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating = appRating;
    }

    //Getter & Setter
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public int getAppRating() {
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }
}
