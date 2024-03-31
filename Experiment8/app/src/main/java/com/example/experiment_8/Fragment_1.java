package com.example.experiment_8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_1 extends Fragment {
    @Override
    public void onCreate(Bundle savedinstancestates){
        super.onCreate(savedinstancestates);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1,Bundle savedinstancestates){
        return  inflater.inflate(R.layout.fragment_2,container1,false);
    }
}
