package com.example.experiment_7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.experiment_7.R.id;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    EditText e1,e2,e3;
    RadioButton rb1,rb2;
    Button b1,b2;
    TextView selectedDateTV,finals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editTextText);
        e2 = (EditText)findViewById(R.id.editTextTextPassword);
        e3 = (EditText) findViewById(R.id.editTextText2);
        rb1 = (RadioButton) findViewById(R.id.radioButton5);
        rb2 = (RadioButton)findViewById(R.id.radioButton7);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button)findViewById(id.button2);
        selectedDateTV = (TextView) findViewById(id.textView);
        finals = (TextView) findViewById(id.textView8);
        String selectedDate;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name ,password,address,date,gender,ss;
                name = e1.getText().toString();
                password= e2.getText().toString();
                address = e3.getText().toString();
                date = selectedDateTV.getText().toString();
                if(rb1.isActivated()) {
                    gender = "Female";
                }else{
                    gender="Male";
                }
                ss= "Name: "+name+"\nPassword: "+password+"\nGender: "+gender+"\nAddress: "+address+"\nDate of Birth: "+date;
                finals.setText(ss);
            }
        });

    }
    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this, year, month, day);
        datePickerDialog.show();
    }
    @Override
    public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
        String selectedDate = formatDate(selectedYear, selectedMonth, selectedDay);
        if (selectedDateTV != null) {
            selectedDateTV.setText(selectedDate);
        }
    }
    private String formatDate(int year, int month, int day) {
        // Customize date formatting as needed
        return year + "-" + (month + 1) + "-" + day; // Adjust month for zero-based indexing
    }


}