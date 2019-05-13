package com.example.myfirstdraggerapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myfirstdraggerapplication.MyApplication;
import com.example.myfirstdraggerapplication.R;
import com.example.myfirstdraggerapplication.di.components.DaggerActivityComponent;
import com.example.myfirstdraggerapplication.di.modules.ActivityModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
//
//    @Inject
//    public  MainViewModel mainViewModel;
//   TextView maintext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,new HomeFragment())
                .commit();
//        maintext=(TextView) findViewById(R.id.maintext);
//
//
//        DaggerActivityComponent
//                .builder()
//                .activityModule(new ActivityModule(this))
//                .applicationComponent(((MyApplication)getApplication()).component)
//                .build()
//                .inject(this);
//        Log.d("DEBUG",mainViewModel.getSomeData());
//       maintext.setText(mainViewModel.getSomeData());
//        Log.e("****",mainViewModel.getSomeData());

    }
}
