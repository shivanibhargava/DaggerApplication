package com.example.myfirstdraggerapplication.di.components;

import com.example.myfirstdraggerapplication.di.modules.FragmentModule;
import com.example.myfirstdraggerapplication.scope.FragmentScope;
import com.example.myfirstdraggerapplication.ui.HomeFragment;

import dagger.Component;
@FragmentScope
@Component(dependencies = {ApplicationComponent.class} ,modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(HomeFragment homeFragment);
}

