package com.example.myfirstdraggerapplication;

import android.app.Application;
import android.util.Log;

import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;
import com.example.myfirstdraggerapplication.di.components.ApplicationComponent;
import com.example.myfirstdraggerapplication.di.components.DaggerApplicationComponent;
import com.example.myfirstdraggerapplication.di.modules.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {
    @Inject
    public NetworkService networkService;

    @Inject
    public DatabaseService databaseService;
    public ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerApplicationComponent
                 .builder().
                applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);

        Log.d("DEBUG",networkService.toString());

    }
}