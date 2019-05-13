package com.example.myfirstdraggerapplication.data.local;

import android.content.Context;

import com.example.myfirstdraggerapplication.qualifier.ApplicationContext;
import com.example.myfirstdraggerapplication.qualifier.DataBaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class DatabaseService {

    private Context context;
    private String databaseName;
    private int version;
  @Inject
    public DatabaseService(@ApplicationContext Context context, @DataBaseInfo String databaseName, int version) {
        this.context = context;
        this.databaseName = databaseName;
        this.version = version;
    }

    public String getDummyData() {
        return "DATABASE_DUMMY_DATA";
    }
}
