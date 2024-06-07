package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_li;
    EditText mail, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        next_li = findViewById(R.id.nextbtn_log);
        mail = findViewById(R.id.mail_li);
        password = findViewById(R.id.password_li);

        next_li.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent integer = new Intent(LogInActivity.this, Module1Activity.class );
        startActivity(integer);
        finish();
    }
}
