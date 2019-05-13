package com.example.myfirstdraggerapplication.di.modules;

import android.app.Activity;
import android.content.Context;

import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;
import com.example.myfirstdraggerapplication.qualifier.ActivityContext;
import com.example.myfirstdraggerapplication.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }
   @ActivityContext
    @Provides
    Context provideContext()
    {
        return activity;
    }

}
