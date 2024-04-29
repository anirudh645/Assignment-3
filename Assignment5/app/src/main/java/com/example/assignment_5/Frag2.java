package com.example.assignment_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {
    @Override
    public void onCreate(Bundle s){
        super.onCreate(s);
    }
    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup con, Bundle s){
        View v = inf.inflate(R.layout.frag2,con,false);
        EditText e = v.findViewById(R.id.editTextText2);
        Button b = v.findViewById(R.id.button4);
        b.setOnClickListener(c ->{
            String str = e.getText().toString();
            Intent intent = new Intent(getContext(),second.class);
            intent.putExtra("Message",str);
            startActivity(intent);
        });
        return v;
    }
}
//
