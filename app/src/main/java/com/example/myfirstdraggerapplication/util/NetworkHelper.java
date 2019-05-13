package com.example.myfirstdraggerapplication.util;

import android.content.Context;

import com.example.myfirstdraggerapplication.qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkHelper {

    private Context context;
    @Inject
    public NetworkHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    public boolean isNetworkConnected() {
        return false;
    }
}
