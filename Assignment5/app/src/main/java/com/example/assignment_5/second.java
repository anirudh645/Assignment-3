package com.example.assignment_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {
    protected void onCreate(Bundle sis) {
        super.onCreate(sis);
        setContentView(R.layout.second);
        Button b = (Button) findViewById(R.id.button2);
        TextView t = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("Message");
        if (str.equals("")) {
            t.setText("Empty");
        } else {
            t.setText(str);
        }
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent1);
                    }
                }
        );
    }

}
