package com.example.assignment_5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;


public class Frag1 extends Fragment {

    @Override
    public void onCreate(Bundle s1){
        super.onCreate(s1);
    }
    @Override
    public View onCreateView(LayoutInflater inf1, ViewGroup con1,Bundle s1){
        return inf1.inflate(R.layout.frag1,con1,false);

    }
}
