package com.abdul.bajajfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {

    String[] countries = new String[]{"Russia","Ukraine","UK","Germany","US","China"}; //data = plug

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);   //inflating activity_recyclerview layoutinflater
        RecyclerView countriesRecyclerView = findViewById(R.id.countriesRview); //socket
    }
}