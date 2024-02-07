package com.example.adaptersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //adapter - bridge bt ui and data source
        listView=findViewById(R.id.listView);
        //data source
        String[] countries={"USA","Germany","France","Saudi Arabia"};

        //adapter - data to ui elements
       // ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countries);
       MyCustomAdapter adapter=new MyCustomAdapter(this,countries);

        listView.setAdapter(adapter);
    }
}