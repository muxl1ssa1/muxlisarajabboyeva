package com.example.calcapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history); // Referencing the XML layout

        // Initialize RecyclerView and History list
        RecyclerView rvHistory = findViewById(R.id.rv_history);
        List<String> historyList = new ArrayList<>();

        // For demo purposes, adding some dummy data to history list
        historyList.add("5 + 3 = 8");
        historyList.add("12 / 4 = 3");
        historyList.add("7 * 6 = 42");

        // Set up RecyclerView
        HistoryAdapter historyAdapter = new HistoryAdapter(historyList);
        rvHistory.setLayoutManager(new LinearLayoutManager(this));
        rvHistory.setAdapter(historyAdapter);
    }
}
