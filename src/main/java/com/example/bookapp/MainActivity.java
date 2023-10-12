package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SetsModel>list;
    SetsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recycleView);

        list = new ArrayList<>();

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        list.add(new SetsModel("SET - 1"));
        list.add(new SetsModel("SET - 2"));
        list.add(new SetsModel("SET - 3"));
        list.add(new SetsModel("SET - 4"));
        list.add(new SetsModel("SET - 5"));
        list.add(new SetsModel("SET - 6"));
        list.add(new SetsModel("SET - 7"));
        list.add(new SetsModel("SET - 8"));
        list.add(new SetsModel("SET - 9"));
        list.add(new SetsModel("SET - 10"));

        adapter = new SetsAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }
}