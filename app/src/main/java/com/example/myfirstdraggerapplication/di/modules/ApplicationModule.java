package com.example.myfirstdraggerapplication.di.modules;

import android.app.Application;
import android.content.Context;

import com.example.myfirstdraggerapplication.MyApplication;
import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;
import com.example.myfirstdraggerapplication.qualifier.ActivityContext;
import com.example.myfirstdraggerapplication.qualifier.ApplicationContext;
import com.example.myfirstdraggerapplication.qualifier.DataBaseInfo;
import com.example.myfirstdraggerapplication.qualifier.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// provide the method to create instances
@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @ApplicationContext
    @Provides
    Context provideContext()
    {
        return application;
    }

    @DataBaseInfo
    @Provides
    String provideDataBaseName()
    {
        return "abc";
    }
    @Provides
    Integer provideDataBaseVersion()
    {
        return  1;

    }
    @NetworkInfo
    @Provides
    String provideApiKey()
    {
        return "key";
    }


}

