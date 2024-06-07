package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class LogInActivity extends AppCompatActivity  {

    Button next_li;
    EditText etMail, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        next_li = findViewById(R.id.nextbtn_log);
        etMail = findViewById(R.id.mail_li);
        etPassword = findViewById(R.id.password_li);

        next_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AuthController authController = new AuthController();
                if (authController.isRegistered()) {
                    startActivity(new Intent(LogInActivity.this, Module1Activity.class));
                }

            }
        });
    }}
