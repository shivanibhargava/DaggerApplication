package com.example.myfirstdraggerapplication.di.components;

import com.example.myfirstdraggerapplication.MyApplication;
import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;
import com.example.myfirstdraggerapplication.di.modules.ApplicationModule;
import com.example.myfirstdraggerapplication.util.NetworkHelper;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);
    NetworkService getNetwoekService();
    DatabaseService getDataBaseService();
    NetworkHelper getNetworkHelper();
}
