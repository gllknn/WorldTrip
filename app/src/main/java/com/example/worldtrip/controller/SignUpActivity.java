package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_su;

    EditText mail, password, username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        next_su = findViewById(R.id.nextbtn_sign);
        mail = findViewById(R.id.mail_su);
        password = findViewById(R.id.password_su);
        username = findViewById(R.id.username_su);

        next_su.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent integer = new Intent(SignUpActivity.this, ComicActivity.class );
        startActivity(integer);
        finish();
    }

}