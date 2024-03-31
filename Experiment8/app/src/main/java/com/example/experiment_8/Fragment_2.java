package com.example.experiment_8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_2 extends Fragment {
    @Override
    public void onCreate(Bundle savedinstancestate){
        super.onCreate(savedinstancestate);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedinstancestate){
        return  inflater.inflate(R.layout.fragment_1,container,false);
    }
}
