package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_li;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        next_li = findViewById(R.id.nextbtn_log);

        next_li.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent integer = new Intent(this, Module1Activity.class );
        startActivity(integer);
    }
}
