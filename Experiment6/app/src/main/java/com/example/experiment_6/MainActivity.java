package com.example.experiment_6;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button);
        e1 = findViewById(R.id.editTextText);
        b1.setOnClickListener(c ->{
            if(e1.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"Please Enter Email address",Toast.LENGTH_LONG).show();
            } else if (e1.getText().toString().equalsIgnoreCase("anirudh@gmail.com")) {
                    Intent i = new Intent(getApplicationContext(), second.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(),"Please Enter valid Email address",Toast.LENGTH_LONG).show();
            }
        });
    }
}