package com.example.myfirstdraggerapplication.di.modules;

import com.example.myfirstdraggerapplication.ui.HomeFragment;

import dagger.Module;

@Module
public class FragmentModule {
    private HomeFragment homeFragment;
    public FragmentModule(HomeFragment homeFragment)
    {
        this.homeFragment=homeFragment;
    }

}
