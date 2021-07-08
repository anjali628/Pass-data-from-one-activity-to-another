package com.example.passdatafromoneactivitytoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private EditText provideinput;
    private Button transferdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=(TextView) findViewById(R.id.textview);
        provideinput=(EditText) findViewById(R.id.provideinput);
        transferdata=(Button)findViewById(R.id.button);

        transferdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=provideinput.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("data",data);
                startActivity(intent);

            }
        });

    }
}