package com.example.experiment_10;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList arrayList;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=findViewById(R.id.searchView);
        listView=findViewById(R.id.listView);
        arrayList=new ArrayList();
        arrayList.add("Anirudh");
        arrayList.add("Aditya");
        arrayList.add("Shruti");
        arrayList.add("Phani");
        arrayList.add("Nikhil");
        arrayList.add("Varun");
        arrayList.add("Avinash");
        arrayList.add("Subhash");
        arrayList.add("Abhishek");
        arrayList.add("Sayantan");
        arrayList.add("Siddharth");
        arrayList.add("Abhinav");
        arrayList.add("Viplav");
        arrayList.add("Puneet");
        arrayList.add("Tarzan");
        arrayList.add("Badshah");
        arrayList.add("Jake");
        adapter=new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
