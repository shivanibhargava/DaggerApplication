package com.example.myfirstdraggerapplication.ui;

import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;
import com.example.myfirstdraggerapplication.di.components.ApplicationComponent;
import com.example.myfirstdraggerapplication.di.modules.FragmentModule;
import com.example.myfirstdraggerapplication.util.NetworkHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
public class HomeViewModel {
    private NetworkHelper networkHelper;
    private DatabaseService databaseService;
    private NetworkService networkService;
@Inject
    public HomeViewModel(NetworkHelper networkHelper, DatabaseService databaseService, NetworkService networkService) {
        this.networkHelper = networkHelper;
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getDataOnFragment() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData()+" : "+networkHelper.isNetworkConnected();
    }
}
