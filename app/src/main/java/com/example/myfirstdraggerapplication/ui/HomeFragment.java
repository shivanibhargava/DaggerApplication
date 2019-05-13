package com.example.myfirstdraggerapplication.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfirstdraggerapplication.MyApplication;
import com.example.myfirstdraggerapplication.R;
import com.example.myfirstdraggerapplication.di.components.DaggerApplicationComponent;
import com.example.myfirstdraggerapplication.di.components.DaggerFragmentComponent;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
@Inject  HomeViewModel homeViewModel;
  TextView tv;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerFragmentComponent.builder().applicationComponent(((MyApplication)getActivity().getApplication()).component)
        .build().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv=view.findViewById(R.id.tv);
        tv.setText(homeViewModel.getDataOnFragment());
    }
}
