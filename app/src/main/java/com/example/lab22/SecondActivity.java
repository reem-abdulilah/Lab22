package com.example.lab22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView  receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg=(TextView)findViewById(R.id.received_value_id);

        Intent i=getIntent();



        receiver_msg.setText("Hello,"+i.getStringExtra("PersonName")+"!");

    }
}