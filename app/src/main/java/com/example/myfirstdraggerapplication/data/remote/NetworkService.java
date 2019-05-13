package com.example.myfirstdraggerapplication.data.remote;

import android.content.Context;

import com.example.myfirstdraggerapplication.qualifier.ApplicationContext;
import com.example.myfirstdraggerapplication.qualifier.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class NetworkService {

    private Context context;
    private String apiKey;
  @Inject
    public NetworkService(@ApplicationContext Context context, @NetworkInfo String apiKey) {
        // do the initialisation here
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
