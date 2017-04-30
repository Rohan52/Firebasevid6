package com.example.android.fireeapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ADMIN on 05-04-2017.
 */
public class FireeApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Firebase.setAndroidContext(this);

    }
}
