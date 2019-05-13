package com.example.myfirstdraggerapplication.ui;

import com.example.myfirstdraggerapplication.data.local.DatabaseService;
import com.example.myfirstdraggerapplication.data.remote.NetworkService;

import javax.inject.Inject;


public class MainViewModel {
    private DatabaseService databaseService;
    private NetworkService networkService;

   @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
