package com.example.adaptersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/*
* adapter connects user interface and data sources
* bridget between adapter view and data
*1. need adapter view(like listview, grid view...), 2. data source  3.adapter
* */
public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //adapter - bridge bt ui and data source
        //1.adapter view (listview here) - used to show list of items ex-listview, gridview..
        listView=findViewById(R.id.listView);
        //2.data source - collection of strings
        String[] countries=new String[]{"USA","Germany","France","Saudi Arabia"};

        //3.adapter - binding data to views within adapter view (list view)
        //common adapters- array adapter- bind list of data to view-simple string
        //pre-defined layout for one single item - simple_list_item_1
        //using adapter we convert list into individual ui elements and then put to listview
//''''''''''''''''''''''''''
       // ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countries);
       // listView.setAdapter(adapter);
                  //or
//another type of adapter ..base adapter -more customizable-use subclass
       MyCustomAdapter adapter=new MyCustomAdapter(this,countries);
       listView.setAdapter(adapter);
    }
}

