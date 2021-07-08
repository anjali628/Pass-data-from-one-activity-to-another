package com.example.passdatafromoneactivitytoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView showdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showdata=(TextView) findViewById(R.id.showinput);
        showdata.setText(getIntent().getStringExtra("data"));

    }
}