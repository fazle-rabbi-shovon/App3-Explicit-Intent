package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvResult = findViewById(R.id.muri);
        String name = getIntent().getStringExtra("name");
        tvResult.setText(name+ ", Welcome to activity2");


    }
}
