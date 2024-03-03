package com.example.assignment_3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.secondactivity);
        Button b1 = findViewById(R.id.button2);
        Intent intent = getIntent();
        b1.setOnClickListener(v ->{
            Intent intent1 = new Intent(getApplicationContext(),First.class);
            startActivity(intent1);
        });
    }
}
