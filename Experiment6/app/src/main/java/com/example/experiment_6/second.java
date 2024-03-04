package com.example.experiment_6;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {
    protected void onCreate(Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.home);
        Intent i = getIntent();
    }
}
