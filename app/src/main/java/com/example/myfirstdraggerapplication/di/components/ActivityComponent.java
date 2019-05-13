package com.example.myfirstdraggerapplication.di.components;


import com.example.myfirstdraggerapplication.di.modules.ActivityModule;
import com.example.myfirstdraggerapplication.scope.ActivityScope;
import com.example.myfirstdraggerapplication.ui.MainActivity;

import dagger.Component;
@ActivityScope
@Component(
       dependencies = {ApplicationComponent.class} ,modules = {ActivityModule.class})
public interface ActivityComponent {
     void inject(MainActivity mainActivity);

}
