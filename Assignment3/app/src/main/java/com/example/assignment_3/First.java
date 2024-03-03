package com.example.assignment_3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
public class First extends AppCompatActivity {
    Button b1 ;
    //TextView t1 = findViewById(R.id.textview0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),second.class);
            startActivity(intent);
        });
    }
}