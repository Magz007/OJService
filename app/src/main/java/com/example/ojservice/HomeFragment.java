package com.example.ojservice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

@SuppressLint("Registered")
public class HomeFragment extends FragmentActivity
{


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frangement_home, container, false);
    }


}
